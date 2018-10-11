package ru.job4j.array;

public class Square {
    public int[] calculate(int rank) {
        int[] result = new int[rank];
        
        for (int i = 1; i <= rank; i++) {
            result[i - 1] = i * i;
        }
        
        return result;
    }   
    
}
