import java.util.Scanner;

public class Ejercicio08{
    public static void main (String[] args){


        Scanner teclado = new Scanner(System.in);

        int base, altura, area;

        System.out.println("Calcule el área de un triángulo ingresando su base y altura, pero solo si ambos valores son positivos.");

        System.out.print("Ingresa la base: ");
        base = teclado.nextInt();

        System.out.print("Ingresa la altura: ");
        altura = teclado.nextInt();

        area = (base*altura) /2;

        if(base >0 && altura >0){
            System.out.println("El area del triangulo es de: "+area + "cm");
        }else{
            System.out.println("Los valores son negativos");
        }


    }
}