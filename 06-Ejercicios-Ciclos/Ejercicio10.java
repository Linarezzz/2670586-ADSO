import java.util.Scanner;

public class Ejercicio10{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("--> Ingresar numero: ");
        int numero = teclado.nextInt();

        if(numero < 1 || numero > 11){
            System.out.println("El numero no se encuentra en el rango permitido");
        }else{
            System.out.println("--> Los numeros primos encontrados son:");

            int primo = 2;
            int contador = 0;

            while(contador < (numero*numero)){
                if(numero % primo == 0){
                    System.out.println("["+numero+"]");
                    primo = primo + 1;
                    contador = contador + 1;
                }else{
                    primo = primo + 1;
                }
            }
        }            
    }
}    
