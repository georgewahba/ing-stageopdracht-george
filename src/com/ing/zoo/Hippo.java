package com.ing.zoo;

public class Hippo extends Animal implements Herbivore {
    private String helloText;
    private String eatText;

    public Hippo(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        helloText = "splash";
        System.out.println(name + " says: " + helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch lovely";
        System.out.println(name + " eats: " + eatText);
    }
}