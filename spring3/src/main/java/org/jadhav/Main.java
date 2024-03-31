package org.jadhav;


import org.jadhav.model.Alien;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Alien alien = (Alien) applicationContext.getBean("alien");
//        from code() method of Alien class we called compile method
        alien.code();
        System.out.println(alien);


    }
}