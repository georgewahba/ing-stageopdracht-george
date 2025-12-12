package com.ing.zoo;

public class Zebra extends Animal implements Herbivore {
    private String helloText;
    private String eatText;

    public Zebra(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        helloText = "zebra zebra";
        System.out.println(name + " says: " + helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch zank yee bra";
        System.out.println(name + " eats: " + eatText);
    }
}