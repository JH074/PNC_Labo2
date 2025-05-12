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
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idEmpleado;

    @OneToOne
    @JoinColumn(name = "id_persona", nullable = false, foreignKey = @ForeignKey(name = "FK_empleado_persona"))
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "id_departamento", nullable = false, foreignKey = @ForeignKey(name = "FK_empleado_departamento"))
    private Departamento departamento;

    @ManyToOne
    @JoinColumn(name = "id_sucursal", nullable = false, foreignKey = @ForeignKey(name = "FK_empleado_sucursal"))
    private Sucursal sucursal;
}
