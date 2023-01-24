package Arreglos;
import java.util.Scanner;
import java.util.Arrays;

class Arreglo{

    /**
    *   Función para llenar un arreglo de tipo entero.
    *   @param arr  El arreglo que se quiere llenar con
    *               número enteros.
    *   @param sc   Auxiliar para pedir los datos al
    *               usuario.
    */
    public static void fillArray(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Asignación de elementos en el array.");
        for(int i = 0; i<arr.length; i++){
            System.out.println("numeros[" + i + "] = ");
            arr[i] = sc.nextInt();
        }//><
    }

    /**
    *   Calcula e imprime la media positiva y negativa de
    *   un arreglo de enteros.
    *   @param arr  El arreglo del que se quiere calcular
    *               la media de sus datos.
    */
    public static void calculaMedias(int arr[]){
        //  VARIABLES AUXILIARES.
        int sumaPos = 0, sumaNeg = 0;
        //  Número de valores positvos y negativos.
        int positivos = 0, negativos = 0;

        //  Realizar la suma.
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < 0) {
                sumaNeg += arr[i];
                negativos ++;
            }
            else if(arr[i] > 0){
                sumaPos += arr[i];
                positivos++;
            }
        }

        //  Imprimir medias.
        if(positivos != 0){
            double mediaPos = (double)sumaPos/((double)positivos);
            System.out.println("Media de positivos: " + mediaPos);
        }else System.out.println("No hay positivos en el array.");

        if(negativos != 0){
            double mediaNeg = (double)sumaNeg/((double)negativos);
            System.out.println("Media de negativos: " + mediaNeg);
        }else System.out.println("No hay negativos en el array.");

    }

    /**
     *  Manda imprimir el contenido del arreglo.
     *  @param arr  El arreglo que se quiere imprimir.
     */
    public static void imprimeArreglo(int arr[]){
        System.out.println("El arreglo contiene: ");
        System.out.println(Arrays.toString(arr));
    }

    /**
    *   Calcula la media de las posiciones pares
    *   de un arreglo de enteros.
    *   @param arr  El arreglo de enteros del que
    *               se quiere calcular la media.
    */
    public static void mediaPosPares(int arr[]){
        //  Guarda el valor de la media.
        double media = 0;
        //  Guarda la suma total de todos los números en posiciones pares.
        int sumaPares = 0;

        //  Realiza la suma.
        for(int i = 0; i<arr.length; i++){
            if(i%2 == 0){
                System.out.println(arr[i]);
                sumaPares += arr[i];
            }
        }
        //  Calcular e imprimir la media.
        media = (double)sumaPares/(5.0);
        System.out.println("Media de enteros en posiciones pares: " + media);
    }

    /**
    *   Encuentra los números enteros positivos,
    *   negativos y los ceros del arreglo.
    *   @param arr  El arreglo que contiene los
    *               valores enteros.
    */
    public static void encontrarNCP(int arr[]){
        int positivos = 0, negativos = 0, ceros = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]<0) negativos++;
            else if(arr[i]>0) positivos++;
            else ceros++;
        }
        System.out.println("Número de positivos: " + positivos);
        System.out.println("Número de negativos: " + negativos);
        System.out.println("Número de ceros: " + ceros);
    }
}
