package org.ncapas.pnc_lab2.Domain.Repositories;

import org.ncapas.pnc_lab2.Domain.Entities.Departamento;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface iDepartamentoRepository extends iGenericRepository<Departamento, UUID>{

    //Funcion JPA
    public Departamento findByIdDepartamento (UUID idDepartamento);

    //Query Nativa
    @Query(nativeQuery = true, value = "SELECT nombre FROM departamento WHERE id_departamento = :idDepartamento")
    public String findNombreByIdDepartamentoNative (@Param("idDepartamento") UUID idDepartamento);

    //Query Derivada
    @Query("SELECT c FROM Departamento c WHERE c.codigo = :codigo")
    public Departamento findDepartamentoByCodigo (@Param("codigo") String codigo);
}
