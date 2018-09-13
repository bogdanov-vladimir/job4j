package ru.job4j.converter;

/**
 * Конвертер валюты
 */
public class Converter {

    /**
     * Курс доллара на текущий день
     */
    private int courseDollar = 60;
    /**
     * Курс рубля на текущий день
     */
    private int courseEuro = 80;

    /**
     * Рубли в евро
     * @param ruble
     * @return ruble/courseEuro
     */
    public int rubleToEuro(int ruble) {
        return ruble / courseEuro;
    }

    /**
     * Рубли в доллары
     * @param ruble
     * @return ruble/courseDollar
     */
    public int rubleToDollar(int ruble) {
        return ruble / courseDollar;
    }

    /**
     * Доллар в рубли
     * @param dollar
     * @return dollar*courseDollar
     */
    public int dollarToRuble(int dollar) {
        return dollar * courseDollar;
    }

    /**
     * Евро в рубли
     * @param euro
     * @return euro*courseEuro
     */
    public int euroToRuble(int euro) {
        return euro * courseEuro;
    }
}
