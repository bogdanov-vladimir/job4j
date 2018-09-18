package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static  org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void calcPoint() {
        Point point = new Point(1, 2);
        double resultFunc = point.distanceTo(new Point(5, 6));
        double result = 5.66;
        assertThat(resultFunc, closeTo(result, 0.1));
    }

}
