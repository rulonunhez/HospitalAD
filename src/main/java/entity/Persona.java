package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {

    @Id
    private int idPersona;


    private String dni;

    private int nss;

    private String nombre;

    private String direccion;

    private int telefono;
}
