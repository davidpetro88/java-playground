//package br.com.dimed.v1.controller;
//
//import br.com.dimed.v1.exception.InvalidUserIdException;
//import br.com.dimed.v1.exception.ModelNotFoundException;
//import br.com.dimed.v1.exception.PersistentException;
//import br.com.dimed.v1.exception.ValidationException;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@RestControllerAdvice
//public class AppRestControllerAdvice {
//
//    private final static String MESSAGE = "message";
//
//
//    @ExceptionHandler(value = {ModelNotFoundException.class})
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    public Map<String, String> handleModelNotFoundException(Exception ex) {
//        Map<String, String> errorMap = new HashMap<>();
//        errorMap.put(MESSAGE, ex.getMessage());
//        return errorMap;
//    }
//
//
//    @ExceptionHandler(value = {ValidationException.class, InvalidUserIdException.class, PersistentException.class})
//    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
//    public Map<String, String> handleValidationRelatedExceptions(Exception ex) {
//        Map<String, String> errorMap = new HashMap<>();
//        errorMap.put(MESSAGE, ex.getMessage());
//        return errorMap;
//    }
//}
