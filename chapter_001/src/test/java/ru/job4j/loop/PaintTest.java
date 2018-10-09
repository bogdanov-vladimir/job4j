package ru.job4j.loop;

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
}
