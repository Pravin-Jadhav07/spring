package org.jadhav.model;

public class Alien {
    private int age;
    private Com com;

    public void code(){
        com.compile();
        System.out.println("codinggg....");
    }
    public Alien(){
        System.out.println("alien obj created.");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Com getCom() {
        return com;
    }

    public void setCom(Com com) {
        this.com = com;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "age=" + age +
                ", com=" + com +
                '}';
    }
}
