package org.ncapas.pnc_lab2.Domain.Repositories;

import org.ncapas.pnc_lab2.Domain.Entities.TipoHabitacion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface iTipoHabitacionRepository extends iGenericRepository<TipoHabitacion, UUID>{

    //Funcion JPA
    public TipoHabitacion findByIdTipoHabitacion (UUID idTipoHabitacion);

    //Query nativa
    @Query(nativeQuery = true, value = "SELECT nombre FROM tipohabitacion WHERE id_tipohabitacion = :idTipoHabitacion")
    String findNombreByIdNative(@Param("idTipoHabitacion") UUID idTipoHabitacion);

    //Query derivada
    @Query("SELECT c FROM TipoHabitacion c WHERE c.codigo = :codigo")
    TipoHabitacion findTipoHabitacionByCodigo(@Param("codigo") String codigo);

}
