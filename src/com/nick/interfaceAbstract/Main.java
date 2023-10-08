package com.nick.interfaceAbstract;

import com.nick.interfaceAbstract.models.Cat;
import com.nick.interfaceAbstract.models.Dog;

public class Main {
    public static void main(String[] args) {


        //Instantiate objects
        Cat Balle = new Cat();
        Dog Palle = new Dog();

        Balle.name();
        Balle.eat();
        Balle.move();
        Balle.makeSound();
        Balle.sleep();
        Balle.typeOfAnimal("Cat"); // Default method

        Palle.name();
        Palle.eat();
        Palle.move();
        Palle.makeSound();
        Palle.sleep();
        Palle.typeOfAnimal("Dog"); // Default method

    }
}
