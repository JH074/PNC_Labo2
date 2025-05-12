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
public class Coordinacion {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idCoordinacion;

    @ManyToOne
    @JoinColumn(name = "coordinador_id", nullable = false, foreignKey = @ForeignKey(name = "FK_coordinacion_coordinador"))
    private Empleado coordinador;

    @ManyToOne
    @JoinColumn(name = "id_empleado", nullable = false, foreignKey = @ForeignKey(name = "FK_coordinacion_empleado"))
    private Empleado empleado;

    @Column
    private Boolean estado;
}
