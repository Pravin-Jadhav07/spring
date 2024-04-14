package org.jadhav.model;

public class Laptop implements Com {
    public Laptop(){
        System.out.println("laptop obj created.");
    }

    @Override
    public void compile() {

    }

    @Override
    public String toString() {
        return "Laptop{}";
    }
}
