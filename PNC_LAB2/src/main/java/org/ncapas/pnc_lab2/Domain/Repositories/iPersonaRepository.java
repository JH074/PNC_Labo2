package org.ncapas.pnc_lab2.Domain.Repositories;


import org.ncapas.pnc_lab2.Domain.Entities.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface iPersonaRepository extends iGenericRepository<Persona, UUID>{

    //Funcion JPA
    public Persona findByIdPersona(UUID idPersona);

    //Query Nativa
    @Query(nativeQuery = true, value = "SELECT apellido FROM persona WHERE id_persona = :idPersona")
    public String findApellidoByIdPersonaNative(@Param("idPersona") UUID idPersona);

    //Query Derivada
    @Query("SELECT n FROM Persona n WHERE n.nombre = :nombre")
    public Persona findPersonaByNombre(@Param("nombre") String nombre);
}
