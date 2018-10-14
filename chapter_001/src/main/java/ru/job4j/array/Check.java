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
public class Check {
    public boolean mono(boolean[] array) {
        boolean result = true;        
        boolean firstItem = false;
        
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                firstItem = array[i];
                continue;
            }
            
            if (array[i] != firstItem) {
                result = false;
                break;
            }            
        }
        
        return result;
    }
}
