package com.mark0wka.chapter1;

public class EX1 {
    public static void calculateBinary (int num) {
        String result = "";
        while (num >= 1) {
            result = num % 2 + result;
            num /= 2;
        }
        if (result.equals("")) { result = "0";}
        System.out.println(result);
    }

    public static void calculateOctal (int num) {
        String result = "";
        while (num >= 1) {
            result = num % 8 + result;
            num /= 8;
        }
        if (result.equals("")) { result = "0";}
        System.out.println(result);
    }

    public static void calculateHexadecimal (int num) {
        String result = "";
        while (num >= 1) {
            switch (num % 16) {
                case 10:
                    result = "A" + result;
                    break;
                case 11:
                    result = "B" + result;
                    break;
                case 12:
                    result = "C" + result;
                    break;
                case 13:
                    result = "D" + result;
                    break;
                case 14:
                    result = "E" + result;
                    break;
                case 15:
                    result = "F" + result;
                    break;
                default:
                    result = num % 16 + result;
                    break;
            }
            num /= 16;
        }
        if (result.equals("")) { result = "0";}
        System.out.println(result);
    }

    public static void calculateReciprocalHexadecimal (int num) {
        String result = "0.";
        if (num == 0) {
            System.out.println("Don't exist");
        } else {
            double newNum = 1 / (double) num;
            for (int i = 0; i < 8; i++) {
                newNum -= (int) newNum;
                switch ((int) (newNum * 16)) {
                    case 10:
                        result += "A";
                        break;
                    case 11:
                        result += "B";
                        break;
                    case 12:
                        result += "C";
                        break;
                    case 13:
                        result += "D";
                        break;
                    case 14:
                        result += "E";
                        break;
                    case 15:
                        result += "F";
                        break;
                    default:
                        result += (int) (newNum * 16);
                        break;
                }
                newNum *= 16;
            }
            System.out.println(result);
        }
    }

    public static void calculateAll (int num) {
        System.out.println("Integer = " + num);
        System.out.println("Binary:");
        calculateBinary(num);
        System.out.println("Octal:");
        calculateOctal(num);
        System.out.println("Hexadecimal:");
        calculateHexadecimal(num);
        System.out.println("Reciprocal Hexadecimal:");
        calculateReciprocalHexadecimal(num);
        System.out.println();
    }
}
