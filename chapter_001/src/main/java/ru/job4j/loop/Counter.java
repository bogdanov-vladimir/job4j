package ru.job4j.loop;

/**
 * Вычисление значений в цмкле
 */
public class Counter {
    /**
     * Метод суммирует все четные числа в диаппазоне start - finish
     * @param start начальное
     * @param finish конечное
     * @return сумма четных чисел
     */
    public int add(int start, int finish) {
        int result = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }

        return result;
    }
}
