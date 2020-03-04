package ru.job4j.oop;

/** 1.7. Состояние объекта.
 *
 * 1. Создать класс ru.job4j.oop.Battery. в нем должно быть поле private int load.
 * 2. Создать метод public void exchange(Battery another). Этот метод должен списывать заряд из
 * батареи у кого вызывали метод exchange и добавить к объекту another.
 */

public class Battery {
    private int load;

    public Battery(int iLoad) {
        this.load = iLoad;
    }

    public void exchange(Battery another) {
        if (this.load > 0) {
            another.load = another.load + this.load;
            this.load = 0;
        }
    }

    public static void main(String[] args) {
        Battery bOne = new Battery(10);
        Battery bTwo = new Battery(100);

        System.out.println("bOne.load =" + bOne.load + ", bTwo.load =" + bTwo.load);
        bOne.exchange(bTwo);
        System.out.println("bOne.load =" + bOne.load + ", bTwo.load =" + bTwo.load);
    }
}
