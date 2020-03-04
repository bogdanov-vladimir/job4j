package ru.job4j.oop.encapsulation;

public class Config {
    private String name;
    private int positions;
    private String[] properties;

    public Config(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(positions);
    }

    public String getProperty(String key) {
        return searchKey(key);
    }

    private String searchKey(String key) {
        return  key;
    }

}
