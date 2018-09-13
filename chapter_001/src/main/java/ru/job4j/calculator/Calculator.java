package ru.job4j.calculator;

public class Calculator {
    private double result;

    /**
    * add
    * @param first : first, second : second
    * return void
    */
    public void add(double first, double second) {
        result = first + second;
    }

    /**
     * substract
     * @param first : first, second : second
     * @return void
     */
    public void substract(double first, double second) {
        result = first - second;
    }

    /**
     * div
     * @param first : first, second : second
     * @return void
     */
    public void div(double first, double second) {
        if (second > 0) {
            result = first / second;
        } else {
            result = 0;
        }
    }

    /**
     * div
     * @param first : first, second : second
     * @return void
    */
    public void multiple(double first, double second) {
        result = first * second;
    }

    public double getResult() {
        return this.result;
    }
}
