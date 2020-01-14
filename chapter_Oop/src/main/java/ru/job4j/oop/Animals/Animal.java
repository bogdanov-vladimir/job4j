package ru.job4j.oop.Animals;

public class Animal {
    String name;

    public Animal() {
        System.out.println("I`m Animal!");
    }

    public Animal(String name) {
        this.name = name;
        System.out.println("I`m Animal, "+ name);
    }
}
