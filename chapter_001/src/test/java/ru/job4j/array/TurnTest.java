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
public class TurnTest {
    @Test
    public void whenTurnArray() {
        Turn turn = new Turn();        
        int[] array = {1, 3, 5, 10 };        
        int[] resultFunc = turn.turn(array);
        int[] result = {10, 5, 3, 1 };
        
        assertThat(result, is(resultFunc));
        
        array = new int[]{1, 3, 5, 10, 20 };        
        resultFunc = turn.turn(array);
        result = new int[] {20, 10, 5, 3, 1 };
        
        assertThat(result, is(resultFunc));
    }
}
