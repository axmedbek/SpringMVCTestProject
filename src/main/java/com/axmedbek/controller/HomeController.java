package com.axmedbek.controller;


import com.axmedbek.model.User;
import com.axmedbek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("users",userService.getAllUser());
        return "home";
    }

    @RequestMapping("/create_user")
    public String addUser(Model model){
        model.addAttribute("user",new User());
        return "create_user";
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public String addUserAction(@ModelAttribute("user") User user,Model model){
        userService.saveUser(user);
        return "redirect:/";
    }

    @RequestMapping("/delete/{id}")
    public String deleteUserAction(@PathVariable("id") int id){
        userService.deleteUser(id);
        return "redirect:/";
    }
}
