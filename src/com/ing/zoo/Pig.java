package com.ing.zoo;

import java.util.Random;

public class Pig extends Animal implements Herbivore, Carnivore, TrickAnimal {
    private String helloText;
    private String eatText;
    private String trick;
    private final Random random = new Random();

    public Pig(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        helloText = "oink oink";
        System.out.println(name + " says: " + helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch oink";
        System.out.println(name + " eats: " + eatText);
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom oink thx";
        System.out.println(name + " eats: " + eatText);
    }

    @Override
    public void performTrick() {
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "rolls in the mud";
        } else {
            trick = "runs in circles";
        }
        System.out.println(name + " " + trick);
    }
}