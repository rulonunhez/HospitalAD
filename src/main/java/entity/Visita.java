package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "visitas")
public class Visita {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idVisita;

    private String descripcion;
    private Date fecha;


    public Visita() {

    }

    public Visita(int idVisita, String descripcion, Date fecha) {
        this.idVisita = idVisita;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }



    public int getIdVisita() {
        return idVisita;
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
