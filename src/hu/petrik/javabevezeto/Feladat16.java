package hu.petrik.javabevezeto;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Feladat16 {

    static Scanner in = new Scanner(System.in);

    static final int INPUT_SIZE = 5;
    static int[] input = new int[INPUT_SIZE];

    public static void run() {
        for (int i = 0; i < INPUT_SIZE; i++) {
            System.out.printf("Adja meg a tömb %d. elemét: ", i + 1);
            input[i] = Integer.parseInt(in.nextLine());
        }

        System.out.println("A számok a megadás sorrendjében: ");
        for (int n : input) {
            System.out.printf("%d ", n);
        }
        System.out.print('\n');

        // A legkevésbé olvashatatlan sornyi java kód?
        int[] input_reversed = IntStream.range(0, INPUT_SIZE).map(i -> input[INPUT_SIZE-i-1]).toArray();

        System.out.println("A számok fordított sorrendben: ");
        for (int n : input_reversed) {
            System.out.printf("%d ", n);
        }
        System.out.print('\n');

        System.out.println("A tömb minden második eleme: ");
        for (int i = 1; i < input.length; i += 2) {
            System.out.printf("%d ", input[i]);
        }
        System.out.print('\n');

        System.out.printf("Adjon meg egy számot 1 és %d között: ", INPUT_SIZE);
        int n = Integer.parseInt(in.nextLine());
        System.out.printf("A tömb %d. eleme: %d", n, input[n - 1]);
        System.out.print('\n');

    }

}
