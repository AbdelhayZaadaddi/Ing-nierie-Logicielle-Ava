package ava_6.problem4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class ListPerformanceComparison {
    private static final int COUNT = 50000;

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("--- Performance Comparison (" + COUNT + " operations) ---");

        measureTime("ArrayList Add (End)", () -> {
            for (int i = 0; i < COUNT; i++)
                arrayList.add(i);
        });
        measureTime("LinkedList Add (End)", () -> {
            for (int i = 0; i < COUNT; i++)
                linkedList.add(i);
        });

        Random rand = new Random();
        measureTime("ArrayList Get (Random)", () -> {
            for (int i = 0; i < COUNT; i++)
                arrayList.get(rand.nextInt(COUNT));
        });
        measureTime("LinkedList Get (Random)", () -> {
            for (int i = 0; i < COUNT; i++)
                linkedList.get(rand.nextInt(COUNT));
        });

        measureTime("ArrayList Add (Middle)", () -> {
            for (int i = 0; i < 1000; i++)
                arrayList.add(COUNT / 2, 99);
        });
        measureTime("LinkedList Add (Middle)", () -> {
            for (int i = 0; i < 1000; i++)
                linkedList.add(COUNT / 2, 99);
        });

        measureTime("ArrayList Remove (First)", () -> {
            for (int i = 0; i < 1000; i++)
                arrayList.remove(0);
        });
        measureTime("LinkedList Remove (First)", () -> {
            for (int i = 0; i < 1000; i++)
                linkedList.removeFirst();
        });
    }

    private static void measureTime(String label, Runnable task) {
        long start = System.nanoTime();
        task.run();
        long end = System.nanoTime();
        System.out.printf("%-25s: %10.2f ms%n", label, (end - start) / 1_000_000.0);
    }
}