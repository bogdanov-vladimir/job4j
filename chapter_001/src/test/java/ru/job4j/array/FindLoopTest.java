/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.job4j.array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 *
 * @author Администратор
 */
public class FindLoopTest {
    @Test
    public void whenIndexOf() {
        FindLoop findLoop = new FindLoop();
        int[] arrTest = {1, 5, 7, 20 };
        
        int resultFunc = findLoop.indexOf(arrTest, 7);
        int result = 2;
        
        assertThat(result, is(resultFunc));
        
        resultFunc = findLoop.indexOf(arrTest, 50);
        result = -1;
        assertThat(result, is(resultFunc));
    }
}
