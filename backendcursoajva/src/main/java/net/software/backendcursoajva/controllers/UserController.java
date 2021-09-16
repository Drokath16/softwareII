package net.software.backendcursoajva.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.software.backendcursoajva.models.request.UserDetailRequestModel;
import net.software.backendcursoajva.models.response.UserRes;

@RestController
@RequestMapping("/users") //http://localhost:8080/users
public class UserController {
    @GetMapping//obtener consultar informacion
    public String getUser(){
        return "Obtener usuarios";
    }
    @PostMapping//creando informacion
    public UserRes createUser(@RequestBody UserDetailRequestModel userdetails){
        return null;
    }
  
}
