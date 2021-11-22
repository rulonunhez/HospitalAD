package entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "Turnos")
public class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTurno;

    @Column(name = "fecha_inicio")
    private Date fechaEmpezar;

    @Column(name = "fecha_fin")
    private Date fechaFinalizar;


    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "celador")
    private Celador celador;


    public Turno(Date fechaEmpezar, Date fechaFinalizar) {
        this.fechaEmpezar = fechaEmpezar;
        this.fechaFinalizar = fechaFinalizar;
    }

    public Turno() {

    }

    public Date getFechaEmpezar() {
        return fechaEmpezar;
    }

    public void setFechaEmpezar(Date fechaEmpezar) {
        this.fechaEmpezar = fechaEmpezar;
    }

    public Date getFechaFinalizar() {
        return fechaFinalizar;
    }

    public void setFechaFinalizar(Date fechaFinalizar) {
        this.fechaFinalizar = fechaFinalizar;
    }

    public Celador getCelador() { return celador; }

    public void setCelador(Celador celador) { this.celador = celador; }
}
