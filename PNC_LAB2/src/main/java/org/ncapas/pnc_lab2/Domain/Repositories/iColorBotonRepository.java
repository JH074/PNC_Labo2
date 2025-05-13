package org.ncapas.pnc_lab2.Domain.Repositories;

import org.ncapas.pnc_lab2.Domain.Entities.ColorBoton;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface iColorBotonRepository extends iGenericRepository<ColorBoton, UUID> {

    //Funcion JPA
    public ColorBoton findByIdColorBoton(UUID idColorBoton);

    //Query Nativa
    @Query(nativeQuery = true, value = "SELECT nombre FROM color_boton WHERE id_color_boton = :idColorBoton")
    public String findNombreByIdColorBotonNative (@Param("idColorBoton") UUID idColorBoton);

    //Query Derivada
    @Query("SELECT c FROM ColorBoton c WHERE c.codigo = :codigo")
    public ColorBoton findColorBotonByCodigo(@Param("codigo") String codigo);
}
