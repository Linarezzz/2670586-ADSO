import java.util.Scanner;

public class Ejercicio09{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("solicite al usuario ingresar un número que represente una fecha (ddmmaaaa), la aplicación debe mostrar en pantalla la fecha en forma de texto."); 
        int numero = teclado.nextInt();

        if(numero > 1){

            int d1 = (numero/10000000)%10;
			int d2 = (numero/1000000)%10;
			int d3 = (numero/100000)%10;
			int d4 = (numero/10000)%10;
			int d5 = (numero/1000)%10;
            int d6 = (numero/100)%10;
            int d7 = (numero/10)%10;
            int d8 = numero%10;

            // Algoritmo para validar digito 1
            if (d1==0){
                System.out.print("");
            }else if (d2==1){
                System.out.print("PRIMERO DE ");
            }    











































        }else{
            System.out.println("El numero no es valido");
        }
    }
}