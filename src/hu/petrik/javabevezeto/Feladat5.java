package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat5 {

    static Scanner in = new Scanner(System.in);

    public static void run() {
        System.out.print("Adja meg a téglalap szélességét: ");
        double w = Double.parseDouble(in.nextLine());

        System.out.print("Adja meg a téglalap magasságát: ");
        double h = Double.parseDouble(in.nextLine());

        System.out.print("Válasszon: téglalap kerülete (K), vagy téglalap területe(T): ");
        char c = in.nextLine().toUpperCase().charAt(0);

        if (c != 'K' && c != 'T') {
            System.out.println("Hibás bevitel!");
            return;
        }

        if (c == 'K') {
            System.out.printf("A téglalap kerülete: %.2f%n", 2 * (w + h));
        }

        if (c == 'T') {
            System.out.printf("A téglalap területe: %.2f%n", w * h);
        }

        if (w == h) {
            System.out.println("Ez egy négyzet.");
        }

    }

}
