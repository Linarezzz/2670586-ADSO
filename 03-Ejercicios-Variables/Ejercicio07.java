import java.util.Scanner;

public class Ejercicio07{
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);

        int precio_producto;
        int descuento;
        float precio_final;

        System.out.println("Pide al usuario el precio de un producto y un porcentaje de descuento. Calcula el precio final aplicando el descuento. Muestra el precio final por pantalla");

        System.out.println("Escribe el precio del producto");
        precio_producto = teclado.nextInt();

        System.out.println("Ahora escribe el descuento que se va aplicar al producto");
        descuento = teclado.nextInt();

        precio_producto = (descuento * precio_producto) /100;

        precio_final = precio_producto;

        
        System.out.println("El precio final del producto con el descuento aplicado es: "+precio_final);

    }
}