package com.api.dimdim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.api.dimdim.models.User;
import com.api.dimdim.repository.PfUserRepository;

@RequestMapping("/user")
@RestController
public class UserController {
@Autowired
private PfUserRepository repositoryUser;

@GetMapping("/findAll")
public ResponseEntity<List<User>> getAllUsers() {
    List<User> users = repositoryUser.findAllInSchema();
    return ResponseEntity.ok(users);
}

}
