package com.aelmehdi.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.System.*;

public class XmlConfigurationDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        Computer laptop = context.getBean("laptop", Computer.class);
        Computer computer2 = context.getBean("laptop", Computer.class);
        Computer pc = context.getBean("pc", Computer.class);

        HardDrive hardDrive2 = context.getBean("hardDrive", HardDrive.class);

        out.println("There" + howManyBeans(laptop, computer2) + "computer(s)");
        out.println("There" + howManyBeans(laptop.getHardDrive(), hardDrive2) + "hard drive(s)");

        out.println("The laptop hard drive size is: " + laptop.getHardDrive().getSize());
        out.println("The PC hard drive size is: " + pc.getHardDrive().getSize());

        laptop.gotScreen();
        laptop.hardDriveSize();

        context.registerShutdownHook(); // Ensures a graceful shutdown
    }

    private static String howManyBeans(Object bean, Object bean2) {
        if (bean == bean2) {
            return " is one ";
        }
        return " are multiple ";
    }
}
