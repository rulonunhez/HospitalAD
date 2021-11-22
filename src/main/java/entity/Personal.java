package entity;

import javax.persistence.*;

@Entity
@Table(name="Personas")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "employee_type",discriminatorType = DiscriminatorType.INTEGER)
@DiscriminatorValue(value = "0")
//@Inheritance(strategy = InheritanceType.JOINED)
public class Personal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersonal;

    private String dni;

    private int nss;

    private String nombre;

    @Embedded
    private Direccion direccion;

    private int telefono;

    public Personal() {
    }

    public Personal(String dni, int nss, String nombre, Direccion direccion, int telefono) {
        this.dni = dni;
        this.nss = nss;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getIdPersonal() {
        return idPersonal;
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

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
