package com.mark0wka.chapter1;

public class EX3 {

    public static void getMaxConditional (int first, int second, int third) {
        int max = (first >= second) ? first : second;
        max = (max >= third) ? max : third;
        System.out.println(max);
    }

    public static void getMaxWithMath (int first, int second, int third) {
        int max = Math.max(first,second);
        max = Math.max(max,third);
        System.out.println(max);
    }

}
