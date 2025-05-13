package org.ncapas.pnc_lab2.Domain.Repositories;

import org.ncapas.pnc_lab2.Domain.Entities.Reservacion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface iReservacionRepository extends iGenericRepository<Reservacion, UUID> {

    //Funcion JPA
    Reservacion findByIdReservacion(UUID idReservacion);

    //Query nativa
    @Query(nativeQuery = true, value = "SELECT estado FROM reservacion WHERE id_reservacion = :idReservacion")
    String findEstadoByIdNative(@Param("idReservacion") UUID idReservacion);

    //Query derivada
    @Query("SELECT r FROM Reservacion r WHERE r.estado = :estado")
    Reservacion findByEstado(@Param("estado") String estado);

}
