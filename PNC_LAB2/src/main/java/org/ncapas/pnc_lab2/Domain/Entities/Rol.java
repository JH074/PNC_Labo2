package org.ncapas.pnc_lab2.Domain.Entities;

import jakarta.persistence.*;

        import java.util.UUID;


@Entity
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idRol;

    private String codigo;

    private String nombre;

}