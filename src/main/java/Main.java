import entity.Limpiador;
import entity.Personal;
import entity.Planta;
import entity.Turno;

import java.sql.Date;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Planta planta1= new Planta("");
        Date fecha_inicio= new Date(2021,1,1);
        Date fecha_fin= new Date(2021,2,2);
        ArrayList<Planta> plantas= new ArrayList<>();
        plantas.add(planta1);

        Turno turno1= new Turno(fecha_inicio,fecha_fin);

        Limpiador limpiador1= new Limpiador("",1,"","",155,plantas);

    }
}
