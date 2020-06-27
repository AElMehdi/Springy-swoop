package com.aelmehdi.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.System.*;

public class XmlConfigurationDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        Computer computer = context.getBean("computer", Computer.class);
        Computer computer2 = context.getBean("computer", Computer.class);

        HardDrive hardDrive2 = context.getBean("hardDrive", HardDrive.class);

        out.println("There" + howManyBeans(computer, computer2) + "computer(s)");
        out.println("There" + howManyBeans(computer.getHardDrive(), hardDrive2) + "hard drive(s)");

        computer.gotScreen();
        computer.hardDriveSize();

        context.registerShutdownHook(); // Ensures a graceful shutdown
    }

    private static String howManyBeans(Object bean, Object bean2) {
        if (bean == bean2) {
            return " is one ";
        }
        return " are multiple ";
    }
}
