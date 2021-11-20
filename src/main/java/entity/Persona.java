package entity;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="Personas")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersona;

    private String dni;

    private int nss;

    private String nombre;

    private String direccion;

    private int telefono;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name= "personas_plantas",
            joinColumns = @JoinColumn(name="idPersona"),
            inverseJoinColumns = @JoinColumn(name="idPlanta")
    )
    private ArrayList<Planta> plantas;


    public Persona() {
    }

    public Persona(String dni, int nss, String nombre, String direccion, int telefono) {
        this.dni = dni;
        this.nss = nss;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Persona(String dni, int nss, String nombre, String direccion, int telefono, ArrayList<Planta> plantas) {
        this.dni = dni;
        this.nss = nss;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.plantas = plantas;
    }



    public int getIdPersona() {
        return idPersona;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNss() {
        return nss;
    }

    public void setNss(int nss) {
        this.nss = nss;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Planta> getPlantas() {
        return plantas;
    }

    public void setPlantas(ArrayList<Planta> plantas) {
        this.plantas = plantas;
    }

    public void addPlanta(Planta planta){
        plantas.add(planta);

    }
}
