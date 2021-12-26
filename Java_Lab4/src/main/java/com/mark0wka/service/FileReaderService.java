package com.mark0wka.service;

import com.mark0wka.entity.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderService {

    public static User readFile()
    {
        File file = new File("src/main/resources/files/file.txt");
        User user = new User();
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        user.setFirstName(sc.nextLine());
        user.setLastName(sc.nextLine());
        user.setPatronymic(sc.nextLine());
        user.setAge(Integer.parseInt(sc.nextLine()));
        user.setSalary(Integer.parseInt(sc.nextLine()));
        user.setEmail(sc.nextLine());
        user.setPosition(sc.nextLine());
        sc.close();
        file.delete();
        return user;
    }

}
