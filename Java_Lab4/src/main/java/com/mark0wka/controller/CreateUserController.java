package com.mark0wka.controller;

import com.mark0wka.entity.User;
import com.mark0wka.mail.MailSender;
import com.mark0wka.repository.UserRepository;
import com.mark0wka.service.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CreateUserController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/create-user")
    public String createUser(Model model) {
        model.addAttribute("user", new User());
        return "create-user";
    }

    @PostMapping("/create-user")
    public String createUser(@ModelAttribute User user, Model model) {
        if (!new ValidationService().userValidator(user)) {
            return "not-valid-data";
        }

        repository.save(user);
        model.addAttribute("user", user);

        MailSender mailSender = new MailSender();
        String message = String.format(
                "Hello, %s %s %s!\n" +
                        "Thanks for registration!",
                user.getFirstName(),
                user.getPatronymic(),
                user.getLastName()
        );
        mailSender.send(user.getEmail(), "Hello", message);
        return "result";
    }
}
