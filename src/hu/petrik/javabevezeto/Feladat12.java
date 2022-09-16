package hu.petrik.javabevezeto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Feladat12 {

    static Scanner in = new Scanner(System.in);
    static int[] coins = {200, 100, 50, 20, 10, 5};

    public static void run() {
        System.out.print("Addjon meg egy összeget 1 és 1000 forint között: ");
        int input = Integer.parseInt(in.nextLine());

        int[] coin_count = new int[coins.length];

        Arrays.fill(coin_count, 0);

        int n = input;

        for (int i = 0; i < coins.length; i++) {
            coin_count[i] = Math.floorDiv(n, coins[i]);
            n -= coin_count[i] * coins[i];
        }

        System.out.println("Legkevesebb lehetséges aprópénz: ");

        for (int i = 0; i < coins.length; i++) {
            if (i != 0 || i % 2 == 0) {
                System.out.print('\n');
            }

            System.out.printf("%d: %d ", coins[i], coin_count[i]);

        }

    }


}
