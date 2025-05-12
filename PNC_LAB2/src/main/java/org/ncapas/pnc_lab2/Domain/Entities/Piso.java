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
public class Piso {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idPiso;

    @OneToOne
    @JoinColumn(name = "id_color_boton", nullable = false, foreignKey = @ForeignKey(name = "FK_piso_color_boton"))
    private ColorBoton colorBoton;

    @ManyToOne
    @JoinColumn(name = "id_sucursal", nullable = false, foreignKey = @ForeignKey(name = "FK_piso_sucursal"))
    private Sucursal sucursal;

    @Column
    private String nombre;

}
