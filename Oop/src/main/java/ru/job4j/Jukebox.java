package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже.");
        } else if (position == 2) {
            System.out.println("Спокойной ночи.");
        } else {
            System.out.println("Песня не найдена.");
        }
    }

    public static main (String[] args) {
        Jukebox songPlay = new Jukebox();
        songPlay.music(0);
        songPlay.music(1);
        songPlay.music(2);
    }
}