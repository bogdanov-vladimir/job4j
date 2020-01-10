package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public String show() {
        return "I`m "+ this.name +", my food: "+ this.food;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }
}
