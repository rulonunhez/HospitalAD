package entity;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name= "Plantas")
public class Planta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPlanta;

    private String nombre;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name= "personas_plantas",
            joinColumns = @JoinColumn(name= "idPlanta"),
            inverseJoinColumns = @JoinColumn(name= "idPersona")
    )
    private ArrayList<Persona> personalEnPlanta;



    public Planta() {

    }

    public Planta(String nombre) {
        this.nombre = nombre;
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addPersona(Persona persona){
        personalEnPlanta.add(persona);

    }
}
