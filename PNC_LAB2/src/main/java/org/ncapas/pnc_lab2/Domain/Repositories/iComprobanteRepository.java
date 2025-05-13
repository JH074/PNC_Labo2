package org.ncapas.pnc_lab2.Domain.Repositories;

import org.ncapas.pnc_lab2.Domain.Entities.Comprobante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface iComprobanteRepository extends iGenericRepository<Comprobante, UUID>{

    //Funcion JPA
    Comprobante findByIdComprobante(UUID idComprobante);

    //Query nativa
    @Query(nativeQuery = true, value = "SELECT montocobro FROM comprobante WHERE id_comprobante = :idComprobante")
    String findMontoByIdNative(@Param("idComprobante") UUID idComprobante);

    //Query derivada
    @Query("SELECT c FROM Comprobante c WHERE c.fecha = :fecha")
    List<Comprobante> findByFecha(@Param("fecha") LocalDate fecha);

}
