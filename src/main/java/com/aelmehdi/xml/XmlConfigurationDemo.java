package com.aelmehdi.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.System.*;

public class XmlConfigurationDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        Computer computer = context.getBean("computer", Computer.class);
        Computer computer2 = context.getBean("computer", Computer.class);

        out.println("There" + howManyBeans(computer, computer2) + "computer(s)");

        computer.gotScreen();
        computer.hardDriveSize();
    }

    private static String howManyBeans(Computer computer, Computer computer2) {
        if (computer == computer2) {
            return " is one ";
        }
        return "are multiple";
    }
}
