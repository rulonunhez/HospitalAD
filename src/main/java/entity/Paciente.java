package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pacientes")
public class Paciente {

    @Id
    private int idPaciente;

    private String nombre;

    public Paciente() {

    }

    public Paciente(String nombre) {
        this.nombre = nombre;
    }
}
