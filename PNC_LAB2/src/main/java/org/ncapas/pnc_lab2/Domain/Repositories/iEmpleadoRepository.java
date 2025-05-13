package org.ncapas.pnc_lab2.Domain.Repositories;

import org.ncapas.pnc_lab2.Domain.Entities.Empleado;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface iEmpleadoRepository extends iGenericRepository<Empleado, UUID> {

    // Función JPA
    public Empleado findByIdEmpleado(UUID idEmpleado);

    // Query nativa
    @Query(nativeQuery = true, value = "SELECT id_persona FROM empleado WHERE id_empleado = :idEmpleado")
    public UUID findIdPersonaByEmpleadoNative(@Param("idEmpleado") UUID idEmpleado);

    // Query derivada
    @Query("SELECT e FROM Empleado e WHERE e.sucursal.idSucursal = :idSucursal")
    List<Empleado> findBySucursal(@Param("idSucursal") UUID idSucursal);
}
