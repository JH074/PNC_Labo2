package org.ncapas.pnc_lab2.Domain.Repositories;

import org.ncapas.pnc_lab2.Domain.Entities.ExpedienteReparacion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface iExpedienteReparacionRepository extends iGenericRepository<ExpedienteReparacion, UUID> {

    //Funcion JPA
    ExpedienteReparacion findByIdExpedienteReparacion(UUID idExpedienteReparacion);

    //Query nativa
    @Query(nativeQuery = true, value = "SELECT descripcion_reparacion FROM expediente_reparacion WHERE id_expediënte_reparacion = :idExpedienteReparacion")
    String findDescripcionByIdNative(@Param("idExpedienteReparacion") UUID idExpedienteReparacion);

    //Query derivada
    @Query("SELECT e FROM ExpedienteReparacion e WHERE e.fecha = :fecha")
    ExpedienteReparacion findByFecha(@Param("fecha") java.time.LocalDate fecha);

}
