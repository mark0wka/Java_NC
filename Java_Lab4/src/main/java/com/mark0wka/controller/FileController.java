package com.mark0wka.controller;

import com.mark0wka.entity.User;
import com.mark0wka.repository.UserRepository;
import com.mark0wka.service.FileReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Controller
public class FileController {

    public static final String FILE_PATH = "src/main/resources/files/file.txt";

    @Autowired
    private UserRepository repository;

    @GetMapping("/send-file")
    public String sendFile () {
        return "send-file";
    }

    @PostMapping("/send-file")
    public String sendFile(@RequestParam("file") MultipartFile file, Model model) {
        if (file.isEmpty()) {
            return "not-valid-data";
        }

        try{
            Files.copy(file.getInputStream(), Paths.get(FILE_PATH), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

        User user = FileReaderService.readFile();
        repository.save(user);

        model.addAttribute("userModel", user);

        return "result";
    }
}
