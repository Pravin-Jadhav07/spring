package org.jadhav.model;

public class Alien {
    private int age;
    private Computer com;

//    public Alien(){
//        System.out.println("Alien obj created.");
//    }
    public void code(){
        System.out.println("codding...");
        com.compile();
    }

    @Override
    public String toString() {
        System.out.println();
        return "Alien{" +
                "age=" + age +
                ", com=" + com +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }
}
