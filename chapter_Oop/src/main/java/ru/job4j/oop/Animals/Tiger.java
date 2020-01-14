package ru.job4j.oop.Animals;

public class Tiger extends Predator {
    public Tiger() {
        super();
        System.out.println("I`m Tiger!");
    }

    public Tiger(String name) {
        super(name);
    }
}
