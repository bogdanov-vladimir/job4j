package ru.job4j.max;

/**
 * максимальное значение
 */
public class Max {
    /**
     * Вычисляем максимальное число из двух
     * @param first
     * @param second
     * @return максимальное число
     */
    public int max(int first, int second) {
        return first >= second ? first : second;
    }

    /**
     * Высляем максимальное число из трех чисел
     * @param first
     * @param second
     * @param third
     * @return
     */
    public int max(int first, int second, int third) {
        return this.max(this.max(first, second), third);
    }
}
