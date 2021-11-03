package com.mark0wka;

import com.mark0wka.boll.Boll;
import com.mark0wka.boll.Container;
import com.mark0wka.books.Author;
import com.mark0wka.books.Book;
import com.mark0wka.employee.Employee;
import com.mark0wka.figures.Circle;
import com.mark0wka.figures.MyPoint;
import com.mark0wka.figures.Rectangle;
import com.mark0wka.figures.Triangle;
import com.mark0wka.math.MyComplex;
import com.mark0wka.math.MyPolinomial;

public class Main {

    public static void main(String[] args) {

        //Circle
        System.out.println("====Cirlce Block====");
        Circle circle0 = new Circle();
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(10.0, "green");
        System.out.println(circle0.getColor());
        System.out.println(circle0.getRadius());
        circle0.setColor("yellow");
        circle0.setRadius(2.0);
        System.out.println(circle0);
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle0.calculateArea());
        System.out.println(circle1.calculateArea());
        System.out.println(circle2.calculateArea());
        System.out.println(circle0.hashCode());


        //Rectangle
        System.out.println("====Rectangle Block====");
        Rectangle rect0 = new Rectangle();
        Rectangle rect1 = new Rectangle(2.0f, 2.0f);
        System.out.println(rect0.getLength());
        System.out.println(rect0.getWidth());
        rect0.setLength(5.0f);
        rect0.setWidth(4.0f);
        System.out.println(rect0.calculateArea());
        System.out.println(rect1.calculatePerimetr());
        System.out.println(rect0);
        System.out.println(rect1);
        System.out.println(rect0.hashCode());

