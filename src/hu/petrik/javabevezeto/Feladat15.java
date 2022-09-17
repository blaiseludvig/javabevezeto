package hu.petrik.javabevezeto;

import java.util.concurrent.ThreadLocalRandom;

public class Feladat15 {

    public static void run() {
        double[] arr = new double[25];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextDouble(0, 10 + 1);
        }

        double[] squared = squareOddIndexes(arr);

        for (double n : squared) {
            System.out.printf("%f, ", n);
        }

        System.out.print('\n');

    }

    static double[] squareOddIndexes(double[] arr) {
        double[] squared = new double[arr.length / 2];

        int i_squared = 0;
        for (int i = 1; i < arr.length; i += 2) {
            squared[i_squared] = Math.pow(arr[i], 2);
            i_squared += 1;
        }

        return squared;
    }

}
