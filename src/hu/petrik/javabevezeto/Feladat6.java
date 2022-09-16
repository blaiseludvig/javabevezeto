package hu.petrik.javabevezeto;

import java.util.HashMap;
import java.util.Scanner;

public class Feladat6 {

    static Scanner in = new Scanner(System.in);

    public static void run() {
        System.out.print("Hányadik hónapot írunk: ");
        int n = Integer.parseInt(in.nextLine());

        System.out.printf("Éppen %s van.%n", evszak(n));

    }

    static String evszak(int n) {
        HashMap<Integer, String> evszakok = new HashMap<>();
        evszakok.put(1, "tél");
        evszakok.put(2, "tél");
        evszakok.put(3, "tavasz");
        evszakok.put(4, "tavasz");
        evszakok.put(5, "tavasz");
        evszakok.put(6, "nyár");
        evszakok.put(7, "nyár");
        evszakok.put(8, "nyár");
        evszakok.put(9, "ősz");
        evszakok.put(10, "ősz");
        evszakok.put(11, "ősz");
        evszakok.put(12, "tél");

        return evszakok.get(n);

    }

}
