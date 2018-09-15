package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static  org.junit.Assert.assertThat;

public class FitTest {
    @Test
    public void manWeigth() {
        Fit fit = new Fit();
        double resultFunc = fit.manWeight(170);
        double result = 80.5;
        assertThat(resultFunc, closeTo(result, 0.1));
    }

    @Test
    public void womanWeigth() {
        Fit fit = new Fit();
        double resultFunc = fit.womanWeigth(170);
        double result = 69;
        assertThat(resultFunc, closeTo(result, 0.1));
    }
}
