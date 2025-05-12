package org.ncapas.pnc_lab2.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class ExpedienteReparacion {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idExpedienteReparacion;

    @ManyToOne
    @JoinColumn(name = "id_habitacion", nullable = false,
    foreignKey = @ForeignKey(name = "FK_habitacion"))
    private Habitacion habitacion;

    @Column
    private LocalDate fecha;
    @Column
    private LocalTime hora;
    @Column
    private String descripcion_reparacion;

}
