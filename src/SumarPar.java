import java.util.Scanner;

public class SumarPar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero para sumar pares");
        numero = sc.nextInt();
        int suma = 0;
//ciclo for:
        /*
        for(int i=1; i<=numero;i++){
            if(i%2==0){
                suma+=i;
            }
        }*/

//ciclo while:
        int i=0;
       /* while(i<=numero) {
            if(i%2==0) {
                suma += i;
            }
            i++;

        }
        System.out.printf("La suma de los pares desde 1 hasta %d es igual a:%d",numero,suma);*/

//ciclo do-while:

       /* do{
            if(i%2==0) {
                suma += i;
            }
            i++;
        }
        while (i<=numero);
        System.out.printf("La suma de los pares desde 1 hasta %d es igual a:%d",numero,suma);*/
    }
}
