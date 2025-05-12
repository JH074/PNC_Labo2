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

public class Reservacion {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idReservacion;

    @ManyToOne
    @JoinColumn(name = "id_habitacion", nullable = false,
foreignKey = @ForeignKey(name = "FK_habitacion"))
    private Habitacion habitacion;

    
    @Column
    private LocalTime hora_entrada;
    @Column
    private LocalTime hora_salida;
    @Column
    private String estado;


}
