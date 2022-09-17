package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat6 {

    static Scanner in = new Scanner(System.in);

    static final double[] grade_boundaries = {43, 58, 73, 88, 100};
    static final String[] grade_strings = {"elégtelen", "elégséges", "közepes", "jó", "jeles"};

    public static void run() {
        System.out.print("Adja meg a dolgozat pontszámát: ");
        double score = Double.parseDouble(in.nextLine());

        System.out.printf("A dolgozat %s.%n", getGrade(score));

    }

    static String getGrade(double score) {
        for (int i = 0; i < grade_boundaries.length; i++) {
            if (score < grade_boundaries[i]) {
                return grade_strings[i];
            }
        }

        return grade_strings[grade_strings.length - 1];
    }

}
