package hu.petrik.javabevezeto;

import java.util.Random;
import java.util.Scanner;

public class Feladat8 {

    static Scanner in = new Scanner(System.in);

    public static void run() {
        System.out.print("Fej vagy írás? ( 0 vagy 1 ): ");
        int n = Integer.parseInt(in.nextLine());

        int random = new Random().nextInt(2);

        if (random == 0){
            System.out.println("...Fej!");
        } else {
            System.out.println("...Írás!");
        }

        if (n == random){
            System.out.println("Nyertél! Gratulálok!");
        } else {
            System.out.println("Sajnos nem nyertél! Játssz újra!");
        }

    }

}
