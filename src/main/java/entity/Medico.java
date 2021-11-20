package entity;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "Medicos")
@Inheritance(strategy = InheritanceType.JOINED)
public class Medico extends Persona{

    private int Consulta;

    @OneToMany(mappedBy = "medico")
    private ArrayList<Visita> historicoVisitas;

    @OneToMany()
    private ArrayList<Operacion> historicoOperaciones;


    public Medico() {

    }


    public Medico(String dni, int nss, String nombre, String direccion, int telefono, int consulta) {
        super(dni, nss, nombre, direccion, telefono);
        Consulta = consulta;
    }

    public Medico(String dni, int nss, String nombre, String direccion, int telefono, ArrayList<Planta> plantas, int consulta) {
        super(dni, nss, nombre, direccion, telefono, plantas);
        Consulta = consulta;
    }



    public int getId(){
        return super.getIdPersona();
    }

    public int getConsulta() {
        return Consulta;
    }

    public void setConsulta(int consulta) {
        Consulta = consulta;
    }

    public ArrayList<Visita> getHistoricoVisitas() {
        return historicoVisitas;
    }

    public void setHistoricoVisitas(ArrayList<Visita> historicoVisitas) {
        this.historicoVisitas = historicoVisitas;
    }

    public ArrayList<Operacion> getHistoricoOperaciones() {
        return historicoOperaciones;
    }

    public void setHistoricoOperaciones(ArrayList<Operacion> historicoOperaciones) {
        this.historicoOperaciones = historicoOperaciones;
    }

    public void addVisitaToHistorico(Visita visita){
        historicoVisitas.add(visita);
    }

    public void addOperacionToHistorico(Operacion operacion){
        historicoOperaciones.add(operacion);
    }
}
