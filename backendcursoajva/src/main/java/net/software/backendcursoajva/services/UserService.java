package net.software.backendcursoajva.services;

import org.springframework.stereotype.Service;

import net.software.backendcursoajva.shared.dto.UserDTO;

@Service
public class UserService implements UserServiceInterface {

    
    @Override
    public UserDTO createUser(UserDTO userDto) {
        // TODO logica de la creacion del usuario
        return null;
    }
    
    
}
