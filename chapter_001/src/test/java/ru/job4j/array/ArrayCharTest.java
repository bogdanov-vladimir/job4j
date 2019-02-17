
package ru.job4j.array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;
        
/**
 *
 * @author Администратор
 */
public class ArrayCharTest {
    @Test
    public void whenStartWith() {
        ArrayChar arrayChar = new ArrayChar("Начинается на");        
        boolean result = true;
        boolean resultFunc = arrayChar.startWith("нач");
        
        assertThat(result, is(resultFunc));

        result = false;
        resultFunc = arrayChar.startWith("Нача");        
        assertThat(result, is(resultFunc));
    }           
    
}
