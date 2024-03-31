package org.jadhav.model;

public class Desktop implements Computer{
    private String name = "desk";
//    public Desktop(){
//        System.out.println("Desctop obj created.");
//    }

    @Override
    public void compile() {
        System.out.println("compiling from Desctop");
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "name='" + name + '\'' +
                '}';
    }
}
