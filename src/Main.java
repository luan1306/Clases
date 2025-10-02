import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Persona> lstPersona = new ArrayList<>();

        Persona c1 = new Cliente(25, 101010, "Lopez", "Pedro", "Auxiliar", "aux1010");


        Persona e1 = new Empleado(35, 202020, "Gil", "Lorena", "indefinido", 3200000);


        lstPersona.add(c1);
        lstPersona.add(e1);

        for (Persona p : lstPersona) {
            System.out.println(p.mostrarInfo());
        }

    }
}