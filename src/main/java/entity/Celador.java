package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
//@Table(name = "Celadores")
@DiscriminatorValue(value = "2")
public class Celador extends Personal{

    @OneToMany(mappedBy = "celador", cascade = CascadeType.ALL)
    private List<Turno> turnos;


    public Celador() {

    }

    public Celador(String dni, int nss, String nombre, Direccion direccion, int telefono, ArrayList<Turno> turnos) {
        super(dni, nss, nombre, direccion, telefono);
        this.turnos = turnos;
    }


    public int getID(){
        return super.getIdPersonal();
    }


    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(ArrayList<Turno> turnos) {
        this.turnos = turnos;
    }
}
