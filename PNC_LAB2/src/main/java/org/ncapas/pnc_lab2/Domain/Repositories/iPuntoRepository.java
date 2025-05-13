package org.ncapas.pnc_lab2.Domain.Repositories;

import org.ncapas.pnc_lab2.Domain.Entities.Punto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface iPuntoRepository extends iGenericRepository<Punto, UUID> {

    // Función JPA
    public Punto findByIdPuntos(UUID idPuntos);

    // Query nativa
    @Query(nativeQuery = true, value = "SELECT cantidad_puntos FROM punto WHERE id_puntos = :idPuntos")
    int findCantidadPuntosByIdNative(@Param("idPuntos") UUID idPuntos);

    // Query derivada
    @Query("SELECT p FROM Punto p WHERE p.empleado.idEmpleado = :idEmpleado")
    List<Punto> findByEmpleado(@Param("idEmpleado") UUID idEmpleado);
}
