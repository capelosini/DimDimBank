package com.api.dimdim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.api.dimdim.models.User;
import com.api.dimdim.repository.PfUserRepository;
import com.api.dimdim.services.CepService;

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

@GetMapping("/cep")
public ResponseEntity<String> getAddressByCep(@RequestBody String cep) {
    try {
        String addressData = CepService.consultarCep(cep);
        // Update user's address or return address data as needed (replace with your logic)
        return ResponseEntity.ok(addressData);
    } catch (Exception e) {
        return ResponseEntity.badRequest().body("Invalid CEP or error retrieving address");
    }
}

}
