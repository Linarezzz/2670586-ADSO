import java.util.Scanner;

public class Principal{
	public static void main(String[] args) {
		
		Scanner entrada_numero = new Scanner( System.in );
		Scanner entrada_texto = new Scanner( System.in );

        Persona listaPersonas [] = new Persona [99];
        int indicePersonas = 0;

        listaPersonas[0] = new Persona( 108800, "Oscar", "Loaiza", 85, 185, 300.5 );
		listaPersonas[1] = new Persona( 108801, "Daniel", "Garcia", 32, 175, 110.8 );
		listaPersonas[2] = new Persona( 108802, "Juan", "Perez", 20, 180, 50);
		listaPersonas[3] = new Persona( 108803, "Daniela", "Soto", 25, 160, 55);
		listaPersonas[4] = new Persona( 108804, "Andres", "Guzman", 18, 165, 50);

        indicePersonas = 5;

		int opcion = 0;
		while( opcion!=11 ){
            System.out.println("\n\n");  // Salto de linea
			System.out.println("+-------------------------------------+");
			System.out.println("+           MENU DE PERSONAS          +");
			System.out.println("+-------------------------------------+");
			System.out.println("|                        Memoria: "+(99-indicePersonas)+"  |");
			System.out.println("|   1: Registrar Persona.             |");
			System.out.println("|   2: Ver lista de Personas.         |");
			System.out.println("|   3: Editar Persona.                |");
			System.out.println("|   4: Eliminar Persona.              |");
			System.out.println("|   5: Persona con mayor edad.        |");
            System.out.println("|   6: Persona con menor edad.        |");
			System.out.println("|   7: Persona mas alta.              |");
            System.out.println("|   8: Persona mas baja.              |");
            System.out.println("|   9: Promedio de edades.            |");
            System.out.println("|   10: Promedio de altura.           |");
            System.out.println("|   11: Salir.                        |");
			System.out.println("+-------------------------------------+");
			System.out.print("=> Ingrese una opcion (1 al 11): ");
			opcion = entrada_numero.nextInt();

			if(opcion==1){
                System.out.println("\n\n");
				System.out.println("+-------------------------------------+");
                System.out.println("+           REGISTRAR PERSONA          +");
                System.out.println("+-------------------------------------+");

                System.out.print("Ingrese la cedula: ");
                int cedula = entrada_numero.nextInt();

                System.out.print("Ingrese los nombres: ");
                String nombres = entrada_texto.nextLine();

                System.out.print("Ingrese los apellidos: ");
                String apellidos = entrada_texto.nextLine();

                System.out.print("Ingrese la edad: ");
                int edad = entrada_numero.nextInt();

                System.out.print("Ingrese la altura: ");
                int altura = entrada_numero.nextInt();

                System.out.print("Ingrese el peso: ");
                double peso = entrada_numero.nextDouble();

                Persona temporal = new Persona (cedula,nombres,apellidos,edad,altura,peso);
                listaPersonas[ indicePersonas ] = temporal;
                indicePersonas++;
			}

			if(opcion==2){

                System.out.println("\n\n");
				System.out.println("+-------------------------------------+");
                System.out.println("+           LISTA DE PERSONAS         +");
                System.out.println("+-------------------------------------+");

				for(int i = 0; i < listaPersonas.length;i++){
                    if(listaPersonas[i] != null ){ // si es diferente de null, es por que hay algo, ese algo se imprime
                        System.out.println( (i+1) + " => "+listaPersonas[i].getInfoInLine() );  // llama al metodo getinfo, que muestra la info
                    }
                }
			}

			if(opcion==3){
				System.out.println("\n\n");
				System.out.println("+-------------------------------------+");
                System.out.println("+           EDITAR PERSONA            +");
                System.out.println("+-------------------------------------+");
                System.out.print("=> Ingrese cedula: ");
                int cedula = entrada_numero.nextInt();

                //Buscar si existe una persona con la cedula
                int indiceEncontrado = -1;
                for(int i = 0; i < listaPersonas.length ; i++){
                    if(listaPersonas[i] != null && listaPersonas[i].getCedula()==cedula){
                        indiceEncontrado = i;
                    }
                }

                if(indiceEncontrado !=-1){
                    System.out.print("Ingrese los nombres: ");
                    String nombres = entrada_texto.nextLine();

                    System.out.print("Ingrese los apellidos: ");
                    String apellidos = entrada_texto.nextLine();

                    System.out.print("Ingrese la edad: ");
                    int edad = entrada_numero.nextInt();

                    System.out.print("Ingrese la altura: ");
                    int altura = entrada_numero.nextInt();

                    System.out.print("Ingrese el peso: ");
                    double peso = entrada_numero.nextDouble();

                    Persona temporal = new Persona (cedula,nombres,apellidos,edad,altura,peso);
                    listaPersonas[ indiceEncontrado ] = temporal;
                    
                }else{
                    System.out.println("+--------------------------------------------------------------+");
                    System.out.println("+ La cedula: "+cedula+" no corresponde a un usuario del sistema");
                    System.out.println("+--------------------------------------------------------------+");
                }
			}

			if(opcion==4){
				System.out.println("\n\n");
				System.out.println("+-------------------------------------+");
                System.out.println("+           ELIMINAR PERSONA          +");
                System.out.println("+-------------------------------------+");
                System.out.print("=> Ingrese cedula: ");
                int cedula = entrada_numero.nextInt();

                //Buscar si existe una persona con la cedula
                int indiceEncontrado = -1;
                for(int i = 0; i < listaPersonas.length ; i++){
                    if(listaPersonas[i] != null && listaPersonas[i].getCedula()==cedula){
                        indiceEncontrado = i;
                    }
                }

                if(indiceEncontrado !=-1){

                    for( int i = indiceEncontrado; i < listaPersonas.length-1; i++){
                        listaPersonas[i] = listaPersonas[i+1];
                    }
                    indicePersonas -= 1;

                    listaPersonas[listaPersonas.length-1] = null;
                    System.out.println("+--------------------------------------------------------------+");
                    System.out.println("+                PERSONA ELIMINADA CON EXITO                    ");
                    System.out.println("+--------------------------------------------------------------+");
                }else{
                    System.out.println("+--------------------------------------------------------------+");
                    System.out.println("+ La cedula: "+cedula+" no corresponde a un usuario del sistema");
                    System.out.println("+--------------------------------------------------------------+");
                }
			}

            if(opcion==5){
                //-Persona con mayor edad
                int maxEdad = -1; // La maxima edad en -1
                Persona personaMayorEdad = null;

                for (int i = 0; i < indicePersonas; i++) {
                    if (listaPersonas[i].getEdad() > maxEdad) {
                        maxEdad = listaPersonas[i].getEdad();
                        personaMayorEdad = listaPersonas[i];
                    }
                }

                if (personaMayorEdad != null) {
                    System.out.println("+----------------------------------------------+");
                    System.out.println("|  Persona con mayor edad:                     |");
                    System.out.println("|  " + personaMayorEdad.getInfoInLine());
                    System.out.println("+----------------------------------------------+");
                } else {
                    System.out.println("+-------------------------------------+");
                    System.out.println("|  No hay personas registradas.       |");
                    System.out.println("+-------------------------------------+");
                }
            }

            if(opcion==6){
                //Persona con menor edad
                int menEdad = 999;
                Persona personaMenorEdad = null;

                for(int i = 0; i < indicePersonas; i++){
                    if(listaPersonas[i].getEdad() < menEdad){
                        menEdad = listaPersonas[i].getEdad();
                        personaMenorEdad = listaPersonas[i];
                    }
                }

                if (personaMenorEdad != null) {
                    System.out.println("+-------------------------------------+");
                    System.out.println("|  Persona con menor edad:            |");
                    System.out.println("|  " + personaMenorEdad.getInfoInLine());
                    System.out.println("+-------------------------------------+");
                } else {
                    System.out.println("+-------------------------------------+");
                    System.out.println("|  No hay personas registradas.       |");
                    System.out.println("+-------------------------------------+");
                }
            }

            if(opcion==7){
                //Persona mas alta
                int maxAltura = -1;
                Persona personaMaxAlta = null;

                for(int i = 0; i < indicePersonas; i++){
                    if(listaPersonas[i].getAltura() > maxAltura){
                        maxAltura = listaPersonas[i].getAltura();
                        personaMaxAlta = listaPersonas[i];
                    }
                }

                if (personaMaxAlta != null) {
                    System.out.println("+-------------------------------------+");
                    System.out.println("|  Persona mas alta:                  |");
                    System.out.println("|  " + personaMaxAlta.getInfoInLine());
                    System.out.println("+-------------------------------------+");
                } else {
                    System.out.println("+-------------------------------------+");
                    System.out.println("|  No hay personas registradas.       |");
                    System.out.println("+-------------------------------------+");
                }
            }

            if(opcion==8){
                //Persona mas baja
                int minAltura = 999;
                Persona personaMasBaja = null;

                for(int i = 0; i < indicePersonas; i++){
                    if(listaPersonas[i].getAltura() < minAltura){
                        minAltura = listaPersonas[i].getAltura();
                        personaMasBaja = listaPersonas[i];
                    }
                }

                if (personaMasBaja != null) {
                    System.out.println("+-------------------------------------+");
                    System.out.println("|  Persona mas baja:                  |");
                    System.out.println("|  " + personaMasBaja.getInfoInLine());
                    System.out.println("+-------------------------------------+");
                } else {
                    System.out.println("+-------------------------------------+");
                    System.out.println("|  No hay personas registradas.       |");
                    System.out.println("+-------------------------------------+");
                }
            }

            if(opcion==9){
                //Promedio de edades
                int sumEdades = 0;
                for (int i = 0; i < indicePersonas; i++) {
                    sumEdades += listaPersonas[i].getEdad(); // Sumar la edad de cada persona
                }

                if (indicePersonas > 0) { // Evitar división por cero
                    double promedioEdades = (double) sumEdades / indicePersonas; // Calcular promedio
                    System.out.println("+-------------------------------------+");
                    System.out.println("|  Promedio de edades: " + promedioEdades);
                    System.out.println("+-------------------------------------+");
                } else {
                    System.out.println("+-------------------------------------+");
                    System.out.println("|  No hay personas registradas.       |");
                    System.out.println("+-------------------------------------+");
                }
            }

            if(opcion==10){
                //Promedio de altura
                int sumAltura = 0;
                for (int i = 0; i < indicePersonas; i++) {
                    sumAltura += listaPersonas[i].getAltura(); // Sumar la altura de cada persona
                }

                if (indicePersonas > 0) { // Evitar división por cero
                    double promedioAltura = (double) sumAltura / indicePersonas; // Calcular promedio
                    System.out.println("+-------------------------------------+");
                    System.out.println("|  Promedio de edades: " + promedioAltura);
                    System.out.println("+-------------------------------------+");
                } else {
                    System.out.println("+-------------------------------------+");
                    System.out.println("|  No hay personas registradas.       |");
                    System.out.println("+-------------------------------------+");
                }
            }

			if(opcion==11){
				System.out.println();
				System.out.println("+-------------------------+");
				System.out.println("|-------- SALIENDO -------|");
				System.out.println("+-------------------------+");


			}
		}

	}
}