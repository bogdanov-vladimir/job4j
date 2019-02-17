
package ru.job4j.array;

/**
 *
 * @author Администратор
 */
public class ArrayChar {
    private char[] data;
    
    public ArrayChar(String line) {
        this.data = line.toUpperCase().toCharArray();
    }
    
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toUpperCase().toCharArray();
        
        if (value.length > this.data.length) {
            return false;
        }
        
        for (int i = 0; i < value.length; i++) {
            if (value[i] != data[i]) {
                result = false;
                break;
            }
        }
        
        return result;
    }
    
}
