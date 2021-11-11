package com.mark0wka.chapter3.ex1and2;

public class Employee implements Measurable {

    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public double getMeasure() {
        return this.salary * 12;
    }

    public double average(Measurable[] object) {
        double sum = 0;
        for (int i = 0; i < object.length; i ++) {
            sum += object[i].getMeasure();
        }
        return sum/ object.length;
    }

    public Measurable largest(Measurable[] objects) {
        double tmp = 0;
        int tmpIter = -1;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].getMeasure() > tmp) {
                tmp = objects[i].getMeasure();
                tmpIter = i;
            }
        }
        return objects[tmpIter];
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
