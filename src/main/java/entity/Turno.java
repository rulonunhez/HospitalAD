package entity;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "turnos")
public class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTurno;

    @Column(name = "fecha_inicio")
    private LocalDate fechaEmpezar;

    @Column(name = "fecha_fin")
    private LocalDate fechaFinalizar;


    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "celador")
    private Celador celador;


    public Turno(LocalDate fechaEmpezar, LocalDate fechaFinalizar) {
        this.fechaEmpezar = fechaEmpezar;
        this.fechaFinalizar = fechaFinalizar;
    }

    public Turno() {

    }

    public LocalDate getFechaEmpezar() {
        return fechaEmpezar;
    }

    public void setFechaEmpezar(LocalDate fechaEmpezar) {
        this.fechaEmpezar = fechaEmpezar;
    }

    public LocalDate getFechaFinalizar() {
        return fechaFinalizar;
    }

    public void setFechaFinalizar(LocalDate fechaFinalizar) {
        this.fechaFinalizar = fechaFinalizar;
    }

    public Celador getCelador() { return celador; }

    public void setCelador(Celador celador) { this.celador = celador; }
}
