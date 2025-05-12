package org.ncapas.pnc_lab2.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Habitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idHabitacion;

    @ManyToOne
    @JoinColumn(name = "id_tipo_habitacion", nullable = false,
    foreignKey = @ForeignKey(name = "FK_tipo_habitacion"))
    private TipoHabitacion tipoHabitacion;

    @ManyToOne
    @JoinColumn(name = "id_piso", nullable = false,
    foreignKey = @ForeignKey(name = "FK_piso"))
    private Piso piso;

    @Column
    private String nombre;
    @Column
    private String capacidad;


}
