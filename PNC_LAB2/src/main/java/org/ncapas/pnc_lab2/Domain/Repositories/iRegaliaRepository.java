package org.ncapas.pnc_lab2.Domain.Repositories;

import org.ncapas.pnc_lab2.Domain.Entities.Regalia;
import org.ncapas.pnc_lab2.Domain.Entities.Sucursal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface iRegaliaRepository extends iGenericRepository<Regalia, UUID> {

    //Funcion JPA
    public Regalia findByIdRegalia (UUID idRegalia);

    //Query Nativa
    @Query(nativeQuery = true, value = "SELECT nombre FROM regalia WHERE id_regalia = :idRegalia")
    public String findNombreByIdRegaliaNative (@Param("idRegalia") UUID idRegalia);

    //Query Derivada
    @Query("SELECT p FROM Regalia p WHERE p.puntoscoste = :puntoscoste")
    public Regalia findRegaliaByPuntoscoste (@Param("puntoscoste") String puntoscoste);
}
