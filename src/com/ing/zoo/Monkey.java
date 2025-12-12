package com.ing.zoo;

import java.util.Random;

public class Monkey extends Animal implements Herbivore, Carnivore, TrickAnimal {
    private String helloText;
    private String eatText;
    private String trick;
    private final Random random = new Random();

    public Monkey(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        helloText = "oe oe aa aa!";
        System.out.println(name + " says: " + helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch banana";
        System.out.println(name + " eats: " + eatText);
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom insects";
        System.out.println(name + " eats: " + eatText);
    }

    @Override
    public void performTrick() {
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "climbs high in a tree";
        } else {
            trick = "throws a banana";
        }
        System.out.println(name + " " + trick);
    }
}