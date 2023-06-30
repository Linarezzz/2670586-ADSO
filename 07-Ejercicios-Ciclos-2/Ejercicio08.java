import java.util.Scanner;

public class Ejercicio08{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        //PENDIENTE EJERCICIO 

        System.out.print("Ingrese un numero N: ");
        int numero = teclado.nextInt();

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
                System.out.print(" "+""+primo+"");
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
    

    
