package com.mark0wka.math;

import java.util.Objects;

public class MyComplex {

    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    @Override
    public String toString() {
        if (imag >= 0) {
            return real + " + " + imag + 'i';
        } else return real + " - " + -imag + 'i';
    }

    public void setValue (double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public boolean isReal () {
        if (this.real == 0.0) {
            return false;
        } else return true;
    }

    public boolean isImaginary () {
        if (this.imag == 0.0) {
            return false;
        } else return true;
    }

    public boolean equals(double real, double imag) {
        if (this.real == real && this.imag == imag) {
            return true;
        } else return false;
    }

    /*public boolean equals(MyComplex complex) {
        if (this.real == complex.real && this.imag == complex.imag) {
            return true;
        } else return false;
    }*/

    public double magnitude() {
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imag, 2));
    }

    public double argument() {
        return Math.atan(this.imag / this.real);
    }

    public MyComplex add (MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew (MyComplex right) {
        MyComplex result = new MyComplex();
        result.real = this.real + right.real;
        result.imag = this.imag + right.imag;
        return result;
    }

    public MyComplex subtract (MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew (MyComplex right) {
        MyComplex result = new MyComplex();
        result.real = this.real - right.real;
        result.imag = this.imag - right.imag;
        return result;
    }

    public MyComplex multiply (MyComplex right) {
        double tmpReal = this.real * right.real - this.imag * right.imag;
        double tmpImag = this.real * right.imag + this.imag * right.real;
        this.real = tmpReal;
        this.imag = tmpImag;
        return this;
    }

    public MyComplex divide (MyComplex right) {
        double tmpReal = (this.real * right.real + this.imag * right.imag)/(Math.pow(right.real, 2) + Math.pow(right.imag, 2));
        double tmpImag = (this.imag * right.real - this.real * right.imag)/(Math.pow(right.real, 2) + Math.pow(right.imag, 2));
        this.real = tmpReal;
        this.imag = tmpImag;
        return this;
    }

    public MyComplex conjugate () {
        return new MyComplex(this.real, -this.imag);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyComplex complex = (MyComplex) o;
        return Double.compare(complex.real, real) == 0 && Double.compare(complex.imag, imag) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = (int) (31 * result + real);
        result = (int) (31 * result + imag);

        return result;
    }
}
