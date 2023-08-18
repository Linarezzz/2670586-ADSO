import java.util.Scanner;

public class Ejercicio10{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        Double nota_matematicas=0.0, nota_espanol=0.0, nota_ingles=0.0, nota_ciencias=0.0, nota_deportes=0.0, promedio;



        System.out.println("solicite al usuario ingresar cinco notas de asignaturas definidas, posteriormente se debe mostrar en pantalla:- Asignatura con mayor nota.- Asignatura con menor nota.- Promedio de notas.- En el caso de que el promedio de notas de inferior a 3, se debe indicar en pantalla la nota que debió obtener en  la asignatura con menor nota para alcanzar el promedio de 3");

        System.out.print("Ingrese la nota de matematicas: ");
        nota_matematicas = teclado.nextDouble();

        System.out.print("Ingrese la nota de espanol: ");
        nota_espanol = teclado.nextDouble();

        System.out.print("Ingrese la nota de ingles: ");
        nota_ingles = teclado.nextDouble();

        System.out.print("Ingrese la nota de ciencias naturales: ");
        nota_ciencias = teclado.nextDouble();

        System.out.print("Ingrese la nota de deportes: ");
        nota_deportes = teclado.nextDouble();

        System.out.println("                    ");

        System.out.println("Nota de matematicas: "+nota_matematicas);
        System.out.println("Nota de espanol: "+nota_espanol);
        System.out.println("Nota de ingles: "+nota_ingles);
        System.out.println("Nota de ciencias naturales: "+nota_ciencias);
        System.out.println("Nota de deportes: "+nota_deportes);
        System.out.println("                                      ");
        System.out.println("Informe: ");

        if(nota_matematicas > nota_espanol && nota_matematicas > nota_ingles && nota_matematicas > nota_ciencias && nota_matematicas > nota_deportes){
           System.out.println("Asignatura con mejor nota: Matematicas");
        }

        if(nota_espanol > nota_matematicas && nota_espanol > nota_ingles && nota_espanol > nota_ciencias && nota_espanol > nota_deportes){
           System.out.println("Asignatura con mejor nota: Espanol");
        }

        if(nota_ingles > nota_matematicas && nota_ingles > nota_espanol && nota_ingles > nota_ciencias && nota_ingles > nota_deportes){
           System.out.println("Asignatura con mejor nota: Ingles");
        }

        if(nota_ciencias > nota_matematicas && nota_ciencias > nota_ingles && nota_ciencias > nota_espanol && nota_ciencias > nota_deportes){
           System.out.println("Asignatura con mejor nota: Ciencias naturales");
        }

        if(nota_deportes > nota_espanol && nota_deportes > nota_ingles && nota_deportes > nota_ciencias && nota_deportes > nota_matematicas){
           System.out.println("Asignatura con mejor nota: Deportes");
        }

        




        if(nota_matematicas < nota_espanol && nota_matematicas < nota_ingles && nota_matematicas < nota_ciencias && nota_matematicas < nota_deportes){
           System.out.println("Asignatura con menor nota: Matematicas");
        }

        if(nota_espanol < nota_matematicas && nota_espanol < nota_ingles && nota_espanol < nota_ciencias && nota_espanol < nota_deportes){
           System.out.println("Asignatura con menor nota: Espanol");
        }

        if(nota_ingles < nota_matematicas && nota_ingles < nota_espanol && nota_ingles < nota_ciencias && nota_ingles < nota_deportes){
           System.out.println("Asignatura con menor nota: Ingles");
        }

        if(nota_ciencias < nota_matematicas && nota_ciencias < nota_ingles && nota_ciencias < nota_espanol && nota_ciencias < nota_deportes){
           System.out.println("Asignatura con menor nota: Ciencias naturales");
        }

        if(nota_deportes < nota_espanol && nota_deportes < nota_ingles && nota_deportes < nota_ciencias && nota_deportes < nota_matematicas){
           System.out.println("Asignatura con menor nota: Deportes");
        }


        promedio = (nota_matematicas + nota_ingles + nota_espanol + nota_deportes + nota_ciencias)/5;

        System.out.println("Promedio de notas: "+promedio);

        if(nota_matematicas < 3.5){
            System.out.println("Debio obtener una nota de 3,5 en matematicas para aprobar el periodo");
        }else{
            if (nota_ingles < 3.5){
                System.out.println("Debio obtener una nota de 3,5 en ingles para aprobar el periodo");
            }else{
                if (nota_espanol < 3.5){
                   System.out.println("Debio obtener una nota de 3,5 en espanol para aprobar el periodo");
                }else{
                    if (nota_deportes < 3.5){
                        System.out.println("Debio obtener una nota de 3,5 en deportes para aprobar el periodo");
                    }else{
                        if (nota_ciencias < 3.5){
                            System.out.println("Debio obtener una nota de 3,5 en ciencias para aprobar el periodo");
                        }
                    }
                }
            }
        }

    }
}