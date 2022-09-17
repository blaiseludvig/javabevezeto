package hu.petrik.javabevezeto;

import java.util.Random;
import java.util.Scanner;

public class Feladat13 {

    static Scanner in = new Scanner(System.in);

    public static void run() {
        int random = new Random().nextInt(100) + 1;

        for (;;) {
            System.out.print("Tippelj! : ");
            int guess = Integer.parseInt(in.nextLine());

            if (guess > random) {
                System.out.printf("A szám kissebb, mint %d...%n", guess);
            } else {
                System.out.printf("A szám nagyobb, mint %d...%n", guess);
            }

            if (guess == random) {
                System.out.printf("Gratulálok, eltaláltad! A szám %d volt.%n", random);
                break;
            }

        }


    }

}
