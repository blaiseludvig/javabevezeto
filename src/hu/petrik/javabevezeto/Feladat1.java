package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat1 {

    static Scanner in = new Scanner(System.in);

    public static void run() {


        System.out.print("Adja meg a medence átmérőjét: ");
        double diameter = Double.parseDouble(in.nextLine());
        double r = diameter / 2;

        System.out.print("Adja meg a medence mélységét: ");
        double h = Double.parseDouble(in.nextLine());

        System.out.print("Adja meg a méretek mértékegységét: ");
        String unit = in.nextLine();

        double volume = cylinderVolume(r, h);

        System.out.printf("A medence térfogata: %.2f%s^3%n", volume, unit);

    }

    static double cylinderVolume(double radius, double height) {
        return radius * radius * height * Math.PI;
    }


}
