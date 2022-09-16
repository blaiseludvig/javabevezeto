package hu.petrik.javabevezeto;

public class Feladat9 {

    public static void run() {
        System.out.println("Az összes hárommal és öttel egyaránt osztható, 1000-nél kissebb természetes szám: ");

        int j = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.printf("%d, ", i);
                j += 1;
            }

            if (j == 5){
                System.out.print('\n');
                j = 0;
            }

        }

        System.out.print('\n');

    }

}
