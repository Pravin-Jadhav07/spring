package org.jadhav;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        Alien alien = (Alien) applicationContext.getBean("alien");
        alien.code();
        System.out.println(alien.hashCode());

        Alien alien1 = (Alien) applicationContext.getBean("alien");
        alien1.code();
        System.out.println(alien1.hashCode());


    }
}