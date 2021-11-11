package com.mark0wka.chapter1;

import java.util.ArrayList;
import java.util.Comparator;

public class EX13 {

    public static void lotery() {
        int tmp = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> winNumber = new ArrayList<>(6);

        for (int i = 1; i <= 49; i++) {
            arrayList.add(i);
        }

        for (int i = 0; i < 6; i++) {
            tmp = (int)(Math.random() * (48 - i) + 1);
            winNumber.add(i, arrayList.get(tmp));
            arrayList.remove(tmp);
        }
        winNumber.sort(Comparator.naturalOrder());

        for (int i = 0; i < 6; i++) {
            System.out.println(winNumber.get(i));
        }
    }
}
