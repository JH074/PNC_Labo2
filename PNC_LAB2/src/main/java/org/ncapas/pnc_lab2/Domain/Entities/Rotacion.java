package org.ncapas.pnc_lab2.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Rotacion {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idRotacion;

    @ManyToOne
    @JoinColumn(name = "id_jornada", nullable = false,
    foreignKey = @ForeignKey(name = "FK_jornada"))
    private Jornada jornada;

    @Column
    private LocalTime hora_inicio;
    @Column
    private LocalTime hora_fin;
    @Column
    private String mes;
    @Column
    private String año;
    @Column
    private String estado;

}
