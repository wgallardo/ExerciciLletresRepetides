import java.util.Arrays;
import java.util.Scanner;


public class Fase2 {

    private static  Character[] vocales = {'a','e','i','o','u','A','E','I','O','U'};

    private static boolean esVocal(char c){
        return Arrays.asList(vocales).contains(c);
    }

    public static void main(String[] args) {


        System.out.print("Introduzca su nombre: ");
        String entradaTeclado = "";
        Scanner entradaEscanner = new Scanner(System.in);
        entradaTeclado = entradaEscanner.nextLine();

        char[] nombre = entradaTeclado.toCharArray();




        for (int i=0; i < nombre.length; i++)

            if (Character.isDigit(nombre [i])) {
                System.out.println("El numero "  + nombre[i] + "  " + " no es una Letra ");

            } else if (esVocal(nombre [i])) {
                System.out.println("La Letra  "  + nombre[i] + "  " + " es una Vocal ");

            } else {
                System.out.println("La Letra  "  + nombre[i] + "  " + " es una Consonante ");
            }
    }



}
