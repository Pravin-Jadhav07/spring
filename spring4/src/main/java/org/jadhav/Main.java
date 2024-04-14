package org.jadhav;


import org.jadhav.model.Alien;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // if this line executes all the beans are created if scope is singleton
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        // if we configure lazy-init="true" in beans only used objects are created.
        Alien alien = (Alien) applicationContext.getBean("alien");
        System.out.println(alien);



        // getbean by id we used in above
        // now getbean by type
        Alien alien1 = applicationContext.getBean(Alien.class);
        System.out.println(alien1);
        // another way mention id and class both
        Alien alien2 = applicationContext.getBean("alien", Alien.class);
        System.out.println(alien2);

        // here problem will occur when two classes implents same and we specify parent
        // then it will throw expeption i.e. expecting 1 found 2
        // to overcome this issue use primary 

    }
}