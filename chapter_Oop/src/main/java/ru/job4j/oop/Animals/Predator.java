package ru.job4j.oop.Animals;

public class Predator extends Animal {
    public Predator() {
        super();
        System.out.println("I`m Predator!");
    }

    public Predator(String name) {
        super(name);
    }
}
