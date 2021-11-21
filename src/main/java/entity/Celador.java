package entity;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "Celadores")
public class Celador extends Personal{

    @OneToMany(mappedBy = "celador", cascade = CascadeType.ALL)
    private ArrayList<Turno> turnos;


    public Celador() {

    }

    public Celador(String dni, int nss, String nombre, String direccion, int telefono, ArrayList<Turno> turnos) {
        super(dni, nss, nombre, direccion, telefono);
        this.turnos = turnos;
    }


    public int getID(){
        return super.getIdPersonal();
    }


    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(ArrayList<Turno> turnos) {
        this.turnos = turnos;
    }
}
