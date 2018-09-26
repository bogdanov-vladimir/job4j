package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial fact = new Factorial();
        int resultFunc = fact.calc(5);
        int result = 120;
        assertThat(result, is(resultFunc));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial fact = new Factorial();
        int resultFunc = fact.calc(0);
        int result = 1;
        assertThat(result, is(resultFunc));
    }
}
