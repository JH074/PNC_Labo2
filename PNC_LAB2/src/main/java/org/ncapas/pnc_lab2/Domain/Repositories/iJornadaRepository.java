package org.ncapas.pnc_lab2.Domain.Repositories;

import org.ncapas.pnc_lab2.Domain.Entities.Jornada;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface iJornadaRepository extends iGenericRepository<Jornada, UUID>{

    //Funcion JPA
    Jornada findByIdJornada(UUID idJornada);

    //Query nativa
    @Query(nativeQuery = true, value = "SELECT nombre FROM jornada WHERE id_jornada = :idJornada")
    String findNombreByIdNative(@Param("idJornada") UUID idJornada);

    //Query derivada
    @Query("SELECT j FROM Jornada j WHERE j.codigo = :codigo")
    Jornada findJornadaByCodigo(@Param("codigo") String codigo);

}
