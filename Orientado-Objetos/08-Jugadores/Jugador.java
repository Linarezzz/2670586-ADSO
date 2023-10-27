public class Jugador{

    //Atributos

    public int cedula;
    public String nombre;
    public int edad;
    public String posicion;


    //Constructor
    public Jugador(int cedula, String nombre, int edad, String posicion){
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    //Metodos getters
    public int getCedula(){
        return cedula;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public String getPosicion(){
        return posicion;
    }

    //Metodos setters
    public void setCedula(int dato){
        cedula = dato;
    }

    public void setNombre(String dato){
        nombre = dato;
    }

    public void setEdad(int dato){
        edad = dato;
    }

    public void setPosicion(String dato){
        posicion = dato;
    }
}