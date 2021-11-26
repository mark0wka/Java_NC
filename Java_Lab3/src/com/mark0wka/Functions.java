package com.mark0wka;

import com.mark0wka.collections.MyLinkedList;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Functions {

    public static void listTimings(List<Integer> list, int numbers) {
        System.out.println("****List testing****");
        long startTime = System.nanoTime();
        for (int i = 0; i < numbers; i++) {
            list.add(numbers - i);
        }
        long stopTime = System.nanoTime();
        double result = stopTime - startTime;
        System.out.println("Filling time in milliseconds: " + result / 1000000);

        startTime = System.nanoTime();
        list.add(numbers/12, numbers * 2);
        stopTime = System.nanoTime();
        result = stopTime - startTime;
        System.out.println("Adding time in milliseconds: " + result / 1000000);

        startTime = System.nanoTime();
        int get = list.get(numbers/6);
        stopTime = System.nanoTime();
        result = stopTime - startTime;
        System.out.println("Getting time in milliseconds: " + result / 1000000);

        startTime = System.nanoTime();
        list.remove(numbers/7);
        stopTime = System.nanoTime();
        result = stopTime - startTime;
        System.out.println("Removing time in milliseconds: " + result / 1000000);
    }

    public static void setTimings(Set<Integer> set, int numbers) {
        System.out.println("****Set testing****");
        long startTime = System.nanoTime();
        for (int i = 0; i < numbers; i++) {
            set.add(numbers - i);
        }
        long stopTime = System.nanoTime();
        double result = stopTime - startTime;
        System.out.println("Filling time in milliseconds: " + result / 1000000);

        startTime = System.nanoTime();
        set.add(numbers * 2);
        stopTime = System.nanoTime();
        result = stopTime - startTime;
        System.out.println("Adding time in milliseconds: " + result / 1000000);

        startTime = System.nanoTime();
        set.contains(numbers/4);
        stopTime = System.nanoTime();
        result = stopTime - startTime;
        System.out.println("Contains time in milliseconds: " + result / 1000000);

        startTime = System.nanoTime();
        set.remove(numbers/7);
        stopTime = System.nanoTime();
        result = stopTime - startTime;
        System.out.println("Removing time in milliseconds: " + result / 1000000);
    }

    public static void mapTimings(Map<Integer, Integer> map, int numbers) {
        System.out.println("****Map testing****");
        long startTime = System.nanoTime();
        for (int i = 0; i < numbers; i++) {
            map.put(i, numbers - i);
        }
        long stopTime = System.nanoTime();
        double result = stopTime - startTime;
        System.out.println("Filling time in milliseconds: " + result / 1000000);

        startTime = System.nanoTime();
        map.get(numbers / 10);
        stopTime = System.nanoTime();
        result = stopTime - startTime;
        System.out.println("Getting time in milliseconds: " + result / 1000000);

        startTime = System.nanoTime();
        map.putIfAbsent(numbers + 2, 1234);
        stopTime = System.nanoTime();
        result = stopTime - startTime;
        System.out.println("putIfAbsent time in milliseconds: " + result / 1000000);

        startTime = System.nanoTime();
        map.remove(numbers/12);
        stopTime = System.nanoTime();
        result = stopTime - startTime;
        System.out.println("Removing time in milliseconds: " + result / 1000000);
    }

    public static void myListTimings(MyLinkedList<Integer> list, int numbers) {
        System.out.println("****List testing****");
        long startTime = System.nanoTime();
        for (int i = 0; i < numbers; i++) {
            list.add(numbers - i);
        }
        long stopTime = System.nanoTime();
        double result = stopTime - startTime;
        System.out.println("Filling time in milliseconds: " + result / 1000000);

        startTime = System.nanoTime();
        list.add(numbers/12, numbers * 2);
        stopTime = System.nanoTime();
        result = stopTime - startTime;
        System.out.println("Adding time in milliseconds: " + result / 1000000);

        startTime = System.nanoTime();
        int get = list.get(numbers/6);
        stopTime = System.nanoTime();
        result = stopTime - startTime;
        System.out.println("Getting time in milliseconds: " + result / 1000000);

        startTime = System.nanoTime();
        list.remove(numbers/7);
        stopTime = System.nanoTime();
        result = stopTime - startTime;
        System.out.println("Removing time in milliseconds: " + result / 1000000);
    }

}
