package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import web.model.User;
import web.service.UserService;

@Controller
public class CrudController {
    private final UserService userService;
    @Autowired
    public CrudController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/users")
    public String printUsers(ModelMap model) {
        model.addAttribute("users", userService.getAllUsers());
        return "table";
    }

    @GetMapping("/users/new")
    public String newUser(Model model) {
        model.addAttribute("user", new User());
        return "form";
    }

    @PostMapping("/users/update")
    public String create(@ModelAttribute("user") User user) {
        userService.addUser(user);
        return "redirect:/users";
    }

    @DeleteMapping("/users/{id}")
    public String delete(@ModelAttribute("id") Long id) {
        userService.deleteUser(id);
        return "redirect:/users";
    }

    @GetMapping("/users/update/{id}")
    public String selectUser(Model model, @ModelAttribute("id") Long id) {
        model.addAttribute("user", userService.getById(id));
        return "form";
    }
    @PostMapping("/users/update/{id}")
    public String update(@ModelAttribute("id") Long id, @ModelAttribute("user") User user) {
        userService.changeUser(id, user);
        return "redirect:/users";
    }
}
