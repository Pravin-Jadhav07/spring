package org.jadhav;

import org.jadhav.model.Alien;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien alien = (Alien) applicationContext.getBean("alien");
        alien.code();
        System.out.println(alien);

    }
}