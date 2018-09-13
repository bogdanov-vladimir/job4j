package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOneAndOneThenTwo() {
        Calculator caclulator = new Calculator();
        caclulator.add(1D, 1D);
        double result = caclulator.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSubstractOneAndOneThenTwo() {
        Calculator caclulator = new Calculator();
        caclulator.substract(1D, 1D);
        double result = caclulator.getResult();
        double expected = 0;
        assertThat(result, is(expected));
    }

    @Test
    public void whenDivOneAndOneThenTwo() {
        Calculator caclulator = new Calculator();
        caclulator.div(1D, 1D);
        double result = caclulator.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenMultipleOneAndOneThenTwo() {
        Calculator caclulator = new Calculator();
        caclulator.multiple(1D, 1D);
        double result = caclulator.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
}