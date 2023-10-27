import java.util.Scanner;
public class Principal{
    public static void main (String[] args){

        Scanner entrada_numero = new Scanner(System.in);
        Scanner entrada_texto = new Scanner(System.in);


        Curso listaCursos [] = new Curso [100];
        int indiceCursos = 0;

        int opcion = 0;

        while(opcion !=7){
            System.out.println("+---------------------------------------------+");
            System.out.println("|                MENU DE CURSOS               |");                    
            System.out.println("+---------------------------------------------+");
            System.out.println("                              | Memoria: "+(100-indiceCursos)+"  |");                  
            System.out.println("|  1. Crear curso.                            |");                    
            System.out.println("|  2. Listar todos los cursos.                |");                    
            System.out.println("|  3. Ver detalle de curso.                   |");                    
            System.out.println("|  4. Editar informacion de un curso.         |");                    
            System.out.println("|  5. Agregar tema a curso.                   |");                   
            System.out.println("|  6. Eliminar curso.                         |");                    
            System.out.println("|  7. Salir.                                  |");                    
            System.out.println("|                                             |");                   
            System.out.println(" +--------------------------------------------+");

            System.out.println("+-------------------------------------+");
			System.out.print("=> Ingrese una opcion (1 al 7): ");
			opcion = entrada_numero.nextInt();

            if(opcion == 1){
                System.out.println("\n\n");
                System.out.println("+-------------------------------------+");
				System.out.println("+           REGISTRAR CURSO           +");
				System.out.println("+-------------------------------------+");

                System.out.print("Ingrese el codigo del curso: ");
                int codigo = entrada_numero.nextInt();

                System.out.print("Ingrese el nombre del curso: ");
                String nombre = entrada_texto.nextLine();

                System.out.print("Ingrese el area de conocimiento: ");
                String area = entrada_texto.nextLine();

                System.out.print("Ingrese las horas del curso: ");
                int horas = entrada_numero.nextInt();

                Curso temporal = new Curso(codigo,nombre,area,horas);
                listaCursos[indiceCursos] = temporal;
                indiceCursos += 1;

                System.out.println("Curso creado con exito");


            }

            if(opcion == 2){
                System.out.println("\n\n");
				System.out.println("+-------------------------------------+");
				System.out.println("+           LISTA DE CURSOS           +");
				System.out.println("+-------------------------------------+");

                for(int i = 0; i < listaCursos.length;i++){
                    if(listaCursos[i] != null){
                        System.out.println( (i+1) + " => "+listaCursos[i].getInfoinLine());
                    }
                }
            }

            if(opcion == 3){
                System.out.println("\n\n");
                System.out.println("+-------------------------------------+");
				System.out.println("+          VER DETALLE DE CURSO       +");
				System.out.println("+-------------------------------------+");
                
                System.out.print("Ingrese el codigo del curso: ");
                int codigo = entrada_numero.nextInt();

                //Buscar si existe un curso con ese codigo
                int indiceEncontrado = -1;

                for(int i = 0; i < listaCursos.length;i++){
                    if(listaCursos[i] != null && listaCursos[i].getCodigo()==codigo){
                        indiceEncontrado = i;
                    }
                }

                if(indiceEncontrado != -1){
                    System.out.println("Detalles del curso:");
                    listaCursos[indiceEncontrado].imprimirDetalleCurso();
                }else{
                    System.out.println("+-------------------------------------+");
					System.out.println("+ El codigo "+codigo+" no corresponde  ");
					System.out.println("+ a un curso del sistema.              ");
					System.out.println("+-------------------------------------+");
                }
            }
            
            if(opcion == 4){
                System.out.println("\n\n");
                System.out.println("+-------------------------------------+");
				System.out.println("+    EDITAR INFORMACION DE UN CURSO   +");
				System.out.println("+-------------------------------------+");

                System.out.print("Ingrese el codigo del curso: ");
                int codigo = entrada_numero.nextInt();

                //Buscar si existe un curso con ese codigo
                int indiceEncontrado = -1;

                for(int i = 0; i < listaCursos.length;i++){
                    if(listaCursos[i] != null && listaCursos[i].getCodigo()==codigo){
                        indiceEncontrado = i;
                    }
                }

                if(indiceEncontrado !=-1){

                    System.out.print("Ingrese el nuevo nombre del curso: ");
                    String nombre = entrada_texto.nextLine();

                    System.out.print("Ingrese el area de conocimiento: ");
                    String area = entrada_texto.nextLine();

                    System.out.print("Ingrese las horas del curso: ");
                    int horas = entrada_numero.nextInt();

                    Curso temporal = new Curso(codigo,nombre,area,horas);
                    listaCursos[indiceEncontrado] = temporal;

                    System.out.println("Curso editado con exito");
                }else{
                    System.out.println("+-------------------------------------+");
					System.out.println("+ El codigo "+codigo+" no corresponde  ");
					System.out.println("+ a un curso del sistema.              ");
					System.out.println("+-------------------------------------+");
                }
            }

            if(opcion == 5){
                System.out.println("\n\n");
				System.out.println("+-------------------------------------+");
				System.out.println("+       AGREGAR TEMA A CURSO          +");
				System.out.println("+-------------------------------------+");

                System.out.println("Ingrese el codigo del curso: ");
                int codigo = entrada_numero.nextInt();

                //Curso
                int indiceEncontrado = -1;
                for(int i = 0; i < listaCursos.length;i++){
                    if(listaCursos[i] != null && listaCursos[i].getCodigo() == codigo){
                        indiceEncontrado = i;
                        break;
                    }
                }

                if(indiceEncontrado != -1){
                    System.out.print("Ingrese el nombre del tema: ");
                    String tema = entrada_texto.nextLine();

                    listaCursos[indiceEncontrado].agregarTema(tema);

                }
            }

            if(opcion == 6){
                System.out.println("\n\n");
				System.out.println("+-------------------------------------+");
				System.out.println("+            ELIMINAR CURSO           +");
				System.out.println("+-------------------------------------+");

                System.out.print("Ingrese el codigo del curso: ");
                int codigo = entrada_numero.nextInt();

                //Buscar curso
                int indiceEncontrado = -1;
                for(int i = 0; i < listaCursos.length;i++){
                    if(listaCursos[i] != null && listaCursos[i].getCodigo() == codigo){
                        indiceEncontrado = i;
                        break;
                    }
                }

                //Validar
                if(indiceEncontrado != -1){
                    for(int i = indiceEncontrado; i< listaCursos.length-1;i++){
                        listaCursos[i] = listaCursos[i+1];
                    }
                    listaCursos[listaCursos.length-1] = null;
                    indiceCursos -= 1;

                    System.out.println("+-------------------------------------+");
					System.out.println("+      CURSO ELIMINADO CON EXITO      +");
					System.out.println("+-------------------------------------+");
                }else{
                    System.out.println("+-------------------------------------+");
					System.out.println("+ El codigo "+codigo+" no corresponde  ");
					System.out.println("+ a un curso del sistema.              ");
					System.out.println("+-------------------------------------+");
                }
            }

            if(opcion == 7){
                System.out.println("Hasta luego!");
            }                   

        }

    }
}