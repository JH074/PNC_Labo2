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

public class Comprobante {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idComprobante;
    @Column
    private String reservacion;
    @Column
    private String fecha;
    @Column
    private String montocobro;

}
