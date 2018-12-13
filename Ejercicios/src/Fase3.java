import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Fase3 {

    private static Map<Character, Integer> mapeo = new HashMap<>();

    private static void Letras(Character letra){
        if( mapeo.containsKey(letra)){
            int contador = mapeo.get(letra);
            mapeo.put(letra, ++contador);

            }else{ mapeo.put(letra, 1);}

        }


    public static void main(String[] args) {


        Character[] Nombre =  {'W','A','L','T','E','R','G','A','L','L','A','R','D','O'};
        ArrayList<Character> miNombre = new ArrayList<>(Arrays.asList(Nombre));


        for (int i=0; i < miNombre.size(); i++){
            Character l = miNombre.get(i);

            Letras(l);

        }


        System.out.println(miNombre);
        System.out.println(mapeo);
        System.out.println("Tamaño del mapa: " + mapeo.size());

    }



}



