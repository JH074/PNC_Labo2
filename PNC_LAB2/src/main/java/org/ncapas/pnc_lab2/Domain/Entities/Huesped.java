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

public class Huesped {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idHuesped;

    @ManyToOne
    @JoinColumn(name = "id_regalia", nullable = false,
    foreignKey = @ForeignKey(name = "FK_regalia"))
    private Regalia regalia;

    @ManyToOne
    @JoinColumn(name = "id_persona", nullable = false,
            foreignKey = @ForeignKey(name = "FK_persona"))
    private Persona persona;




}
