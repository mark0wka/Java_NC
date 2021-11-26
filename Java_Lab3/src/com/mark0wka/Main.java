package com.mark0wka;

import com.mark0wka.collections.MyLinkedList;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkerList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Map<Integer, Integer> hashMap = new HashMap<>();
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, Integer> treeMap = new TreeMap<>();

        for (int i = 0; i < 15; i++) {
            myLinkedList.add(i);
        }

        myLinkedList.add(15, 15);
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.toString());
        System.out.println(myLinkedList.indexOf(15));
        System.out.println(myLinkedList.indexOf(0));
        System.out.println(myLinkedList.indexOf(6));
        System.out.println(myLinkedList.remove(7));
        System.out.println(myLinkedList.size());
        myLinkedList.add(7, 654);
        System.out.println(myLinkedList.set(7, 7));
        System.out.println(myLinkedList.toString());
        Integer[] array = new Integer[16];
        array = myLinkedList.toArray(new Integer[0]);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        Integer[] array1 = new Integer[16];
        myLinkedList.toArray(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        myLinkedList.clear();

        System.out.println();
        System.out.println();
        System.out.println();
        int numbers = 10000;

        MyLinkedList<Integer> myLinkedList1 = new MyLinkedList<>();

        for (int i = 0; i < 4; i++) {
            numbers = 10000 * (int)Math.pow(10, i);
            System.out.println("****testing MyLinkedList and LinkedList with " + numbers + " elements");
            Functions.myListTimings(myLinkedList1, numbers);
            Functions.listTimings(linkerList, numbers);
            System.out.println();
        }

        numbers = 10000;

        for (int i = 0; i < 3; i++) {
            numbers = 10000 * (int)Math.pow(10, i);
            System.out.println("****testing with " + numbers + " elements");
            Functions.listTimings(arrayList, numbers);
            Functions.listTimings(linkerList, numbers);
            System.out.println();
            Functions.setTimings(hashSet, numbers);
            Functions.setTimings(linkedHashSet, numbers);
            Functions.setTimings(treeSet, numbers);
            System.out.println();
            Functions.mapTimings(hashMap, numbers);
            Functions.mapTimings(linkedHashMap, numbers);
            Functions.mapTimings(treeMap, numbers);
            System.out.println();
        }
    }
}
