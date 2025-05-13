package org.ncapas.pnc_lab2.Domain.Repositories;

import org.ncapas.pnc_lab2.Domain.Entities.Rotacion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface iRotacionRepository extends iGenericRepository<Rotacion, UUID>{

    //Funcion JPA
    Rotacion findByIdRotacion(UUID idRotacion);

    //Query nativa
    @Query(nativeQuery = true, value = "SELECT mes FROM rotacion WHERE id_rotacion = :idRotacion")
    String findMesByIdNative(@Param("idRotacion") UUID idRotacion);

    //Query derivada
    @Query("SELECT r FROM Rotacion r WHERE r.estado = :estado")
    List<Rotacion> findByEstado(@Param("estado") String estado);

}
