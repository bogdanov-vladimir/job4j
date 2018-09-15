package ru.job4j.calculator;

/**
 * Расчет идеального веса
 */
public class Fit {
    /**
     * Коэфициент общий
     */
    private double koef = 1.15;
    /**
     * Коэфициент от роста у мужчин
     */
    private double koefHeightMan = 100;
    /**
     * Коэффициент от раста у женщин
     */
    private double koefHeigtWoman = 110;

    /**
     * Идеальный вес для мужчин
     * @param height рост
     * @return идеальный вес
     */
    public double manWeight(double height) {
        return (height - koefHeightMan) * koef;
    }

    /**
     * Идеальный вес для женщин
     * @param height рост
     * @return идеальный вес
     */
    public double womanWeigth(double height) {
        return (height - koefHeigtWoman) * koef;
    }

}
