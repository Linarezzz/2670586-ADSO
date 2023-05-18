import java.util.Scanner;

public class Ejercicio19{
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nombre;
        Byte edad;
        int salario;

        System.out.println("Escribe un programa que solicite al usuario ingresar el nombre, la edad y el salario de un empleado, y luego muestre esa información en la pantalla");

        System.out.println("Escribe el nombre");
        nombre = teclado.nextLine();

        System.out.println("Escribe la edad");
        edad = teclado.nextByte();

        System.out.println("Escribe el salario");
        salario = teclado.nextInt();

        System.out.println(nombre + " , " + edad + " años y salario de "+ salario);


    }
}