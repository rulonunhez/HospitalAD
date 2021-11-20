package entity;

import java.util.Date;

public class Operacion {
    private int idVisita;
    private String descripcion;
    private Date fecha;

    public Operacion(String descripcion, Date fecha) {
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
