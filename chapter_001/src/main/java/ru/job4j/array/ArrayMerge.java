package ru.job4j.array;

/**
 *
 * Объединение двух массивов
 */
public class ArrayMerge {    
    
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        
        int idxR = 0;
        int idxL = 0;      
        int idxRsl = 0;      
        
        int valL = 0;
        int valR = 0;
            
        while (idxRsl < rsl.length) {           
            
            
            if (idxL < left.length) {
                valL = left[idxL];  
            }
                        
            if (idxR < right.length) {
                valR = right[idxR];      
            }
            
            while ((valR < valL || idxL == left.length) && idxR < right.length) {
                
                if (idxR < right.length) {
                    valR = right[idxR];      
                }
                
                if (idxRsl < rsl.length) {
                        rsl[idxRsl] = valR;
                        idxRsl++;
                }
                
                idxR++;           
            }
            
            if (idxL < left.length) {
                idxL++;
            } else {
                break;
            }
            
            if (idxRsl < rsl.length) {
                rsl[idxRsl] = valL;
                idxRsl++;
            }            
            
        }       
        
        return rsl;
    }    
}
