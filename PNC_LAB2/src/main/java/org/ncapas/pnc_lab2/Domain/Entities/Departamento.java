package org.ncapas.pnc_lab2.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idDepartamento;

    private String codigo;

    private String nombre;
}
