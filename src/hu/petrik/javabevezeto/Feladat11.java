package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat11 {

    static Scanner in = new Scanner(System.in);

    public static void run() {
        System.out.print("Adjon meg egy pozitív egész számot: ");
        int n = Integer.parseInt(in.nextLine());

        int sum = 0;

        {
            int i;

            if (n % 2 == 0) {
                i = n - 1;
            } else {
                i = n;
            }

            for (; i > 0; i -= 2) {
                sum += i;
            }

        }

        System.out.printf("A megadott számnál nem nagyobb pozitív számok összege: %d%n", sum);


    }


}
