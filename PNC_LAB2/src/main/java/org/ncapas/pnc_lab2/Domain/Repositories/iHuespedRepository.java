package org.ncapas.pnc_lab2.Domain.Repositories;

import org.ncapas.pnc_lab2.Domain.Entities.Huesped;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface iHuespedRepository extends iGenericRepository<Huesped, UUID> {


    //Funcion JPA
    Huesped findByIdHuesped(UUID idHuesped);

    //Query nativa
    @Query(nativeQuery = true, value = "SELECT id_persona FROM huesped WHERE id_huesped = :idHuesped")
    UUID findIdPersonaByIdHuespedNative(@Param("idHuesped") UUID idHuesped);

    //Query derivada
    @Query("SELECT h FROM Huesped h WHERE h.regalia.idRegalia = :idRegalia")
    List<Huesped> findHuespedesByRegalia(@Param("idRegalia") UUID idRegalia);

}
