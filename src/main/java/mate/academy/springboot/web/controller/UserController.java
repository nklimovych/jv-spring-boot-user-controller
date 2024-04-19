package mate.academy.springboot.web.controller;

import java.util.List;
import mate.academy.springboot.web.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/users")
public class UserController {
    @GetMapping
    @ResponseBody
    public List<User> getAll() {
        return List.of(
                new User(1L, "alice@gmail.com"),
                new User(2L, "bob@gmail.com"));
    }

    @PostMapping
    @ResponseBody
    public String addUser(@RequestBody User user) {
        return String.format("User successfully created to DB. "
                + "Id: %s, email: %s", user.id(), user.email());
    }
}
