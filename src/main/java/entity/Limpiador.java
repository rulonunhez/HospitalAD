package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
//@Table(name = "Limpiadores")
@DiscriminatorValue(value = "1")
public class Limpiador extends Personal{

    @OneToMany(mappedBy = "limpiador")
    private List<Planta> plantas;

    public Limpiador() {

    }

    public Limpiador(String dni, int nss, String nombre, Direccion direccion, int telefono, ArrayList<Planta> plantas) {
        super(dni, nss, nombre, direccion, telefono);
        this.plantas = plantas;
    }

    public Limpiador(String dni, int nss, String nombre, Direccion direccion, int telefono) {
        super(dni, nss, nombre, direccion, telefono);
    }

    public int getID(){
        return super.getIdPersonal();
    }

    public List<Planta> getPlantas() {
        return plantas;
    }

    public void setPlantas(ArrayList<Planta> plantas) {
        this.plantas = plantas;
    }

    public void addPlanta(Planta planta){
        this.plantas.add(planta);
    }
}
