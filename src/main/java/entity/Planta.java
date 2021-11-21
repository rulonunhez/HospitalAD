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


    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "limpiador")
    private Limpiador limpiador;


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

    public Limpiador getLimpiador() {
        return limpiador;
    }

    public void setLimpiador(Limpiador limpiador) {
        this.limpiador = limpiador;
    }
}
