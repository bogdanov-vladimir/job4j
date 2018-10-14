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
public class FindLoop {
    public int indexOf(int[] data, int searchEl) {
        int result = -1;
        
        for (int idx = 0; idx < data.length; idx++) {
            if (data[idx] == searchEl) {
                return idx;
            }
        }        
        return result;
    }
}