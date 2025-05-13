package org.ncapas.pnc_lab2.Domain.Repositories;

import org.ncapas.pnc_lab2.Domain.Entities.Rol;
import org.ncapas.pnc_lab2.Domain.Entities.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface iUsuarioRepository extends iGenericRepository<Usuario, UUID> {

    
}
