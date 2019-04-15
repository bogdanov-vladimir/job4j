package ru.job4j.array;

import java.util.Arrays;

public class ArrayDublicate {
    String[] remove(String[] array) {     
       
        int idxLastRemove = array.length - 1;
        
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < idxLastRemove; j++) {
                
                if (i == j) {
                    continue;
                }                
                
                if (array[i].equals(array[j])) {
                    String dublicateItem = array[j];
                    String lastIdxItem = array[idxLastRemove];                    
                    
                    array[idxLastRemove] = dublicateItem;
                    array[j] = lastIdxItem;
                    
                    idxLastRemove--;                    
                }
            }            
            
        }
        
        return Arrays.copyOf(array, idxLastRemove + 1);
    }
}
