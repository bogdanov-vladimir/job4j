package ru.job4j.array;

/**
 *
 * Объединение двух массивов
 */
public class ArrayMerge {    
    
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        
        int idxL = 0;
        int idxR = 0;              
        int idxRsl = 0;      
        
        int valL = 0;
        int valR = 0;        
        int valCur = 0;        
            
        while (idxRsl < rsl.length) {            
            
            if (idxL < left.length || idxR > right.length) { 
                valL = left[idxL];                
            }            
            
            if (idxR < right.length || idxL > left.length) {
                valR = right[idxR];               
            }
            
            if (idxL < left.length && idxR < right.length) {
                if (valL <= valR) {
                    valCur = valL;
                    idxL++;
                } else if (valL > valR) {
                    valCur = valR;
                    idxR++;
                }
            } else {
                if (idxL >= left.length) {
                    valCur = valR;
                    idxR++;
                } else if (idxR >= right.length) {
                    valCur = valL;
                    idxL++;
                }
            }            
            
            if (idxRsl < rsl.length) {
                rsl[idxRsl] = valCur;
                idxRsl++;
            }           
        }       
        
        return rsl;
    }    
}
