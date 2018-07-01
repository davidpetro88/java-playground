package reflection.java9.ex1;

import reflection.java9.SubController;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Application {


    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<SubController> subControllerClass = SubController.class;
        Class<?> subControllerClass2 = Class.forName("reflection.java9.SubController");
        Class<?> controllerClass = Class.forName("reflection.java9.Controller");

        Constructor<SubController> publicConstructorSubController = subControllerClass.getConstructor();
        Constructor<SubController> privateConstructorWithParamSubController = subControllerClass.getDeclaredConstructor(String.class);
        System.out.println(publicConstructorSubController);
        System.out.println(privateConstructorWithParamSubController);

        privateConstructorWithParamSubController.newInstance();
    }
}
