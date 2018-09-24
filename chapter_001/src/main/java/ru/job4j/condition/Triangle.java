package ru.job4j.condition;

/**
 * Площадь треугольника
 */
public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Вычисляет полупериметр
     * @param ab расстояние от точки А - B
     * @param ac расстояние от точки А - C
     * @param bc расстояние от точки B - C
     * @return P
     */
    private double period(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }

    /**
     * Проверка сумм каждых 2 сторон по отношению к третьей стороне
     * @param ab расстояние от точки А - B
     * @param ac расстояние от точки А - C
     * @param bc расстояние от точки B - C
     * @return
     */
    private boolean exist(double ab, double ac, double bc) {
        boolean result = false;

        if ((ab + bc) > ac && (bc + ac) > ab && (ac + ab) > bc) {
            result = true;
        }

        return result;
    }

    /**
     * Вычисляет площадь
     * @return S
     */
    public double area() {
        double result = -1;
        double ab = this.a.distanceTo(this.b);
        double ac = this.a.distanceTo(this.c);
        double bc = this.b.distanceTo(this.c);
        double period = this.period(ab, ac, bc);

        if (this.exist(ab, ac, bc)) {
            result = Math.sqrt(period * (period - ab) * (period - ac) * (period - bc));
        }

        return result;
    }

}
