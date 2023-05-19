import java.util.Scanner;

public class Ejercicio05{
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);

        int base;
        int altura;
        int area;

        System.out.println("Se calculara el area de un triangulo teniendo en cuenta su base y su altura");

        System.out.println("Ingrese la base del triangulo");
        base = teclado.nextInt();

        System.out.println("Ingrese la altura del triangulo");
        altura = teclado.nextInt();

        area = base * altura / 2;
        
        System.out.println("El area del triangulo es de: "+area);

    }
}