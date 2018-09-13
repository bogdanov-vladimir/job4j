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
     */
    public int rubleToEuro (int ruble) {
        return ruble*courseEuro;
    }

    /**
     * Рубли в доллары
     * @param ruble
     * @return
     */
    public int rubleToDollar (int ruble) {
        return ruble*courseDollar;
    }
}
