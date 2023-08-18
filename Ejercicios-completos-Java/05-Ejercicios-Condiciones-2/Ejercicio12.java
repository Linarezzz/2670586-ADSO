import java.util.Scanner;

public class Ejercicio12{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        double precio_compra, descuento=0, precio_final;

        System.out.println(" Escribir un programa que calcule el descuento aplicado a una compra ingresando el precio original y el porcentaje de descuento, pero solo si el porcentaje de descuento es válido (entre 0 y 100).");

        System.out.println("Escribe el precio del producto");
        precio_compra = teclado.nextDouble();

        if(precio_compra <0){
            System.out.println("El precio de la compra no puede ser negativo");
        }else{
            System.out.println("Ahora escribe el descuento que se va aplicar al producto");
            descuento = teclado.nextDouble();

            precio_final = precio_compra - (descuento / 100) * precio_compra;


            if(descuento >=0 && descuento <=100){
            System.out.println("El descuento es valido por ende el precio total es de: "+"$"+precio_final);
            }else{
            System.out.println("El descuento no es valido");
            }
        
        }

        
        
       

    }
}