import java.util.Scanner;

public class Ejercicio09{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        double horas, tarifa, salario, salario_incrementado;



        System.out.println("Escribir un programa que calcule el salario semanal de un empleado ingresando las horas trabajadas y la tarifa por hora. Si el empleado trabajó más de 40 horas, se le pagará un 50% extra por las horas extras.");

        System.out.print("Ingresa las horas trabajadas en la semana: ");
        horas = teclado.nextDouble();

        System.out.print("Ingresa la tarifa por hora: ");
        tarifa = teclado.nextDouble();

        salario = horas*tarifa;

        if(horas > 40 ){
            salario_incrementado = (horas*tarifa)*1.5;
            System.out.println("El salario semanal, con el 50% extra por las horas extras trabajadas es: "+salario_incrementado);


        }else{
            System.out.println("El salario semanal es de: "+salario);
        }
    }
}