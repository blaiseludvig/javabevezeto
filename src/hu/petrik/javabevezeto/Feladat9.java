package hu.petrik.javabevezeto;

public class Feladat9 {

    public static void run() {
        for (int i = 0; i < 1000; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.printf("%d, ", i);
            }
        }
    }

}
