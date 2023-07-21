import java.util.Scanner;

public class Ejercicio02{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero y se llenaran las posiciones de numeros primos: ");
        int numero = teclado.nextInt();

        // Arreglo

        int arreglo [] = new int [numero];

        // Ciclo para llenar el arreglo

        int primo = 2;
        int contador = 0;


        while(contador < arreglo.length){
            int divisores = 0;
            for(int i = 1; i<=primo ; i++){
                if(primo % i == 0){
                    divisores = divisores + 1;
                }
            }
            if(divisores == 2){
                System.out.println("Numero primo en la posicion "+contador+" "+"es: "+primo+"  ");
                primo++;
                contador++;
            }else{
                primo++; 
            }

        }


    }
}