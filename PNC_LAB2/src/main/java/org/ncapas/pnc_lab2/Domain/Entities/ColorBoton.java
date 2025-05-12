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
public class ColorBoton {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idColorBoton;

    @Column
    private String codigo;

    @Column
    private String nombre;
}
