package Arreglos;
import java.util.Scanner;

/**
 *  Interfaz de usuario para trabajar con un arreglo.
 */

public class UIArreglos{

    /**
     *  Solicita un número al usuario.
     *  @return número elegido.
     */
    public static int readOption(){
        System.out.println("Elige una opción: ");
        Scanner sc = new Scanner(System.in);
        boolean error = false;
        int num = -1;

        try{
            num = Integer.parseInt(sc.nextLine());
            if(num <= 0){
                error = true;
                System.out.println("El valor más pequeño permitido es 1.");
            }else if (num > 6){
                error = true;
                System.out.println("El valor más grande permitido es 6.");
            }//<>
        }catch (NumberFormatException nfe){
            error = true;
            System.out.println("Ingresa un número válido.");
        }
        if(error){
            num = readOption();
        }
        return num;
    }

    /**
     *  Imprime el menú de opciones.
     */
    public static void printMenu(){
        System.out.println("Opciones: ");
        System.out.println("1) Llenar arreglo.");
        System.out.println("2) Calcular media positiva y negativa.");
        System.out.println("3) Calcular media de pares.");
        System.out.println("4) Encuentra positivos/negativos.");
        System.out.println("5) Ver arreglo.");
        System.out.println("6) Salir.");
    }

    /**
     *  Repite la ejecución de la IU.
     */
    public static void loop(int arr[]){
        System.out.println("----------");
        System.out.println(" Arreglos ");
        System.out.println("----------");

        boolean terminar = false;

        while(terminar != true){
            printMenu();
            int usuarioElec = readOption();

            switch(usuarioElec){
                case 1:
                    Arreglo.fillArray(arr);
                    break;
                case 2:
                    Arreglo.calculaMedias(arr);
                    break;
                case 3:
                    Arreglo.mediaPosPares(arr);
                    break;
                case 4:
                    Arreglo.encontrarNCP(arr);
                    break;
                case 5:
                    Arreglo.imprimeArreglo(arr);
                    break;
                case 6:
                    terminar = true;
                    break;
            }
        }
    }

    /**
     *  Método main.
     */
    public static void main(String[] args){
        loop(new int[10]);
    }
}
