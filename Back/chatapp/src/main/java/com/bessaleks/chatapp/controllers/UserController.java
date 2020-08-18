package com.bessaleks.chatapp.controllers;

import com.bessaleks.chatapp.models.User;
import com.bessaleks.chatapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/viewAllUsers")
    public String viewAllUsers(Model model) {
        Iterable <User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "viewAllUsers";
    }

    @PostMapping("/")
    public String inLogin(@RequestParam String userLogin, @RequestParam String userPassword, Model model) {
        Iterable <User> users = userRepository.findAll();
        for (User user : users){
            if(user.getUserLogin().equals(userLogin) && user.getUserPassword().equals(User.md5Apache(userPassword))){
                model.addAttribute("user", user);
            }
        }
        return "redirect:/userPersonalArea";
    }

    @PostMapping("/createAnAccount")
    public String addAnAccount(@RequestParam String userName, @RequestParam String userLogin, @RequestParam String userPassword, Model model) {
        User user = new User(userName, userLogin, userPassword);
        userRepository.save(user);
        return "redirect:/addUserSuccessful";
    }
}
