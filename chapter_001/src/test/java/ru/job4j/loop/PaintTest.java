package ru.job4j.loop;

import java.util.StringJoiner;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PaintTest {
    @Test
    public void whenPaintPiramyd() {
        Paint paint = new Paint();
        String resultFunc = paint.getPiramyd(4);

        StringBuilder result = new StringBuilder();
        result.append("   ^   ");
        result.append(System.lineSeparator());
        result.append("  ^^^  ");
        result.append(System.lineSeparator());
        result.append(" ^^^^^ ");
        result.append(System.lineSeparator());
        result.append("^^^^^^^");
        result.append(System.lineSeparator());

        assertThat(result.toString(), is(resultFunc));

        result.setLength(0);

        result.append("  ^  ");
        result.append(System.lineSeparator());
        result.append(" ^^^ ");
        result.append(System.lineSeparator());
        result.append("^^^^^");
        result.append(System.lineSeparator());

        resultFunc = paint.getPiramyd(3);

        assertThat(result.toString(), is(resultFunc));


    }
    
    @Test
    public void whenRigthTrl() {
        Paint paint = new Paint();
        String rst = paint.rightTrl(4);
        System.out.println(rst);
        assertThat(rst,
                is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                        .add("^   ")
                        .add("^^  ")
                        .add("^^^ ")
                        .add("^^^^")
                        .toString()
                ));
    }
    
    @Test
    public void whenLeftTrl() {
        Paint paint = new Paint();
        String rst = paint.leftTrl(4);
        System.out.println(rst);
        assertThat(rst,
                is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                    .add("   ^")
                    .add("  ^^")
                    .add(" ^^^")
                    .add("^^^^")
                    .toString()
                ));
        }
}
