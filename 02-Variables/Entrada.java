import java.util.Scanner;  // Importar la varible Scanner //

public class Entrada{
    public static void main (String[] args) {
        // Variable para leer el teclado //
        Scanner teclado = new Scanner(System.in);

        // Las variables no se definen ya que seran definidas por el usuario //

        byte turno;             
        short loteria_risaralda;
        int saldo_bancario; 
        long tarjeta_identidad; 
        float nota;
        double pi; 
        boolean bandera;

        // SE SOLICITAN LOS DATOS AL USUARIO // 

        System.out.println("Ingrese turno: ");
        turno = teclado.nextByte();   // Nombre variable, ademas de teclado por que arriba se escribio teclado como la variable scanner .next(tipo de dato)  //

        System.out.println("Ingrese loteria_risaralda: ");
        loteria_risaralda = teclado.nextShort();
        
        System.out.println("Ingrese saldo_bancario: ");
        saldo_bancario = teclado.nextInt();
        
        System.out.println("Ingrese tarjeta_identidad: ");
        tarjeta_identidad = teclado.nextLong();

        System.out.println("Ingrese nota: ");
        nota = teclado.nextFloat();

        System.out.println("Ingrese pi: ");
        pi = teclado.nextDouble();

        System.out.println("Ingrese bandera: ");
        bandera = teclado.nextBoolean();


        // system.out.println ("nombre de la variable"+ nombrevariable)
        // DE ESTA FORMA SE IMPRIMEN LOS DATOS QUE SE INTRODUCIERON ANTERIORMENTE //


        System.out.println("turno: "+turno);
        System.out.println("loteria_risarlda: "+loteria_risaralda);
        System.out.println("saldo_bancario: "+saldo_bancario);
        System.out.println("tarjeta_identidad: "+tarjeta_identidad);
        System.out.println("nota: "+nota);
        System.out.println("pi :"+pi);
        System.out.println("bandera: "+bandera);
    }
}