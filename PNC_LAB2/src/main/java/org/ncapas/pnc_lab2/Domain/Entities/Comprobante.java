package org.ncapas.pnc_lab2.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Comprobante {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idComprobante;

    @ManyToOne
    @JoinColumn(name = "id_reservacion", nullable = false,
    foreignKey = @ForeignKey(name = "FK_reservacion"))
    private Reservacion reservacion;

    @Column
    private LocalDate fecha;
    @Column
    private String montocobro;

}
