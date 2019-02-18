package ru.job4j.array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 *
 * @author Администратор
 */
public class BubbleSortTest {
    @Test
    public void whenBubbleSort() {
        BubbleSort bubbleSort = new BubbleSort();
        
        int[] inArr = {1, 5, 4, 0, 10};
        int[] result = {0, 1, 4, 5, 10};
        int[] resultFunc = bubbleSort.sortBubble(inArr);
        assertThat(result, is(resultFunc));
        
        inArr = new int[] {1, 5, 4, 0, 0, 10};
        result = new int[] {0, 0, 1, 4, 5, 10};
        resultFunc = bubbleSort.sortBubble(inArr);
        
        assertThat(result, is(resultFunc));
        
    }
}
