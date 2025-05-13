package org.ncapas.pnc_lab2.Domain.Repositories;

import org.ncapas.pnc_lab2.Domain.Entities.Rol;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface iRolRepository extends iGenericRepository<Rol, Integer> {

    //Funcion JPA
    public Rol findByIdRol (Integer idRol);

    //Query nativa
    @Query(nativeQuery = true, value = "SELECT nombre FROM rol WHERE id_rol = :idRol")
    String findNombreByIdNative(@Param("idRol") Integer idRol);

    //Query derivada
    @Query("SELECT r FROM Rol r WHERE r.codigo = :codigo")
    Rol findRolByCodigo(@Param("codigo") String codigo);
}
