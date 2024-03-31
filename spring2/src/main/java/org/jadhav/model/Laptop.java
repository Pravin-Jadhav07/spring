package org.jadhav.model;

public class Laptop {
    private String name;
    public Laptop(){
        System.out.println("loptop constructor.");
    }
    public void compile(){
        System.out.println("compiling....");
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
