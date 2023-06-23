import java.util.Scanner;

public class Ejercicio09{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = teclado.nextInt();



        int divisores = 0;
        for(int i = 1; i<=numero ; i++){
            if (numero%i == 0){
                divisores = divisores + 1;
            }
        }



        System.out.println("------------------------------------");
        if (divisores == 2){
            System.out.println("El numero ingresado es primo");
        }else{
            System.out.println("El numero ingresado NO es primo");
        }






    }
}