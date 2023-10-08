package com.nick.interfaceAbstract.models;

public class Cat implements Animal {


    @Override
    public void name() {
        System.out.println("Balle");
    }

    @Override
    public void move() {
        System.out.println("Moves carefully");
    }

    @Override
    public void eat() {
        System.out.println("om nom nom");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeps 80% of the time");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }
}
