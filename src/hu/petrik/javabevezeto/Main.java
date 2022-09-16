package hu.petrik.javabevezeto;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    static HashMap<Integer, Runnable> tasks = new HashMap<Integer, Runnable>();

    public static void main(String[] args) {
        initTasks();
        taskSelect();
    }

    static void initTasks() {
        tasks.put(1, Feladat1::run);
        tasks.put(2, Feladat2::run);
        tasks.put(3, Feladat3::run);
        tasks.put(4, Feladat4::run);
        tasks.put(5, Feladat5::run);
        tasks.put(6, Feladat6::run);
        tasks.put(7, Feladat7::run);
        tasks.put(8, Feladat8::run);
        tasks.put(9, Feladat9::run);
        tasks.put(10, Feladat10::run);
        tasks.put(11, Feladat11::run);
        tasks.put(12, Feladat12::run);
        tasks.put(13, Feladat13::run);
        tasks.put(14, Feladat14::run);
        tasks.put(15, Feladat15::run);
        tasks.put(16, Feladat16::run);
        tasks.put(17, Feladat17::run);
    }

    static void taskSelect() {
        for (; ; ) {
            System.out.println("Összes feladat: * | Kilépés: q");
            System.out.printf("Válasszon egy feladatot (1-%d): ", tasks.size());

            String input = in.nextLine();

            if (input.equals("q")) {
                return;
            }

            if (input.equals("*")) {
                for (int i = 1; i < tasks.size() + 1; i++) {
                    System.out.printf("Feladat %d:%n", i);
                    tasks.get(i).run();
                }

            }

            int task_number;

            try {
                task_number = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                continue;
            }

            if (task_number < 0 || task_number > tasks.size()){
                continue;
            }

            System.out.printf("Feladat %d:%n", task_number);
            tasks.get(task_number).run();

        }

    }
}

