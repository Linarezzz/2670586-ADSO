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
                int divisores = 0;
                for(int i = 1; i<=primo ; i++){
                    if(primo % i == 0){
                        divisores = divisores + 1;
                    }
                }
                if(divisores == 2){
                    System.out.print(" "+"["+primo+"]");
                    primo++;
                    contador++;
                    if(contador % numero == 0){
                        System.out.println("");
                    }
                }else{
                    primo++; 
                }

            }
        }            
    }
}    
