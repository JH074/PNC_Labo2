package org.ncapas.pnc_lab2.Domain.Repositories;


import org.ncapas.pnc_lab2.Domain.Entities.OrnamentoXHabitacion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface iOrnamentoXHabitacionRepository extends iGenericRepository<OrnamentoXHabitacion, UUID> {

    //Funcion JPA
    OrnamentoXHabitacion findByIdOrnamentoXHabitacion(UUID idOrnamentoXHabitacion);

    //Query nativa
    @Query(nativeQuery = true, value = "SELECT * FROM ornamentoxhabitacion WHERE id_habitacion = :idHabitacion")
    List<OrnamentoXHabitacion> findByHabitacionNative(@Param("idHabitacion") UUID idHabitacion);

    //Query derivada
    @Query("SELECT o FROM OrnamentoXHabitacion o WHERE o.ornamento.idOrnamento = :idOrnamento")
    List<OrnamentoXHabitacion> findByOrnamento(@Param("idOrnamento") UUID idOrnamento);

}
