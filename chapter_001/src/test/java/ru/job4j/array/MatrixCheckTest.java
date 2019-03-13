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
public class MatrixCheckTest {
    @Test 
    public void whenMatrix() {
        MatrixCheck matrixCheck = new MatrixCheck();
        boolean[][] matrix = {
                {true, true},
                {false, true}
        };
        
        boolean resulFunc = matrixCheck.mono(matrix);        
        assertThat(resulFunc, is(false));        
        
        matrix = new boolean[][]{
                {false, false, true},
                {false, true, false},
                {true, false, false}
        };
        resulFunc = matrixCheck.mono(matrix);
        
        assertThat(resulFunc, is(true));
     }
}
