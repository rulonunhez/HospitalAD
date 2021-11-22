import entity.Celador;
import entity.Limpiador;
import entity.Planta;
import entity.Turno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.text.html.parser.Entity;
import java.sql.Date;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Planta planta1= new Planta("");
        Date fecha_inicio= new Date(2021,1,1);
        Date fecha_fin= new Date(2021,2,2);
        ArrayList<Planta> plantas= new ArrayList<>();
        ArrayList<Turno> turnos=new ArrayList<>();
        plantas.add(planta1);
        Turno turno1= new Turno(fecha_inicio,fecha_fin);
        turnos.add(turno1);

        Limpiador limpiador1= new Limpiador("1",1,"Don limpio","limpiador 1",1,plantas);
        Celador celador1= new Celador("2",2,"El pepe","direccion 1",2,turnos);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        em.persist(limpiador1);
        em.persist(celador1);

        em.getTransaction().commit();
        em.close();
        emf.close();

    }
}
