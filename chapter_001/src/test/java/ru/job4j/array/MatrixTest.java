package ru.job4j.array;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;
/**
 *
 * @author Администратор
 */
public class MatrixTest {
    @Test 
    public void whenMatrix() {
        Matrix matrix = new Matrix();
        int[][] table = matrix.multiple(2);
        int[][] expect = {
                {1, 2},
                {2, 4}
        };
        assertThat(table, is(expect));
        
        table = matrix.multiple(3);
        expect = new int[][]{
                {1, 2, 3},
                {2, 4, 6},
                {3, 6, 9}
        };     
        
        assertThat(table, is(expect));
     }
    
}
