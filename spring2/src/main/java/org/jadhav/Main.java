package org.jadhav;

import org.jadhav.model.Alien;
import org.jadhav.model.Laptop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Alien alien = (Alien) applicationContext.getBean("alien");
        // normal way
//        alien.setAge(23);
//        alien.setLap((Laptop) applicationContext.getBean("laptop"));

        // setter and constructor injection wtrite in resources/spring.xml file.

        alien.code();
        System.out.println(alien);


    }
}