package entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import java.util.ArrayList;

@Entity
@DiscriminatorValue(value = "2")
public class Enfermero extends Persona{

    @OneToOne()
    private Medico medico;

    public Enfermero() {
    }

    public Enfermero(String dni, int nss, String nombre, String direccion, int telefono, ArrayList<Planta> plantas, Medico medico) {
        super(dni, nss, nombre, direccion, telefono, plantas);
        this.medico = null;
    }

    public int getId(){
        return super.getIdPersona();
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
