package ru.job4j.array;

/**
 *
 * @author Администратор
 */
public class BubbleSort {
    /**
     * Вариант второй
     * @param array
     * @return 
     */
    public int[] sortBubble(int[] array) {
        boolean link = false;
        
        do { 
            link = setSort(array); 
        }
        while (link);
        
        return array;
    }
    
    boolean setSort(int[] array) {
        boolean result = false;       
        
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                continue;
            }

            if (array[i] < array[i - 1]) {
                int curVal = array[i];
                array[i] = array[i - 1];
                array[i - 1] = curVal;
                result = true;
            }
        }
        
        return result;
    }
    
    /**
     * Вариант первый
     * @param array
     * @return 
     */
    public int[] sort(int[] array) {        
        for (int i = 0; i < array.length; i++) {
            array[i] = getMinVal(array, i);
        }
        
        return array;
    }
    
    /**
     * Поиск минимального значения из остатка не перебранных элементов
     * @param array входной массив
     * @param lastIdx стартовый индекс
     * @return минимальное значение
     */
    int getMinVal(int[] array, int lastIdx) {
        int minVal = 0;
        int minValIdx = -1;
        
        for (int j = lastIdx; j < array.length; j++) {
            if (j == lastIdx) {
                minVal = array[j];
                continue;
            }
            
            if (array[j] < minVal) {
                minVal = array[j];
                minValIdx = j;
            }            
        }
        
        if (minValIdx != -1) {
            array[minValIdx] = array[lastIdx];            
        }
        
        return minVal;
    }
}
