package entity;

import javax.persistence.Embeddable;

@Embeddable
public class Direccion {
    private String direccion;

    public Direccion(String direccion) {
        this.direccion = direccion;
    }

    public Direccion() {
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
