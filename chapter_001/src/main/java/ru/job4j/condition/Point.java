package ru.job4j.condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Расчет расстояния между двумя точками в системе координат
 */
public class Point {
    /**
     * Начальная точка оси X
     */
    private int x;
    /**
     * Начальная точка оси Y
     */
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * расчет дистанции от точка А в B
     * @param that - Точка назначения
     * @return Расстояние между двумя точками в системе координат
     */
    public double distanceTo(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        /*Point a = new Point(0, 1);
        Point b = new Point(2, 5);

        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);

        double result = a.distanceTo(b);

        System.out.println("Расстояние между точками = " + result);*/

        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distanceTo(b);
        System.out.println(dist);
    }
}
