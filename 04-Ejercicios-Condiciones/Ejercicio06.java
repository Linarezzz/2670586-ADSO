import java.util.Scanner;

public class Ejercicio06{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        int numero,primer_digito=0, segundo_digito=0, tercer_digito=0, cuarto_digito=0, quinto_digito=0, sexto_digito=0;
        Byte opcion=0;


        System.out.println("pida al usuario ingresar un numero de 6 dígitos; después muestre en pantalla un menú donde las opciones sea el digito a mostrar");

        System.out.print("Ingresa un numero de 6 digitos: ");
        numero = teclado.nextInt();

        if(numero <= 99999 || numero > 999999 ){
            System.out.println("El numero no tiene 6 digitos");
        }else{
            System.out.println("// ------------------------------------------------------------------- //");
            System.out.println("       Menu:                                                             ");
            System.out.println("       1. Primer Digito. 2. Segundo Digito. 3. Tercer Digito.            ");
            System.out.println("       4. Cuarto Digito. 5. Quinto Digito.  6. Sexto Digito.             ");
            System.out.println("// ------------------------------------------------------------------- //");
            System.out.println("                                                                         ");
            System.out.print("Ingresa una opcion: ");
            opcion = teclado.nextByte();
            if(opcion <= 0 || opcion > 6){
            System.out.println("Escoja una opcion valida");
            }
            
        }
            
        if(opcion == 1){
            primer_digito = (numero%1000000)/100000;
            System.out.println("El primer digito es: "+primer_digito);
        }

        if(opcion == 2){
            segundo_digito = (numero%100000)/10000;
            System.out.println("El segundo digito es: "+segundo_digito);
        }

        if(opcion == 3){
            tercer_digito = (numero%10000)/1000;
            System.out.println("El tercer digito es: "+tercer_digito);
        }

        if(opcion == 4){
            cuarto_digito = (numero%1000)/100;
            System.out.println("El cuarto digito es: "+cuarto_digito);
        }

        if(opcion == 5){
            quinto_digito = (numero%100)/10;
            System.out.println("El quinto digito es: "+quinto_digito);
        }

        if(opcion == 6){
            sexto_digito = numero % 10;
            System.out.println("El sexto digito es: "+sexto_digito);
        }

    }
}