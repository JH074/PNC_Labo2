package org.ncapas.pnc_lab2.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Punto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idPuntos;

    @ManyToOne
    @JoinColumn(name = "id_huesped", nullable = false, foreignKey = @ForeignKey(name = "FK_punto_huesped"))
    private Huesped huesped;

    @ManyToOne
    @JoinColumn(name = "id_empleado", nullable = false, foreignKey = @ForeignKey(name = "FK_punto_empleado"))
    private Empleado empleado;

    @Column
    private int cantidadPuntos;

    @Column
    private LocalDateTime ultimaActualizacion;
}
