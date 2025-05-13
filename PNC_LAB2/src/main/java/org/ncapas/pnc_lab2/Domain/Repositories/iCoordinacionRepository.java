package org.ncapas.pnc_lab2.Domain.Repositories;

import org.ncapas.pnc_lab2.Domain.Entities.ColorBoton;
import org.ncapas.pnc_lab2.Domain.Entities.Coordinacion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface iCoordinacionRepository extends iGenericRepository<Coordinacion, UUID> {

    //Funcion JPA
    public Coordinacion findByIdCoordinacion(UUID idCoordinacion);

    //Query Nativa
    @Query(nativeQuery = true, value = "SELECT estado FROM coordinacion WHERE id_coordinacion = :idCoordinacion")
    public Boolean findEstadoByIdCoordinacionNative(@Param("idCoordinacion") UUID idCoordinacion);

    //Query Derivada
    @Query("SELECT e FROM Coordinacion e WHERE e.empleado.idEmpleado = :idEmpleado")
    public List<Coordinacion> findByEmpleado(@Param("idEmpleado") UUID idEmpleado);

}
