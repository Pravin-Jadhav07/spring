package org.jadhav.model;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("laptop")
@Primary
public class Laptop implements Com {
    public Laptop(){
        System.out.println("laptop obj created.");
    }

    @Override
    public void compile() {
        System.out.println("compiling from laptop...");
    }

    @Override
    public String toString() {
        return "Laptop{}";
    }
}
