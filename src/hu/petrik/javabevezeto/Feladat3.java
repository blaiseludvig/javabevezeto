package hu.petrik.javabevezeto;

import java.security.PublicKey;
import java.util.Scanner;

public class Feladat3 {

    static Scanner in = new Scanner(System.in);

    public static void run() {
        System.out.print("Adjon meg egy pozitív valós számot: ");
        double n = Double.parseDouble(in.nextLine());

        if (n % 1 == 0) {
            System.out.printf("A megadott szám a %.0f és a %.0f egész számok között van.%n", n - 1, n + 1);
            return;
        }

        System.out.printf("A megadott szám a %.0f és a %.0f egész számok között van, és ezek közül a %d számhoz van közelebb.%n", Math.floor(n), Math.ceil(n), Math.round(n));
        System.out.printf("A szám egész része: %.0f%n", Math.floor(n));
        System.out.printf("A szám törtrésze: %.2f%n", n - Math.floor(n));

    }

}
