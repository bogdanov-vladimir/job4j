/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *
 * @author Администратор
 */
public class SquareTest {
    @Test
    public void whenSquareCalculate() {
        Square square = new Square();
        int[] resultFunc = square.calculate(5);
        int[] result = {1, 4, 9, 16, 25 };
        
        assertThat(result, is(resultFunc));
        
        resultFunc = square.calculate(7);
        result = new int[] {1, 4, 9, 16, 25, 36, 49 };
        
        assertThat(result, is(resultFunc));
    }
    
}
