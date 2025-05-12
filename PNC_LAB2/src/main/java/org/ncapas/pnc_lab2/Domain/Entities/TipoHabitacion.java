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

public class TipoHabitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idTipoHabitacion;
    @Column
    private String codigo;
    @Column
    private String nombre;

}
