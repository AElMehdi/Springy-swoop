package com.aelmehdi.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoXml {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        Computer computer = (Computer) context.getBean("computer");
        computer.gotScreen();
    }
}
