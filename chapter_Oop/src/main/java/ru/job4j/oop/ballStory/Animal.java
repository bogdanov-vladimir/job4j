package ru.job4j.oop.ballStory;

public class Animal {
    private String name;
    private String answer;

    public Animal(String sName) {
        this.name = sName;
        this.answer = "Я тебя съем!";
    }

    public String getName() {
        System.out.println("Привет, я "+ this.name);

        return name;
    }

    public void niamniam() {
        System.out.println("Я тебя съем!");
    }
}
