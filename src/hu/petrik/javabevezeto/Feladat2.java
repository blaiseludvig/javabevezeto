package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat2 {

    static Scanner in = new Scanner(System.in);

    static final double TILE_SIZE_M2 = 0.2 * 0.2;
    // Extra amount required for fitting the tiles
    static final double FITTING_EXTRA_PERCENTAGE = 0.1;

    public static void run() {
        System.out.print("Adja meg a felület szélességét (m^2): ");
        double width = Double.parseDouble(in.nextLine());

        System.out.print("Adja meg a felület hosszúságát (m^2): ");
        double length = Double.parseDouble(in.nextLine());

        System.out.printf("A felület burkolásához %d csempe szükséges.%n", tilesForSurface(width, length));

    }

    static int tilesForSurface(double width, double length) {
        return (int) Math.ceil(
                    width
                    * length
                    / TILE_SIZE_M2
                    * (1 + FITTING_EXTRA_PERCENTAGE)
                    );
    }


}
