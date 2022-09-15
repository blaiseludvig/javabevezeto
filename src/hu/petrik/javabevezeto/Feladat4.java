package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat4 {

    static Scanner in = new Scanner(System.in);

    public static void run() {
        System.out.print("Adja meg a háromszög első oldalát: ");
        double a = Double.parseDouble(in.nextLine());

        System.out.print("Adja meg a háromszög második oldalát: ");
        double b = Double.parseDouble(in.nextLine());

        System.out.print("Adja meg a háromszög harmadik oldalát: ");
        double c = Double.parseDouble(in.nextLine());

        if (isTriangle(a, b, c)) {
            System.out.printf("A háromszög kerülete: %.2f%n", trianglePerimeter(a, b, c));
        } else {
            System.out.println("Hibás adatok!");
        }


    }

    static double trianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    static boolean isTriangle(double a, double b, double c) {
        if (a + b < c) {
            return false;
        }
        if (a + c < b) {
            return false;
        }
        if (b + c < a) {
            return false;
        }

        return true;

    }


}
