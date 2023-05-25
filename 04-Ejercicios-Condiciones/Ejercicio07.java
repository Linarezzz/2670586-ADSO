import java.util.Scanner;

public class Ejercicio07{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        Long numero, primerosDigitos1000, ultimoDigito1000, digitosIntermedios1000, primerosDigitos10000, ultimoDigito10000, digitosIntermedios10000, primerosDigitos100000, ultimoDigito100000, digitosIntermedios100000, primerosDigitos1000000, digitosIntermedios1000000, ultimoDigito1000000, digitosIntermedios2_1000000 ;

        System.out.println("pida al usuario ingresar un número (Máximo 10 dígitos e inferior a los dos mil millones); Después se debe mostrar en pantalla el numero con formato de moneda.");

        System.out.print("Ingresa un numero: ");
        numero = teclado.nextLong();

        if(numero < 0 || numero <= 999 || numero > 2_000_000_000){   // Se usan _ para no cambiar el valor del numero que se quiere usar //
            System.out.println("El numero no es valido");
        }

        if(numero >= 1000 && numero <= 9999){
            
            primerosDigitos1000 = numero / 1000; // Obtener los primeros dígitos // 
            ultimoDigito1000 = numero % 10; // Obtener el último dígito //
            digitosIntermedios1000 = (numero % 1000) / 10; // Obtener los dígitos intermedios //
            System.out.println("// ---------- FORMATO DE MONEDA ----------- //");
            System.out.println("Moneda: $ " + primerosDigitos1000 + "." + String.format("%02d", digitosIntermedios1000) + ultimoDigito1000);
        }

        if(numero >=10000 && numero <= 99999){
            primerosDigitos10000 = numero / 1000;
            ultimoDigito10000 = numero % 10;
            digitosIntermedios10000 = (numero % 1000) / 10;
            System.out.println("// ---------- FORMATO DE MONEDA ----------- //");
            System.out.println("Moneda: $ " + primerosDigitos10000 + "." + String.format("%02d", digitosIntermedios10000) + ultimoDigito10000);

        }

        if(numero >=100000 && numero <=999999){
            primerosDigitos100000 = numero / 1000;
            ultimoDigito100000 = numero % 10;
            digitosIntermedios100000 = (numero % 1000) / 10;
            System.out.println("// ---------- FORMATO DE MONEDA ----------- //");
            System.out.println("Moneda: $ " + primerosDigitos100000 + "." + String.format("%02d", digitosIntermedios100000) + ultimoDigito100000);
        }

        if(numero >= 1_000_000_000L && numero < 2_000_000_000L){
            primerosDigitos1000000 = numero / 1_000_000_000L;
            digitosIntermedios1000000 = (numero % 1_000_000_000L) / 1_000_000L;
            digitosIntermedios2_1000000 = (numero % 1_000_000L) / 1_000L;
            ultimoDigito1000000 = numero % 1_000L;
            System.out.println("// ---------- FORMATO DE MONEDA ----------- //");
            System.out.println("Moneda: $" + primerosDigitos1000000 + "." + String.format("%03d", digitosIntermedios1000000) + "." + String.format("%03d", digitosIntermedios2_1000000) + "." + String.format("%03d", ultimoDigito1000000));
        }
        
        

           
    }
}