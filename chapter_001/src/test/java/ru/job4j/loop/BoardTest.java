package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BoardTest {
    @Test
    public void whereBoardPaintThree() {
        Board board = new Board();
        String lineSeparator = System.lineSeparator();

        String resultFunc = board.paint(3, 3);
        StringBuilder result = new StringBuilder();

        result.append("X X");
        result.append(lineSeparator);
        result.append(" X ");
        result.append(lineSeparator);
        result.append("X X");
        result.append(lineSeparator);

        assertThat(result.toString(), is(resultFunc));
    }

    @Test
    public void whereBoardPaintFive() {
        Board board = new Board();
        String lineSeparator = System.lineSeparator();

        String resultFunc = board.paint(5, 5);
        StringBuilder result = new StringBuilder();

        result.append("X X X");
        result.append(lineSeparator);
        result.append(" X X ");
        result.append(lineSeparator);
        result.append("X X X");
        result.append(lineSeparator);
        result.append(" X X ");
        result.append(lineSeparator);
        result.append("X X X");
        result.append(lineSeparator);

        assertThat(result.toString(), is(resultFunc));
    }
}
