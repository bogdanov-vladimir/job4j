package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whereMaxNumber() {
        Max max = new Max();
        int resultFuncOne = max.max(5, 15);
        int resultFuncTwo = max.max(15, 5);
        int resultFuncThreeOne = max.max(15, 5, 10);
        int resultFuncThreeTwo = max.max(5, 10, 15);
        int resultFuncThreeThree = max.max(10, 15, 5);
        int result = 15;

        assertThat(result, is(resultFuncOne));
        assertThat(result, is(resultFuncTwo));
        assertThat(result, is(resultFuncThreeOne));
        assertThat(result, is(resultFuncThreeTwo));
        assertThat(result, is(resultFuncThreeThree));
    }
}
