import entity.Medico;
import entity.Persona;
import entity.Planta;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Planta planta1= new Planta("");
        ArrayList<Persona> personalEnPlanta = new ArrayList<>();
        Medico medico1 = new Medico("",1,"","",36,1);
        medico1.addPlanta(planta1);
    }
}
