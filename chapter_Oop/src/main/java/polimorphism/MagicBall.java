package polimorphism;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Я великий оракул, что ты хочешь узнать?");
        String sInput = input.nextLine();

        int iRandom = new Random().nextInt(3);

        if(iRandom == 0) {
            sInput += ", да.";
        } else if(iRandom == 1) {
            sInput += ", нет.";
        } else {
            sInput += ", может быть.";
        }

        System.out.println(sInput);

    }
}
