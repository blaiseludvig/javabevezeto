package hu.petrik.javabevezeto;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.ThreadLocalRandom;

public class Feladat17 {

    public static void run() {
        double[] arr1 = new double[5];
        double[] arr2 = new double[5];

        for (int i = 0; i < arr1.length; i++) {
            // Ez a nyelv egy kalap szar
            double random = ThreadLocalRandom.current().nextDouble(0, 10);
            double rounded = new BigDecimal(random).setScale(1, RoundingMode.HALF_UP).doubleValue();
            arr1[i] = rounded;
        }

        for (int i = 0; i < arr2.length; i++) {
            // Ez a nyelv egy kalap szar
            double random = ThreadLocalRandom.current().nextDouble(0, 10);
            double rounded = new BigDecimal(random).setScale(1, RoundingMode.HALF_UP).doubleValue();
            arr2[i] = rounded;
        }

        double[] sum_arr = addArrays(arr1, arr2);

        System.out.print("Az első tömb: ");
        for (double n : arr1) {
            System.out.printf("%.1f ", n);
        }
        System.out.print('\n');

        System.out.print("A második tömb: ");
        for (double n : arr2) {
            System.out.printf("%.1f ", n);
        }
        System.out.print('\n');

        System.out.print("Az összeadott tömb: ");
        for (double n : sum_arr) {
            System.out.printf("%.1f ", n);
        }
        System.out.print('\n');

    }

    static double[] addArrays(double[] arr1, double[] arr2) {
        double[] sum_arr = new double[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            sum_arr[i] = arr1[i] + arr2[i];
        }

        return sum_arr;
    }

}
