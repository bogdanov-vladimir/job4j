package ru.job4j.oop;

public class JsonReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        return "{name:"+ name +", body: "+ body +"}";
    }
}
