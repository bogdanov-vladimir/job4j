package ru.job4j.oop.ballstory;

public class Ball {
    private String[] sWhoLeft = new String[5];
    private String sWhoNow;

    public Ball() {
        sWhoLeft[0] = "Бабушки";
        sWhoLeft[1] = "Дедушки";
    }

    public void move() {
        Integer iNext = null;

        for (int i = 0; i < sWhoLeft.length; i++) {
            if (sWhoLeft[i] == null) {
                iNext = i;
                break;
            }

            System.out.println("Я от " + sWhoLeft[i] + ", ушел! ");
        }

        if (sWhoNow != null && iNext != null) {
            System.out.println("И от тебя " + sWhoNow + ", подавно уйду! ");
            sWhoLeft[iNext] = sWhoNow;
            sWhoNow = null;
        }
    }

    public void hi(String sNow) {
        System.out.println("Привет, " + sNow + ", я колобок");
        sWhoNow = sNow;
    }
}
