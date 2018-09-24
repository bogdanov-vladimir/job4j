package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static  org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void thereCalcTriangle() {
        Point a = new Point(1, 1);
        Point b = new Point(3, 3);
        Point c = new Point(1, 6);
        Triangle triangle = new Triangle(a, b, c);

        double resultFunc = triangle.area();
        double result = 4.988;

        assertThat(resultFunc, closeTo(result, 0.1));
    }
}
