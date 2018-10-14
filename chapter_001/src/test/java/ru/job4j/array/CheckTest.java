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
public class CheckTest {
    @Test
    public void whenCheckMono() {
        Check check = new Check();
        boolean[] array = {true, true, true };
        boolean resultFunc = check.mono(array);
        boolean result = true;
        
        assertThat(result, is(resultFunc));
        
        array = new boolean[] {true, false, true };
        resultFunc = check.mono(array);
        result = false;
        
        assertThat(result, is(resultFunc));
    }
    
}
