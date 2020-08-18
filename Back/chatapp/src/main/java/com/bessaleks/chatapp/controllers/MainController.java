package com.bessaleks.chatapp.controllers;
import com.bessaleks.chatapp.models.User;
import com.bessaleks.chatapp.repository.MessageRepository;
import com.bessaleks.chatapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {



    @GetMapping("/")
    public String login(Model model) {
        model.addAttribute("title", "ChatApp by BessAleks");
        return "login";
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("title", "ChatApp Home");
        return "home";
    }

    @GetMapping("/addUserSuccessful")
    public String addUserSuccessful(Model model) {
        return "addUserSuccessful";
    }

    @GetMapping("/createAnAccount")
    public String createAnAccount(Model model) {
        model.addAttribute("title", "ChatApp Create An Account");
        return "createAnAccount";
    }

}
