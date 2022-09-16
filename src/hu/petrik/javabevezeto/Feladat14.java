package hu.petrik.javabevezeto;

import java.util.HashMap;
import java.util.Scanner;

public class Feladat14 {

    static Scanner in = new Scanner(System.in);
    static String str;

    static boolean quit = false;

    public static void run() {
        HashMap<Character, Runnable> menus = new HashMap<Character, Runnable>();
        menus.put('a', Feladat14::menu_a);
        menus.put('b', Feladat14::menu_b);
        menus.put('c', Feladat14::menu_c);
        menus.put('d', Feladat14::menu_d);
        menus.put('e', Feladat14::menu_e);
        menus.put('f', Feladat14::menu_f);

        System.out.print("Adj meg egy stringet: ");
        str = in.nextLine();

        for (; ; ) {
            System.out.println("Válassz egy opciót: ");
            System.out.println("  a - Nagy betűssé alakítani");
            System.out.println("  b - Kisbetűssé alakítani");
            System.out.println("  c - Lekérdezni a hosszát");
            System.out.println("  d - Összehasonlítani egy másik stringel");
            System.out.println("  e - Kiíratni egy részét");
            System.out.println("  f - Kilépni");
            System.out.print(": ");

            char c = in.nextLine().charAt(0);

            if (menus.containsKey(c)) {
                System.out.printf("A string: %s%n", str);
                menus.get(c).run();
            } else {
                System.out.printf("Hibás bevitel!");
            }

            if (quit) {
                break;
            }

        }

    }

    static void menu_a() {
        System.out.printf("A string nagy betűkkel: %s%n", str.toUpperCase());
    }

    static void menu_b() {
        System.out.printf("A string nagy betűkkel: %s%n", str.toLowerCase());
    }

    static void menu_c() {
        System.out.printf("A string hossza: %d%n", str.length());
    }

    static void menu_d() {
        System.out.print("Adja meg a másik stringet: ");
        String str2 = in.nextLine();

        if (str.equals(str2)) {
            System.out.println("A stringek azonosak.");
        } else {
            System.out.println("A stringek nem azonosak");
        }

    }

    static void menu_e() {
        System.out.print("Adja meg az intervallum alsó határát: ");
        int begin = Integer.parseInt(in.nextLine());

        System.out.print("Adja meg az intervallum felső határát: ");
        int end = Integer.parseInt(in.nextLine());

        System.out.printf("A megadott string intervallum: %s%n", str.substring(begin - 1, end));

    }

    static void menu_f() {
        quit = true;
    }

}
