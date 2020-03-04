package ru.job4j.oop.ballstory;

public class Story {
    public static void main(String[] args) {
        Ball ball = new Ball();
        String sEndStory = "Лиса";

        Animal[] arrAnimal = {
                new Animal("Заяц"),
                new Animal("Волк"),
                new Animal("Лиса")
        };

        for (int i = 0; i < arrAnimal.length; i++) {
            ball.hi(arrAnimal[i].getName());
            arrAnimal[i].niamniam();

            if (arrAnimal[i].getName().equals(sEndStory)) {
                ball.move();
            } else {
                ball = null;
                System.out.println("Перехитрила лиса колобка и съела его!");
                break;
            }
        }

        if (ball == null) {
            System.out.println("Конец!");
        }
    }
}
