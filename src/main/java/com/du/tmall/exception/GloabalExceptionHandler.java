package com.du.tmall.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@ControllerAdvice
public class GloabalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public String defaultErrorHandler(HttpServletRequest req,Exception e) throws
            Exception {
        e.printStackTrace();
        Class constrainViolationException = Class.forName("org.hibernate.exception.ConstraintViolationException");
        if(null !=e.getCause() && constrainViolationException ==e.getCause().getClass()){
            return "error";
        }
        return e.getMessage();
    }
}
