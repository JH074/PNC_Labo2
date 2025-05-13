package org.ncapas.pnc_lab2.Domain.Repositories;

import org.ncapas.pnc_lab2.Domain.Entities.Habitacion;
import org.ncapas.pnc_lab2.Domain.Entities.Rol;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface iHabitacionRepository extends iGenericRepository<Habitacion, UUID> {

    //Funcion JPA
    public Habitacion findByIdHabitacion (UUID idHabitacion);

    //Query nativa
    @Query(nativeQuery = true, value = "SELECT nombre FROM habitacion WHERE id_habitacion = :idHabitacion")
    String findNombreByIdNative(@Param("idHabitacion") UUID idHabitacion);

    //Query derivada
    @Query("SELECT c FROM Habitacion c WHERE c.capacidad = :capacidad")
    Rol findHabitacionByCapacidad(@Param("capacidad") String capacidad);
}

