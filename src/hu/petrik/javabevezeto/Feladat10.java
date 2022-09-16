package hu.petrik.javabevezeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Feladat10 {

    static Scanner in = new Scanner(System.in);

    public static void run() {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        do {
            System.out.print("Adjon meg pozitív egész számokat: ");
            numbers.add(Integer.parseInt(in.nextLine()));
        } while (numbers.stream().mapToInt(a -> a).sum() < 100);

        int even = 0;

        for (int n : numbers) {
            if (n % 2 == 0) {
                even += 1;
            }
        }

        int odd = numbers.size() - even;

        System.out.printf("%d páratlan, és %d páros szám volt.%n", odd, even);

    }

}
