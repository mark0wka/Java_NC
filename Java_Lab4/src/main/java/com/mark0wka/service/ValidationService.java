package com.mark0wka.service;

import com.mark0wka.entity.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationService {

    private Pattern emailPattern;
    private Pattern namePattern;
    private Matcher matcher;
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
    private static final String NAME_PATTERN = "[A-Z][a-z]*";

    public ValidationService() {
        emailPattern = Pattern.compile(EMAIL_PATTERN);
        namePattern = Pattern.compile(NAME_PATTERN);
    }

    public boolean userValidator(User user) {

        matcher = namePattern.matcher(user.getFirstName());
        boolean firstNameValid = matcher.matches();
        matcher = namePattern.matcher(user.getLastName());
        boolean lastNameValid = matcher.matches();
        matcher = emailPattern.matcher(user.getEmail());
        boolean emailValid = matcher.matches();
        boolean ageValid = user.getAge() > 0;
        boolean salaryValid = user.getSalary() > 0;
        return firstNameValid && lastNameValid && emailValid && ageValid && salaryValid;
    }

}
