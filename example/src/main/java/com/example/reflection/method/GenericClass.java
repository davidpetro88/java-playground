package com.example.reflection.method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class GenericClass {

  private final Object newInstaceClass;
  private final Class<?> className;

  public GenericClass(String fullyQualifiedNameClass) throws Exception {
    this.className = Class.forName(fullyQualifiedNameClass);
    this.newInstaceClass = this.className.getDeclaredConstructor().newInstance();
  }

  public Object callMethod(String methodCall, Map<String, Object> mapParam) throws InvocationTargetException,
    IllegalAccessException {
    Method method = method(getMethodPredicateWithParam(methodCall, mapParam));
    return method.invoke(newInstaceClass, getParameterRequest(mapParam, method).toArray());
  }

  public Object callMethod(String methodCall) throws InvocationTargetException, IllegalAccessException {
    return method(getMethodPredicate(methodCall))
      .invoke(newInstaceClass);
  }

  private List<Object> getParameterRequest(Map<String, Object> mapParam, Method method) {
    List<Object> parameterList = new ArrayList<>();
    Stream.of(method.getParameters()).forEach(p -> parameterList.add(mapParam.get(p.getName())));
    return parameterList;
  }

  private Method method(Predicate<Method> methodPredicateWithParam) {
    return Stream.of(className.getDeclaredMethods())
      .filter(methodPredicateWithParam)
      .findFirst()
      .orElseThrow(() -> new RuntimeException("Method not found"));
  }

  private Predicate<Method> getMethodPredicate(String methodCall) {
    return methodName -> methodName.getName().equals(methodCall);
  }

  private Predicate<Method> getMethodPredicateWithParam(String methodCall, Map<String, Object> mapParam) {
    return methodName -> methodName.getName().equals(methodCall) &&
    methodName.getParameterCount() == mapParam.values().size() &&
    Stream.of(methodName.getParameters())
      .allMatch(arg -> mapParam.keySet().contains(arg.getName()) &&
        mapParam.get(arg.getName()).getClass().equals(arg.getType()));
  }

}