        //Employee
        System.out.println("====Employee Block====");
        Employee employee = new Employee(12, "Jack", "London", 9000);
        System.out.println(employee.getId());
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getName());
        employee.setSalary(10000);
        System.out.println(employee.getSalary());
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.raiseSalary(15));
        System.out.println(employee);
        System.out.println(employee.hashCode());

        //Book
        System.out.println("====Book Block====");
        Author author1 = new Author("Boris Eltsin", "beltsin@ussr.ru", 'm');
        Author author2 = new Author("Tina Kandelaki", "tkandelaki@gmail.com", 'f');
        Author[] authors = new Author[] {author1, author2};
        Book book = new Book("FullCringe", authors, 100.1);
        System.out.println(book.getName());
        System.out.println(book.getPrice());
        System.out.println(book.getQty());
        book.setPrice(150.5);
        book.setQty(12);
        System.out.println(book);
        System.out.println(book.getAuthorNames());
        System.out.println(book.hashCode());
        System.out.println(author1.hashCode());

        //MyPoint
        System.out.println("====MyPoint Block====");
        MyPoint point1 = new MyPoint(2,2);
        MyPoint point2 = new MyPoint(4,4);
        System.out.println(point1.getX());
        System.out.println(point1.getY());
        double[] cords = point1.getXY();
        System.out.println(cords[0] + ", " + cords[1]);
        System.out.println(point1.toString());
        System.out.println(point1.distance());
        System.out.println(point1.distance(point2));
        System.out.println(point1.distance(2, 4));
        System.out.println(point2.hashCode());

        //Triangle
        System.out.println("====Triangle Block====");
        MyPoint v1 = new MyPoint();
        MyPoint v2 = new MyPoint(0, 4);
        MyPoint v3 = new MyPoint(4, 0);
        Triangle triangle = new Triangle(v1, v2, v3);
        System.out.println(triangle.toString());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getType());
        Triangle triangle1 = new Triangle(0.0, 0.0, 1.0, 0.0, 0.5, 0.8660254);
        System.out.println(triangle1.toString());
        System.out.println(triangle1.getPerimeter());
        System.out.println(triangle1.getType());
        v3.setXY(5,5);
        Triangle triangle2 = new Triangle(v1,v2,v3);
        System.out.println(triangle2.toString());
        System.out.println(triangle2.getPerimeter());
        System.out.println(triangle2.getType());
        System.out.println(triangle.hashCode());

        //MyComplex
        System.out.println("====MyComplex Block====");
        MyComplex complex = new MyComplex();
        MyComplex complex1 = new MyComplex(2.0, 2.0);
        System.out.println(complex.isReal());
        System.out.println(complex.isImaginary());
        complex.setReal(2.0);
        complex.setImag(2.0);
        System.out.println(complex.getReal());
        System.out.println(complex.getImag());
        System.out.println(complex.toString());
        System.out.println(complex.isReal());
        System.out.println(complex.isImaginary());
        System.out.println(complex.equals(complex1));
        System.out.println(complex.equals(2.0, 2.0));
        complex1.setValue(6.0, 4.0);
        System.out.println(complex1.equals(complex));
        System.out.println(complex1.equals(2.0, 2.0));
        System.out.println(complex1.add(complex).toString());
        System.out.println(complex1.subtract(complex).toString());
        MyComplex complex2 = complex1.addNew(complex);
        MyComplex complex3 = complex1.subtractNew(complex);
        System.out.println(complex1.magnitude());
        System.out.println(complex1.argument());
        System.out.println();
        System.out.println(complex);
        System.out.println(complex1);
        System.out.println(complex2);
        System.out.println(complex3);
        System.out.println(complex2.multiply(complex).toString());
        System.out.println(complex2.divide(complex1).toString());
        MyComplex complex4 = complex1.conjugate();
        System.out.println(complex4);
        System.out.println(complex.hashCode());

        //MyPolinomial
        System.out.println("====MyPolinomial Block====");
        MyPolinomial polinomial = new MyPolinomial(4,3,2,1);
        MyPolinomial polinomial1 = new MyPolinomial(6,5,4,3,2,1);
        System.out.println(polinomial);
        System.out.println(polinomial.getDegree());
        System.out.println(polinomial1);
        System.out.println(polinomial1.getDegree());
        MyPolinomial polinomial2 = polinomial1.add(polinomial);
        System.out.println(polinomial2.toString());
        MyPolinomial polinomial3 = polinomial.multiply(polinomial1);
        System.out.println(polinomial3.toString());
        System.out.println(polinomial1.toString());
        System.out.println(polinomial1.evaluate(3.0));
        System.out.println(polinomial.hashCode());

        //Boll
        System.out.println("====Boll Block====");
        Boll boll = new Boll(5,5,2,2,45);
        System.out.println(boll.toString());
        Container container = new Container(3,3,10,10);
        System.out.println(container.toString());

        System.out.println(container.collideWith(boll));
        boll.move();
        System.out.println(container.collideWith(boll));
        System.out.println(boll.toString());
        boll.move();
        System.out.println(container.collideWith(boll));
        System.out.println(boll.toString());
        System.out.println();

        Boll boll1 = new Boll(5, 5, 2, 2,30);
        boll1.smartMove(container);
        System.out.println(container.collideWith(boll1));
        System.out.println(boll1.toString());

        boll1.smartMove(container);
        System.out.println(container.collideWith(boll1));
        System.out.println(boll1.toString());

        boll1.smartMove(container);
        System.out.println(container.collideWith(boll1));
        System.out.println(boll1.toString());

        boll1.smartMove(container);
        System.out.println(container.collideWith(boll1));
        System.out.println(boll1.toString());

        boll1.smartMove(container);
        System.out.println(container.collideWith(boll1));
        System.out.println(boll1.toString());

        boll1.smartMove(container);
        System.out.println(container.collideWith(boll1));
        System.out.println(boll1.toString());

        boll1.smartMove(container);
        System.out.println(container.collideWith(boll1));
        System.out.println(boll1.toString());

        boll1.smartMove(container);
        System.out.println(container.collideWith(boll1));
        System.out.println(boll1.toString());

        boll1.smartMove(container);
        System.out.println(container.collideWith(boll1));
        System.out.println(boll1.toString());

        boll1.smartMove(container);
        System.out.println(container.collideWith(boll1));
        System.out.println(boll1.toString());

        boll1.smartMove(container);
        System.out.println(container.collideWith(boll1));
        System.out.println(boll1.toString());

        boll1.smartMove(container);
        System.out.println(container.collideWith(boll1));
        System.out.println(boll1.toString());

        System.out.println(boll.hashCode());
        System.out.println(container.hashCode());
    }
}
