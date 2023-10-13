import javax.swing.JFrame;

public class Principal{
    public static void main (String []args){
                                    
        Persona arreglo [] = new Persona [100];  // Para crear un arreglo con un nuevo tipo de dato, que se creo, en el archivo persona.java

        arreglo[0] = new Persona(1089599163, "Juan", "Linares", 18, 185, 50.0 );  
        arreglo[1] = new Persona(5484185, "Valen", "Jaramillo", 16, 160, 45.5 );
        arreglo[2] = new Persona(758622, "Cami", "Linares", 23, 175, 80.5 );
        arreglo[3] = new Persona(872867, "Saul", "Linares", 49, 190, 90.2 );
        arreglo[4] = new Persona(25484556, "Yasmin", "Carrasco", 49, 160, 76.9 );

        for(int i = 0; i < arreglo.length; i++){             // Se ejecute el get nombre para que se muestre
            if (arreglo[i] != null){ // La condicion, con arreglo en posicion i, se ejecuta y muestra el nombre solo si el valor es diferente de Null (sin datos)
            System.out.println("Persona "+i+": "+ arreglo[i].getNombres());
            }
        }
    }
}