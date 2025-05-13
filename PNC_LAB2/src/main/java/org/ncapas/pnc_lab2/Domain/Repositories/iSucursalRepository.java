package org.ncapas.pnc_lab2.Domain.Repositories;

import org.ncapas.pnc_lab2.Domain.Entities.Departamento;
import org.ncapas.pnc_lab2.Domain.Entities.Sucursal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface iSucursalRepository extends iGenericRepository<Sucursal, UUID>{

    //Funcion JPA
    public Sucursal findByIdSucursal (UUID idSucursal);

    //Query Nativa
    @Query(nativeQuery = true, value = "SELECT nombre FROM sucursal WHERE id_sucursal = :idSucursal")
    public String findNombreByIdSucursalNative (@Param("idSucursal") UUID idSucursal);

    //Query Derivada
    @Query("SELECT u FROM Sucursal u WHERE u.ubicacion = :ubicacion")
    public Sucursal findSucursalByUbicacion (@Param("ubicacion") String ubicacion);
}
