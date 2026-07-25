package org.acme.repo;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.dtos.UsuarioDTO;

import java.util.HashMap;

@ApplicationScoped
public class UsuarioRepo extends GenericRepo<UsuarioDTO> {

    static {
        super.insert(new UsuarioDTO());
    }

}
