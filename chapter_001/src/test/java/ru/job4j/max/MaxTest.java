package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whereMaxNumber() {
        Max max = new Max();
        int resultFunc = max.max(5, 15);
        int result = 15;

        assertThat(result, is(resultFunc));
    }
}
