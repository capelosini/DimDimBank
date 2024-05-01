package com.api.dimdim.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.dimdim.models.Usuario;
import com.api.dimdim.models.dtos.DadosCadastroUsuario;

import jakarta.validation.Valid;

@RequestMapping("/user")
@RestController
public class UserController {


List<Usuario> usuarios = new ArrayList<>();    



@PostMapping
public ResponseEntity createUser(@RequestBody @Valid DadosCadastroUsuario data) {
    Usuario usuario = new Usuario(data); 
    usuarios.add(usuario);
    return ResponseEntity.ok().build();
}

@GetMapping
public ResponseEntity<List<Usuario>> getAllUsers() {
    return ResponseEntity.ok(usuarios);
}


}
