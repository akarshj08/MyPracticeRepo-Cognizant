package com.akarshproject.JWT_Auth.and.Security.Controller;
import com.akarshproject.JWT_Auth.and.Security.Model.Users;
import com.akarshproject.JWT_Auth.and.Security.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Users adduser(@RequestBody Users newuser)
    {
        userService.register(newuser);
        return newuser;
    }

    @PostMapping("/login")
    public String login(@RequestBody Users user)
    {
        return userService.verifyuser(user);
    }
}