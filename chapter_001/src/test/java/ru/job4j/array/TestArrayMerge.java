package ru.job4j.array;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestArrayMerge {    
    @Test
    public void whenBothEmpty() {
        ArrayMerge algo = new ArrayMerge();
        int[] expect = new int[0];
        int[] result = algo.merge(
                new int[0],
                new int[0]
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenAscOrder() {
        ArrayMerge algo = new ArrayMerge();
        int[] expect = {1, 2, 3, 4};
        int[] result = algo.merge(
                new int[] {1, 2},
                new int[] {3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftLess() {
        ArrayMerge algo = new ArrayMerge();
        int[] expect = {1, 2, 3, 3, 4};
        int[] result = algo.merge(
                new int[] {1, 2, 3},
                new int[] {3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftGreat() {
        ArrayMerge algo = new ArrayMerge();
        int[] expect = {1, 2, 3, 4, 4};
        int[] result = algo.merge(
                new int[] {1, 2},
                new int[] {3, 4, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftEmpty() {
        ArrayMerge algo = new ArrayMerge();
        int[] expect = {1, 3, 4, 4};
        int[] result = algo.merge(
                new int[] {},
                new int[] {1, 3, 4, 4}
        );
        assertThat(result, is(expect));
    }    
}
