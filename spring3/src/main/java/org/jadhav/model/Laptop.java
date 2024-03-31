package org.jadhav.model;

public class Laptop implements Computer{
    private String name = "lap";

//    public Laptop(){
//        System.out.println("Laptop obj created.");
//    }

    @Override
    public void compile() {
        System.out.println("compiling from Laptop");
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                '}';
    }
}
