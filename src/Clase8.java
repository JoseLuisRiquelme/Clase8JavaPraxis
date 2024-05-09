import java.util.Scanner;

public class Clase8 {
    public static void main(String[] args) {
        /*int cantidad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de items de la lista");
        cantidad=sc.nextInt();

        System.out.println("<ul>");
        for(int i=1; i<=cantidad;i++){
            System.out.printf("<li>%d</li>\n",i);
        }
        System.out.println("</ul>");*/
        /* int cantidad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros");
        cantidad = sc.nextInt();
        int i=0;
        int suma = 0;
        while (i<cantidad){
            i++;
            suma+=i;
        }
        System.out.printf("La suma es igual a %d",suma);*/

        //Guía de ejercicios
        //Flujo, ciclos y métodos (I)

       /* Scanner sc = new Scanner(System.in);
        String opcionElegida;
        String opcionaA="a";
        String opcionaB="b";
        String opcionaC="c";
        String opcionaD="d";
        String opcionaE="e";
        int numero1;
        int numero2;

        System.out.println("Ingrese el primer numero");
        numero1=sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2=sc.nextInt();

        System.out.println("Elija entre las siguientes operaciones:\n a. Sumar.\n b. Restar.\n c. Multiplicar.\n d. Dividir.\n e. Salir.");
        opcionElegida=sc.next();

        if(opcionElegida.compareToIgnoreCase(opcionaA)==0){
            int suma = numero1+numero2;
            System.out.printf("Eligio sumar %d con %d y el resultado es: %d",numero1,numero2,suma);
        }
        else if(opcionElegida.compareToIgnoreCase(opcionaB)==0){
            int resta = numero1-numero2;
            System.out.printf("Eligio restar %d con %d y el resultado es: %d",numero1,numero2,resta);
        }
        else if(opcionElegida.compareToIgnoreCase(opcionaC)==0){
            int multiplicacion = numero1*numero2;
            System.out.printf("Eligio multiplicar %d con %d y el resultado es: %d",numero1,numero2,multiplicacion);
        }
        else if(opcionElegida.compareToIgnoreCase(opcionaD)==0){
            int division = numero1/numero2;
            System.out.printf("Eligio dividir %d con %d y el resultado es: %d",numero1,numero2,division);
        }
        else if(opcionElegida.compareToIgnoreCase(opcionaE)==0){
            System.out.println("A elegido terminar el programa");
            System.exit(0);

        }*/


                Scanner sc = new Scanner(System.in);

                System.out.print("Ingrese un número para el temporizador: ");
                int numero = sc.nextInt();

                System.out.println("Temporizador iniciado:");
                for (int i = numero; i >= 0; i--) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("¡Tiempo terminado!");






    }
}