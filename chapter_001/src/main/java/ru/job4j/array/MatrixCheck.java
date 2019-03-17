/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.job4j.array;

/**
 *
 * @author Администратор
 */
public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;        
        int iDiagCurrentIdx = 0;
        
        if (data.length > 0) {
           iDiagCurrentIdx = data[0].length - 1; 
        }        
        
        for (int row = 0; row < data.length; row++) {
            
            if (iDiagCurrentIdx >= 0) {                
                if (!data[row][iDiagCurrentIdx]) {
                    result = false;
                }
            }
            
            iDiagCurrentIdx--;
        }
        
        return result;
    }
}
