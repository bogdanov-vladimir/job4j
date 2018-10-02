package ru.job4j.loop;

public class Board {
    public String paint(int height, int width) {
        StringBuilder result = new StringBuilder();
        String lineSeparator = System.lineSeparator();

        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                result.append((w + h) % 2 == 0 || (w == 0 && h == 0) ? "X" : " ");
            }

            result.append(lineSeparator);
        }

        return  result.toString();
    }
}
