import java.util.Arrays;
import java.util.LinkedList;

public class Fase4 {

    public static void main(String[] args) {

        String[]  nombre = new String[] {"W","A","L","T","E","R"};
        String[]  apellido = new String[] {"G","A","L","L","A","R","D","O"};


        LinkedList<String> nombre1 = new LinkedList(Arrays.asList(nombre));
        LinkedList<String> apelllido1 = new LinkedList(Arrays.asList(apellido));


        LinkedList<String> nc = new LinkedList<>();
        nc.addAll(nombre1);
        nc.add(" ");
        nc.addAll(apelllido1);

        System.out.println("Nombre Completo: " + nc );

    }






}
