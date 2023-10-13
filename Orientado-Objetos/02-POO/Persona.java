public class Persona{


    // Atributos -> Caracteristicas, que variables son propios de las clases
    // Los atributos privados se deben de poner antes del tipo de dato, normalmente los atributos van privados
    int cedula;   
    String nombres;
    String apellidos;
    int edad;
    int altura;
    double peso;

    // Metodos -> Acciones
    //      - Constructor
    public Persona(int dato1, String dato2, String dato3, int dato4, int dato5, double dato6){    // Definir funcion constructora
        cedula = dato1;    // this. hace referencia a la variable global
        nombres = dato2;
        apellidos = dato3;
        edad = dato4;
        altura = dato5;
        peso = dato6;
    }

    // - Getters 
    public int getCedula(){     // Metodo get, con get y luego con el que se va a extraer, en mayuscula Y LOS GET NO RECIBEN NADA
        return cedula;
    }

    public String getNombres(){
        return nombres;
    }

    public String getApellidos(){
        return apellidos;
    }

    public int getEdad(){
        return edad;
    }

    public int getAltura(){
        return altura;
    }

    public double getPeso(){
        return peso;
    }


    // - Setters, void para no retornar NADA
    public void setCedula(int dato){    //Set para asignar el valor
        cedula = dato;
    }

    public void setNombres(String dato){
        nombres = dato;
    }

    public void setApellidos(String dato){
        apellidos = dato;
    }

    public void setEdad(int dato){
        edad = dato;
    }

    public void setAltura(int dato){
        altura = dato;
    }

    public void setPeso(double dato){
        peso = dato;
    }

    //Funcion (metodo) carta de presentacion
    public void imprimirEstado(){
        System.out.println("|---------------------------------------|");
        System.out.println("|- Cedula: "+ cedula);
        System.out.println("|- Nombres: "+ nombres);
        System.out.println("|- Apellidos: "+ apellidos);
        System.out.println("|- Edad: "+ edad);
        System.out.println("|- Altura: "+ altura);
        System.out.println("|- Peso: "+ peso);
        System.out.println("|---------------------------------------|");

    }

    //Funcion (metodo) para la actividad fisica
    public void actividadFisica(int minutos){
        peso = peso - ((peso * 0.00005) * minutos);
    }

    //Funcion (metodo) para engordar
    public void aumentarPeso(int calorias){
        peso = peso + (calorias * 0.00005 );
    }

    
    

}