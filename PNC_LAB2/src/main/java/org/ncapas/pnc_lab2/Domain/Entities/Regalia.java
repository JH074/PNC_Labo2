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

public class Regalia {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idRegalia;
    @Column
    private String descripcion;
    @Column
    private String nombre;
    @Column
    private String puntoscoste;

}
