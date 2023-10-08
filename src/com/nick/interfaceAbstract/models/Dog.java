package com.nick.interfaceAbstract.models;

public class Dog implements Animal{


    @Override
    public void name() {
        System.out.println("Palle");
    }

    @Override
    public void move() {
        System.out.println("Zooming");
    }

    @Override
    public void eat() {
        System.out.println("chomp");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeps 50% of the time");
    }

    @Override
    public void makeSound() {
        System.out.println("voff voff");
    }
}
