package com.springbootjpa.springbootjpa.controller;

import com.springbootjpa.springbootjpa.entity.User;
import com.springbootjpa.springbootjpa.repository.UserRepository;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.util.List;

/**
 * @author lhw
 * @date 2020/9/26
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    public User addUser(@RequestBody User user){
        return userRepository.save(user);
    }


    @GetMapping(path = "/getAll")
    @ResponseBody
    public Page<User> getAllUser(Pageable pageable){
        Page<User> all = userRepository.findAll(pageable);
        return  all;
    }

}
