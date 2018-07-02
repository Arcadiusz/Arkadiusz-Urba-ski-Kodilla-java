package com.kodilla.spring.message;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        HelloWorld hello = context.getBean(HelloWorld.class);
        hello.setMessage("Hello World");
        hello.getMessage();
    }
}
