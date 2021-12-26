package com.mark0wka.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "userTb")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "patronymic", nullable = false)
    private String patronymic;

    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "salary", nullable = false)
    private int salary;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "position", nullable = false)
    private String position;

    @Override
    public String toString() {
        return "User id = " + id + ": " +
                "First Name: " + firstName + '\n' +
                ", Last Name: " + lastName + '\n' +
                ", Patronymic: " + patronymic + '\n' +
                ", Age: " + age +
                ", Salary: " + salary +
                ", Email: " + email + '\n' +
                ", Position: " + position + '\n' +
                '\n';
    }
}
