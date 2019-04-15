package ru.job4j.array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class TestArrayDublicate {
    
    @Test
    public void whenDublicate() {
        
        ArrayDublicate arrDublicate = new ArrayDublicate();
        
        String[] array = {"Привет", "Мир", "Привет", "Супер", "Мир" };        
        String[] result = {"Привет", "Мир", "Супер" };        
        String[] resultFunc = arrDublicate.remove(array);
        
        assertThat(result, is(resultFunc));        
    }
    
}
