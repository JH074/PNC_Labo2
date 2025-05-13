package org.ncapas.pnc_lab2.Domain.Repositories;

import org.ncapas.pnc_lab2.Domain.Entities.Ornamento;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface iOrnamentoRepository extends iGenericRepository<Ornamento, UUID>{

    //Funcion JPA
    public Ornamento findByIdOrnamento (UUID idOrnamento);

    //Query nativa
    @Query(nativeQuery = true, value = "SELECT nombre FROM ornamento WHERE id_ornamento = :idOrnamento")
    public Ornamento findNombreByIdNative(@Param("idOrnamento") UUID idOrnamento);

    //Query derivada
    @Query("SELECT c FROM Ornamento c WHERE c.codigo = :ornamento")
    Ornamento findOrnamentoByCodigo(@Param("codigo") String codigo);

}
