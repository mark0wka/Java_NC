package com.mark0wka.chapter1;

import java.math.BigInteger;

public class EX6 {

    public static void calculateFactorial (int num) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= num; i++) {
            result =  result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
    }
}
