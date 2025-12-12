package com.ing.zoo;

import java.util.Random;

public class Tiger extends Animal implements Carnivore, TrickAnimal {
    private String helloText;
    private String eatText;
    private String trick;
    private final Random random = new Random();

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        helloText = "rraaarww";
        System.out.println(name + " says: " + helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom oink wubalubadubdub";
        System.out.println(name + " eats: " + eatText);
    }

    @Override
    public void performTrick() {
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "jumps in tree";
        } else {
            trick = "scratches ears";
        }
        System.out.println(name + " " + trick);
    }
}