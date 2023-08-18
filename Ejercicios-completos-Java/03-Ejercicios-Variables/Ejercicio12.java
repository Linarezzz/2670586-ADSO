import java.util.Scanner;

public class Ejercicio12{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        Double ancho;
        Double altura;
        Double area;


        System.out.println("Escribe un programa que tome el ancho y la altura de un rectángulo como entrada y calcule su área.");

        System.out.println("Escribe el ancho del rectangulo");
        ancho = teclado.nextDouble();

        System.out.println("Escribe la altura del rectangulo");
        altura = teclado.nextDouble();

        area = ancho*altura;

        System.out.println("El area del rectangulo es: "+area);

    }
}