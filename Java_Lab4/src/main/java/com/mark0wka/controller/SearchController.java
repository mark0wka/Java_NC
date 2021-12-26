package com.mark0wka.controller;

import com.mark0wka.entity.User;
import com.mark0wka.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SearchController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/find-by-name")
    public String findByName (Model model) {
        model.addAttribute("user", new User());
        return "find-by-name";
    }

    @PostMapping("/find-by-name")
    public String findByName(@ModelAttribute User user, Model model) {
        List<User> userList = repository.findByFirstNameAndLastName(user.getFirstName(), user.getLastName());
        if(userList.size() == 0) {
            return "user-not-found";
        }
        model.addAttribute("userList", userList);
        return "search-result";
    }
}
