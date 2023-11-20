package ru.gb.HomeWork2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(new Worker("Alex", 21, 200000, "GeekBrains"));
        workers.add(new Worker("Igor", 25, 213, "ads"));
        workers.add(new Worker("Valera", 32, 4, "fff"));
        workers.add(new Worker("Bot", 41, 20055000, "ssss"));
        workers.add(new Worker("Max", 55, 2, "GeekBrrrrains"));
        workers.add(new Worker("Dima", 22, 5, "wwww"));
        workers.add(new Worker("Farel", 1, 5, "ggggg"));
        workers.add(new Worker("Boss", 24, 2, "gsggd"));
        workers.add(new Worker("BigBoss", 25, 8, "GeekfgfdgfdgBrains"));
        workers.add(new Worker("MiniBoss", 23, 6, "vxvxvfs"));
        workers.add(new Worker("Brain", 21, 5, "GeekBrfdsfweains"));
        workers.add(new Worker("NoBrain", 21, 200000, "tertery"));
        workers.add(new Worker("Frimmen", 33, 3, "rwerqwe"));
        workers.add(new Worker("Revan", 4000, 3, "GeekBradasdqains"));
        workers.add(new Worker("Vader", 40, 20220000, "GeekBweadrains"));
        workers.add(new Worker("Agent", 7, 5532, "GeekBrainsadadsa"));
        workers.add(new Worker("Allah", 2500, 4234325, "GeeadcxcxvkBrains"));
        workers.add(new Worker("Jesus", 2000, 66564, "GeekBdasdrains"));
        workers.add(new Worker("God", 0, 877777, "GeekBraixcvxns"));
        workers.add(new Worker("Putin", 75, 2000555500, "v"));
        workers.add(new Worker("Trump", 56, 6666666, "gfgrzzzz"));

        // Сортировка по возрастанию возраста
        Collections.sort(workers);
        System.out.println("\nSorted by age:");
        for (Worker worker : workers) {
            System.out.println(worker);
        }

        // Сортировка по убыванию зарплаты
        Collections.sort(workers, new Worker.SalaryComparator());
        System.out.println("\nSorted by salary:");
        for (Worker worker : workers) {
            System.out.println(worker);
        }

        // Сортировка по наименованию отдела в лексикографическом порядке
        Collections.sort(workers, new Worker.DepartmentComparator());
        System.out.println("\nSorted by department:");
        for (Worker worker : workers) {
            System.out.println(worker);
        }
    }
}
