package org.jadhav;


import org.jadhav.model.Alien;
import org.jadhav.model.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien alien = applicationContext.getBean("alien", Alien.class);
        alien.code();
        System.out.println(alien);

    }
}