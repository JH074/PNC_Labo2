package org.ncapas.pnc_lab2.Domain.Repositories;

import org.ncapas.pnc_lab2.Domain.Entities.Piso;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface iPisoRepository extends iGenericRepository<Piso, UUID> {

    //Funcion JPA
    public Piso findByIdPiso (UUID piso);

    //Query Nativa
    @Query(nativeQuery = true, value = "SELECT nombre FROM piso WHERE id_piso = :idPiso")
    public String findNombreByIdPisoNative(@Param("idPiso") UUID idPiso);

    //Query Derivada
    @Query("SELECT p FROM Piso p WHERE p.sucursal.idSucursal = :idSucursal")
    List<Piso> findPisoBySucursal(@Param("idSucursal") UUID idSucursal);
}
