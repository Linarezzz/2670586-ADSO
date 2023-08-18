import java.util.Scanner;

public class Ejercicio01{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        Byte edad;

        System.out.println("Realizar una pequeña aplicación en JAVA, donde salude al usuario y pregunte su edad. Si el usuario es menor de edad, se debe mostrar en pantalla que recibe un auxilio de $ 800.000 Si el usuario es mayor de edad, se debe mostrar en pantalla que paga un impuesto de $ 200.000 ");

        System.out.println("¡Hola usuario!");

        System.out.println("Por favor escribe tu edad");
        edad = teclado.nextByte();

        if (edad < 18){
            System.out.println("Usted recibe un auxilio de $800.000");
        }else{
            System.out.println("Usted paga un impuesto de $200.000");
        }
    }
}