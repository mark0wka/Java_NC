package com.mark0wka.math;

import java.util.Arrays;

public class MyPolinomial {

    private double[] coeffs;

    public MyPolinomial(double... coeffs) {
        this.coeffs = new double[coeffs.length];
        for (int i = 0; i < coeffs.length; i++)
        {
            this.coeffs[i] = coeffs[coeffs.length - i - 1];
        }
    }

    public int getDegree() {
        return this.coeffs.length - 1;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = this.coeffs.length - 1; i >= 0; i--) {
            result += this.coeffs[i] + "x^" + i + " + ";
        }
        return result.substring(0, result.length()-6);
    }

    public MyPolinomial add(MyPolinomial right) {
        int minDegree = this.getMinDegree(this.getDegree(), right.getDegree());
        MyPolinomial result = getMax(this, right);
        for (int i = 0; i < minDegree + 1; i++) {
            result.coeffs[i] = this.coeffs[i] + right.coeffs[i];
        }
        return result;
    }

    public MyPolinomial multiply(MyPolinomial right) {
        double[] resultMas = new double[this.getDegree() + right.getDegree() + 1];
        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++) {
                resultMas[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        return new MyPolinomial(reverse(resultMas));
    }

    private int getMinDegree (int left, int right) {
        if (left >= right) {
            return right;
        } else return left;
    }

    private MyPolinomial getMax(MyPolinomial left, MyPolinomial right) {
        if (left.coeffs.length >= right.coeffs.length) {
            return new MyPolinomial(reverse(left.coeffs));
        } else return new MyPolinomial(reverse(right.coeffs));
    }

    private double[] reverse(double[] coeffs) {
        double[] result = new double[coeffs.length];
        for (int i = 0; i < coeffs.length; i++) {
            result[i] = coeffs[coeffs.length - i - 1];
        }
        return result;
    }

    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i <= this.getDegree(); i++) {
            System.out.println(this.coeffs[i]);
            result += this.coeffs[i] * Math.pow(x, i);
        }
        return result;
    }
}
