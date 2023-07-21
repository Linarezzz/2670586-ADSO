import java.util.Scanner;

public class Ejercicio01{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un sueldo total: ");
        int sueldo_total = teclado.nextInt();

        System.out.print("Ingrese cantidad de pagos: ");
        int cantidad_pagos = teclado.nextInt();

        System.out.println("-------------- FORMAS DE PAGO -----------------");
        System.out.println("          1. Pagos de igual valor              ");
        System.out.println("          2. Primer pago diferente             ");
        System.out.println("          3. Ultimo pago diferente             ");
        System.out.println("          4. Primer y ultimo pago diferente    ");

        System.out.print("Ingrese forma de pago: ");
        Byte opcion = teclado.nextByte();

        if(opcion == 1){
            int contador = 1;
            int pagos_opcion_1;
            pagos_opcion_1 = sueldo_total / cantidad_pagos; 
            System.out.println("-------------- SUS PAGOS SERAN ------------");
            while(contador <= cantidad_pagos){
                System.out.println("Mes "+contador+":"+" $ "+pagos_opcion_1);
                contador++;
            }
        }else if (opcion == 2){
            int primerPago = sueldo_total % cantidad_pagos;
            int pagosRestantes = sueldo_total - primerPago;
            int montoCuotas = pagosRestantes / (cantidad_pagos - 1);

            System.out.println("-------------- SUS PAGOS SERÁN ------------");
            System.out.println("Mes 1: $" + primerPago);

            for (int contador = 2; contador <= cantidad_pagos; contador++) {
            System.out.println("Mes " + contador + ": $" + montoCuotas);
            }

        }else if (opcion == 3){
            int montoCuotas = sueldo_total / (cantidad_pagos -1);
            int ultimoPago = sueldo_total - (montoCuotas * (cantidad_pagos - 1));

            System.out.println("-------------- SUS PAGOS SERÁN ------------");
            for (int contador = 1; contador < cantidad_pagos; contador++) {
                System.out.println("Mes " + contador + ": $" + montoCuotas);
            }
            System.out.println("Mes " + cantidad_pagos + ": $" + ultimoPago);

        }else if (opcion == 4){
            int montoCuotas = sueldo_total / (cantidad_pagos - 2);
            int primerPago = (int) (Math.random() * montoCuotas) + 1;
            int montoPagosIntermedios = montoCuotas * (cantidad_pagos - 2);
            int ultimoPago = sueldo_total - primerPago - montoPagosIntermedios;

            if (ultimoPago <= 0) {
            ultimoPago = 1; // Establecer un valor mínimo de 1 si el último pago es negativo o cero
            montoCuotas = (sueldo_total - primerPago - ultimoPago) / (cantidad_pagos - 2); // Recalcular el monto de los pagos intermedios
            }

            System.out.println("-------------- SUS PAGOS SERÁN ------------");
            System.out.println("Mes 1: $" + primerPago);

            for (int contador = 2; contador < cantidad_pagos; contador++) {
            System.out.println("Mes " + contador + ": $" + montoCuotas);
            }

            System.out.println("Mes " + cantidad_pagos + ": $" + ultimoPago);









        }else{
            System.out.println("Ingrese una opcion valida");
        }

        
    }
}