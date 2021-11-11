package com.mark0wka;

import com.mark0wka.chapter1.*;
import com.mark0wka.chapter2.EX5Point;
import com.mark0wka.chapter2.EX9Car;
import com.mark0wka.chapter3.ex1and2.Employee;
import com.mark0wka.chapter3.ex1and2.Measurable;
import com.mark0wka.chapter4.ex4and5.Circle;
import com.mark0wka.chapter4.ex4and5.Line;
import com.mark0wka.chapter4.ex4and5.Point;
import com.mark0wka.chapter4.ex4and5.Rectangle;

public class Main {
    public static void main(String[] args) {
        EX1.calculateAll(0);
        EX1.calculateAll(16);
        EX1.calculateAll(375);
        EX1.calculateAll(933);
        EX1.calculateAll(10);

        EX2.calculateAll(-654345);
        EX2.calculateAll(78686);

        EX3.getMaxConditional(1,2,3);
        EX3.getMaxConditional(3,2,1);
        EX3.getMaxConditional(1,3,2);
        EX3.getMaxWithMath(1,2,3);
        EX3.getMaxWithMath(3,2,1);
        EX3.getMaxWithMath(1,3,2);

        EX4.getMinMax();

        EX6.calculateFactorial(6);
        EX6.calculateFactorial(1000);

        EX13.lotery();

        EX5Point point = new EX5Point().translate(2,3).scale(0.5);
        System.out.println(point.toString());
        EX5Point point1 = new EX5Point(3,4).translate(1,3).scale(0.5);
        System.out.println(point1.toString());

        EX9Car car = new EX9Car(10);
        car.fillTank(10);
        car.move(10);
        System.out.println(car.getLitersOfFuel());
        System.out.println(car.calculateDistance());
        car.move(100);
        System.out.println(car.getLitersOfFuel());
        System.out.println(car.calculateDistance());

        Employee employee = new Employee("Vlad", 10000);
        Employee employee1 = new Employee("Ivan", 12000);
        Employee employee2 = new Employee("Roma", 8000);
        Employee[] employees = new Employee[]{employee,employee1,employee2};
        System.out.println(employee.average(employees));
        Measurable resEmployee = employee.largest(employees);
        System.out.println(resEmployee.getName());

        Point dot = new Point(2,2);
        Point dot1 = new Point(6,6);


        Circle circle = new Circle(dot, 2);
        System.out.println(circle.getCentre());
        circle.moveBy(2,2);
        System.out.println(circle.getCentre());

        Rectangle rectangle = new Rectangle(dot, 4,6);
        System.out.println(rectangle.getCentre());
        rectangle.moveBy(2,2);
        System.out.println(rectangle.getCentre());

        Line line = new Line(dot, dot1);
        System.out.println(line.getCentre());
        line.moveBy(2,2);
        System.out.println(line.getCentre());

        Circle circle1 = circle.clone();
        circle.moveBy(2,2);
        System.out.println(circle.getCentre());
        System.out.println(circle1.getCentre());

    }
}
