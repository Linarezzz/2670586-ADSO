import java.util.Scanner;

public class Ejercicio04{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        int numero_1, numero_2, numero_3;


        System.out.println("Se solicite al usuario tres números enteros y se indique en pantalla cuál de los tres números es mayo y cuál es el menor.");

        System.out.print("Ingresa el primer numero: ");
        numero_1 = teclado.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        numero_2 = teclado.nextInt();

        System.out.print("Ingresa el tercer numero: ");
        numero_3 = teclado.nextInt();

        if(numero_1 > numero_2 & numero_1 > numero_3){
            System.out.println("El numero mayor es: "+numero_1);
        }else if(numero_1 < numero_2 & numero_1 < numero_3){
            System.out.println("El numero menor es: "+numero_1);
        }   
       

        if(numero_2 > numero_1 & numero_2 > numero_3){
            System.out.println("El numero mayor es: "+numero_2);
        }else if(numero_2 < numero_1 & numero_2 < numero_3){
            System.out.println("El numero menor es: "+numero_2);
        } 
        

        if(numero_3 > numero_2 & numero_3 > numero_1){
            System.out.println("El numero mayor es: "+numero_3);
        }else if(numero_3 < numero_2 & numero_3 < numero_1){
            System.out.println("El numero menor es: "+numero_3);
        }
        
    }
}