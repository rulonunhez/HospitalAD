package entity;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@DiscriminatorValue(value = "4")
public class Limpiador extends Personal{

    @OneToMany(mappedBy = "limpiador")
    private ArrayList<Planta> plantas;

    public Limpiador() {

    }

    public Limpiador(String dni, int nss, String nombre, String direccion, int telefono, ArrayList<Planta> plantas) {
        super(dni, nss, nombre, direccion, telefono);
        this.plantas = plantas;
    }

    public Limpiador(String dni, int nss, String nombre, String direccion, int telefono) {
        super(dni, nss, nombre, direccion, telefono);
    }

    public int getID(){
        return super.getIdPersonal();
    }

    public ArrayList<Planta> getPlantas() {
        return plantas;
    }

    public void setPlantas(ArrayList<Planta> plantas) {
        this.plantas = plantas;
    }

    public void addPlanta(Planta planta){
        this.plantas.add(planta);
    }
}
