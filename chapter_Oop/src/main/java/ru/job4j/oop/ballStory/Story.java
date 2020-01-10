package ru.job4j.oop.ballStory;

public class Story {

    public static void main(String[] args) {
        Ball ball = new Ball();

        Animal[] arrAnimal = {
                new Animal("Заяц"),
                new Animal("Волк"),
                new Animal("Лиса")
        };

        for (int i = 0; i < arrAnimal.length; i++) {
            ball.hi(arrAnimal[i].getName());
            arrAnimal[i].niamniam();

            if(arrAnimal[i].getName() != "Лиса") {
                ball.move();
            } else {
                ball = null;
                System.out.println("Перехитрила лиса колобка и съела его!");
                break;
            }
        }

        if(ball == null) {
            System.out.println("Конец!");
        }
    }
}
