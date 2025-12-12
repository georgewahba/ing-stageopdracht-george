package com.ing.zoo;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        // Uitvoerbare commands
        String CMD_HELLO = "hello";
        String CMD_GIVE_LEAVES = "give leaves";
        String CMD_GIVE_MEAT = "give meat";
        String CMD_PERFORM_TRICK = "perform trick";

        // dieren met hun naam als argument meegegeven
        Lion henk = new Lion("henk");
        Hippo elsa = new Hippo("elsa");
        Pig dora = new Pig("dora");
        Tiger wally = new Tiger("wally");
        Zebra marty = new Zebra("marty");
        Giraffe gemma = new Giraffe("gemma");
        Monkey mo = new Monkey("mo");

        Animal[] animals = new Animal[] {
                henk, elsa, dora, wally, marty, gemma, mo
        };

        // voor gebruiksgemak, print de beschikbare commands
        Scanner scanner = new Scanner(System.in);
        System.out.println("Beschikbare commands:");
        System.out.println("hello");
        System.out.println("hello <naam>");
        System.out.println("give leaves");
        System.out.println("give meat");
        System.out.println("perform trick");
        System.out.println();

        System.out.print("Voer uw command in: ");
        String input = scanner.nextLine().trim();

        if (input.startsWith(CMD_HELLO)) {
            String[] parts = input.split("\\s+");
            if (parts.length == 1) {
                for (Animal animal : animals) {
                    animal.sayHello();
                }
            } else if (parts.length == 2) {
                String name = parts[1];
                boolean found = false;
                for (Animal animal : animals) {
                    if (animal.getName().equalsIgnoreCase(name)) {
                        animal.sayHello();
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Er is geen dier met de naam: " + name);
                }
            } else {
                System.out.println("Ongeldige hello command. Gebruik: 'hello' of 'hello <naam>'.");
            }
        } else if (input.equalsIgnoreCase(CMD_GIVE_LEAVES)) {
            // Alle herbivores krijgen bladeren
            for (Animal animal : animals) {
                if (animal instanceof Herbivore) {
                    ((Herbivore) animal).eatLeaves();
                }
            }
        } else if (input.equalsIgnoreCase(CMD_GIVE_MEAT)) {
            // Alle carnivores krijgen vlees
            for (Animal animal : animals) {
                if (animal instanceof Carnivore) {
                    ((Carnivore) animal).eatMeat();
                }
            }
        } else if (input.equalsIgnoreCase(CMD_PERFORM_TRICK)) {
            // Alle dieren die een truc kunnen doen
            for (Animal animal : animals) {
                if (animal instanceof TrickAnimal) {
                    ((TrickAnimal) animal).performTrick();
                }
            }
        } else {
            System.out.println("Unknown command: " + input);
        }

        scanner.close();
    }
}