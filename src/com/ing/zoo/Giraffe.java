package com.ing.zoo;

import java.util.Random;

public class Giraffe extends Animal implements Herbivore, TrickAnimal {
    private String helloText;
    private String eatText;
    private String trick;

    public Giraffe(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        helloText = "hmmm hmmm (giraffe noises)";
        System.out.println(name + " says: " + helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch tasty tall leaves";
        System.out.println(name + " eats: " + eatText);
    }

    @Override
    public void performTrick() {
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "bends down gracefully";
        } else {
            trick = "swings its long neck";
        }
        System.out.println(name + " " + trick);
    }
}