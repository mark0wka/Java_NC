package com.mark0wka.chapter1;

public class EX2 {

    public static void calculateWithOperator(int angle) {
        int result;
        if (angle >= 0) {
            result = angle % 360;
        } else {
            result = 360 + (angle % 360);
        }
        System.out.println(result);
    }

    public static void calculateWithFloorMod(int angle) {
        System.out.println(Math.floorMod(angle, 360));
    }

    public static void calculateAll (int num) {
        System.out.println("Angle = " + num);
        System.out.println("With operator '%':");
        calculateWithOperator(num);
        System.out.println("With floorMod:");
        calculateWithFloorMod(num);
        System.out.println();
    }
}
