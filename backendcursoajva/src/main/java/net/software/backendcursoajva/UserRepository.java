package net.software.backendcursoajva;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.software.backendcursoajva.entities.userEntity;
@Repository
public interface UserRepository extends CrudRepository<userEntity, Long>{
    
}
