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
public class Turn {
    
    public int[] turn(int[] array) {    
        
        int len = array.length - 1;
        
        for (int i = 0; i < array.length; i++) {            
            
            if (i >= array.length - i) {
                break;
            }
            
            int beg = array[i];
            int end = array[len - i];
            
            array[i] = end;
            array[len - i] = beg;            
        }
        
        return array;
    }
}
