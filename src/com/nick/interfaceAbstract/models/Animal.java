package com.nick.interfaceAbstract.models;

// Abstract - Inheritance (arv)
// As a Standard, methods are 'PUBLIC'
// Uses keyword: implements
public interface Animal {



    // Abstract Method
    void name();
    void move();
    void eat();
    void sleep();
    void makeSound();


    // Default???
    public default void typeOfAnimal(String typeOfAnimal){
        System.out.println(typeOfAnimal);
    }

}
