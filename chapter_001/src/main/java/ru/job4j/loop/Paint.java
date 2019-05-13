package ru.job4j.loop;

public class Paint {
    public String getPiramyd(int height) {
        StringBuilder result = new StringBuilder();
        int width = 2 * height - 1;

        for (int row = 0; row != height; row++) {
            for (int col = 0; col != width; col++) {
                if (row >= height - col - 1 && row + height - 1 >= col) {
                    result.append("^");
                } else {
                    result.append(" ");
                }
            }

            result.append(System.lineSeparator());
        }

        return  result.toString();
    }
    
    public String rightTrl(int height) {
        StringBuilder result = new StringBuilder();        
        int width = height;
        
        for (int row = 0; row != height; row++) {
            for (int col = 0; col != width; col++) {
                if (row >= col) {
                    result.append("^");
                } else {
                    result.append(" ");
                }
            }
            
            result.append(System.lineSeparator());
        }
        
        return result.toString();       
    }
    
    public String leftTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int width = height;
        
        for (int row = 0; row != height; row++) {
            for (int col = 0; col != width; col++) {
                if (row >= (width - col) - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            
            screen.append(System.lineSeparator());
        }
        
        return screen.toString();
    }
    
}
