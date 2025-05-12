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

public class OrnamentoXHabitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idOrnamentoXHabitacion;

    @ManyToOne
    @JoinColumn(name = "id_ornamento", nullable = false,
    foreignKey = @ForeignKey(name = "FK_ornamento_habitacion"))
    private Ornamento ornamento;

    @ManyToOne
    @JoinColumn(name = "id_habitacion", nullable = false,
            foreignKey = @ForeignKey(name = "FK_habitacion"))
    private Habitacion habitacion;

}
