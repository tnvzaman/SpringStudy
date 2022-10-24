package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

        objA.getMessage();
        context.registerShutdownHook();

//        objA.setMessage("I'm Object A");
//        objA.getMessage();
//
//        HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
//        objB.getMessage();

    }
}
