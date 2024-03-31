package org.jadhav.model;

public class Alien {
    private int age;
    private Laptop lap;
    public Alien(){
        System.out.println("Alien default constructor.");
    }

    public Alien( int age ,Laptop laptop ){
        System.out.println("Alien parameterized constructor.");
        this.lap = laptop;
        this.age = age;
    }
    public  void  code(){
        System.out.println("Codding...");
    }

    @Override
    public String toString() {
        return "Alien{" +
                "age=" + age +
                ", laptop=" + lap +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        System.out.println("laptop setter from Alien.");
        this.lap = lap;
    }

}
