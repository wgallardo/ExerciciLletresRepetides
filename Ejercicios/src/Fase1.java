import java.util.Scanner;

public class Fase1 {

    public static void main(String[] args){

        System.out.print("Introduzca su nombre: ");
        String entradaTeclado = "";
        Scanner entradaEscanner = new Scanner(System.in);
        entradaTeclado = entradaEscanner.nextLine();

        char[] nombre = entradaTeclado.toCharArray();

        for (int i=0;i<nombre.length;i++){
            System.out.println(nombre[i]);
        }
    }



}
