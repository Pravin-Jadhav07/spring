package org.jadhav.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope("prototype")
//    public Alien alien(@Autowired Com com){
    public Alien alien(@Qualifier("desktop")Com com){ // another way
        Alien alien =  new Alien();

        alien.setAge(25);
//        alien.setCom(desktop());  // tightly coupled
        alien.setCom(com);   // loose coupling. (better)

        return alien;
    }

    @Bean
    @Primary
    public Laptop laptop(){
        return new Laptop();
    }
    @Bean
    public Desktop desktop(){
        return new Desktop();
    }
}
