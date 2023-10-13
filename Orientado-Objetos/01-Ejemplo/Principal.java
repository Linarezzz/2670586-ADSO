public class Principal{
    public static void main (String []args){
                                    //Instanciacion !
        Persona persona_01 = new Persona( 108800, "Juan", "Linares", 18, 185, 60.5 );  // Crear variable tipo persona, y datos
                                        // Se asignan los datos que se pidieron en el constructor

        System.out.println("Atributos cedula: "+ persona_01.cedula);  //Acceder al atributo
        System.out.println("Metodo getCedula: "+persona_01.getCedula()); // Acceder al metodo

        Persona persona_02 = new Persona(108801, "Valentina", "Jaramillo", 16, 160, 50.2);

        persona_01.imprimirEstado();   // Invocar el metodo (funcion) para mostrar la informacion de la persona, el status
        persona_02.imprimirEstado();

        persona_01.actividadFisica(80);
        persona_02.actividadFisica(30);

        persona_01.imprimirEstado(); // Funcion general para imprimir el estado de la persona
        persona_02.imprimirEstado();

        

    }
}