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
public class Ornamento {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idOrnamento;
    @Column
    private String codigo;
    @Column
    private String nombre;

}
