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

    @ManyToOne
    @JoinColumn(name = "id_empleado", nullable = false,
    foreignKey = @ForeignKey(name = "FK_empleado"))
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "id_piso", nullable = false,
    foreignKey = @ForeignKey(name = "FK_piso"))
    private Piso piso;

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
