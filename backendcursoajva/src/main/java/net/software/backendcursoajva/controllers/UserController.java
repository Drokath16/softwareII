package net.software.backendcursoajva.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import net.software.backendcursoajva.models.request.UserDetailRequestModel;
import net.software.backendcursoajva.models.responses.UserRest;
import net.software.backendcursoajva.services.UserServiceInterface;
import net.software.backendcursoajva.shared.dto.UserDTO;


@RestController
@RequestMapping("/users") //http://localhost:8080/users
public class UserController {
    @Autowired
    UserServiceInterface userService;

    @GetMapping//obtener consultar informacion
    public String getUser(){
        return "Obtener usuarios";
    }
    @PostMapping//creando informacion
    public UserRest createUser(@RequestBody UserDetailRequestModel userdetails){
        UserRest userToReturn = new UserRest();
        UserDTO userDTO= new UserDTO();
        BeanUtils.copyProperties(userdetails, userDTO);
        UserDTO createdUser = userService.createUser(userDTO);
        BeanUtils.copyProperties(createdUser, userToReturn);
        return userToReturn;
    }
  
}
