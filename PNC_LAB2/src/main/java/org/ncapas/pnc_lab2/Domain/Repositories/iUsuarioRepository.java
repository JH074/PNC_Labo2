package org.ncapas.pnc_lab2.Domain.Repositories;

import org.ncapas.pnc_lab2.Domain.Entities.Rol;
import org.ncapas.pnc_lab2.Domain.Entities.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface iUsuarioRepository extends iGenericRepository<Usuario, UUID> {

    //Funcion JPA
    public Usuario findByIdUsuario (UUID idUsuario);

    //Query nativa
    @Query(nativeQuery = true, value = "SELECT id_usuario FROM usuario WHERE id_usuario = :id_usuario")
    String findIdUsuarioByIdNative(@Param("idUsuario") UUID idUsuario);

    //Query derivada
    @Query("SELECT c FROM Usuario c WHERE c.correo = :correo")
    Usuario findUsuarioByCorreo(@Param("correo") Usuario correo);

}
