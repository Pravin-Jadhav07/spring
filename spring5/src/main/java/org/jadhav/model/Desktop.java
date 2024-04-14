package org.jadhav.model;

public class Desktop implements Com{
    public Desktop(){
        System.out.println("desktop obj created..");
    }
    @Override
    public void compile() {
        System.out.println("compiling from desktop...");
    }
    @Override
    public String toString() {
        return "Desktop{}";
    }
}
