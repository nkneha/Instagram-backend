package com.example.Instagram_Backend.controller;

import com.example.Instagram_Backend.model.Post;
import com.example.Instagram_Backend.model.User;
import com.example.Instagram_Backend.model.dto.SignInInput;
import com.example.Instagram_Backend.model.dto.SignUpOutput;
import com.example.Instagram_Backend.repository.IAuthenticationRepo;
import com.example.Instagram_Backend.service.AuthenticationService;
import com.example.Instagram_Backend.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    AuthenticationService authenticationService;

    //signup, sign in and sign out a particular insta user
    @PostMapping("user/signUp")
    public SignUpOutput signUpInstaUser(@RequestBody User user){
        return userService.signUpInstaUser(user);
    }
    @PostMapping("user/signIn")
    public String sigInInstaUser(@RequestBody @Valid SignInInput signInInput)
    {
        return userService.signInUser(signInInput);
    }
    @PostMapping("post")
    public String createInstaPost(@RequestBody Post post, @RequestParam String email, @RequestParam String token)
    {
        if(authenticationService.authenticate(email,token)) {
            return userService.createInstaPost(post,email);
        }
        else {
            return "Not an Authenticated user activity!!!";
        }
    }




}
