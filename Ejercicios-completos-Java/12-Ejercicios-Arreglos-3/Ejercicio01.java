import java.util.Scanner;

public class Ejercicio01{
    public static void main(String []args){
        //Realizar una aplicación en JAVA que solicite al usuario un numero entero N, cree un arreglo
        //de String de tamaño N, llene el arreglo con datos pedidos al usuario y muestre el arreglo en
        //pantalla.

        Scanner teclado = new Scanner(System.in);
        Scanner texto = new Scanner(System.in);   // Se debe de crear otra variable para entrada de datos ya que no se puede tener una misma para todos los tipos de datos

        System.out.print("Ingrese un numero: ");
        int numero = teclado.nextInt();

        //Arreglo
        String arreglo [] = new String [numero];

        //Ciclo para llenar el arreglo
        for(int i = 0; i<arreglo.length; i++){
            System.out.print("Ingrese alguna palabra: ");
            arreglo[i] = texto.nextLine();
        }

        //Ciclo para imprimir el arreglo
        for(int i = 0; i<arreglo.length; i++){
            System.out.println("Las palabras ingresadas del arreglo son: "+arreglo[i]);
        }

    }
}