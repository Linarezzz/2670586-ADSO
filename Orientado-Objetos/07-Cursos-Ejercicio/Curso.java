public class Curso{

    //Atributos
    public int codigo;
    public String nombre;
    public String area;
    public int horas;
    public String lista_temas [];

    //Constructor
    public Curso(int codigo, String nombre, String area, int horas){
        this.codigo = codigo;
        this.nombre = nombre;
        this.area = area;
        this.horas = horas;

        lista_temas = new String [15];
    }

    //Metodos getters
    public int getCodigo(){
        return codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public String getArea(){
        return area;
    }

    public int getHoras(){
        return horas;
    }

    //Metodos setters
    public void SetCodigo(int dato){
        codigo = dato;
    }

    public void setNombre(String dato){
        nombre = dato;
    }

    public void setArea(String dato){
        area = dato;
    }

    public void setHoras(int dato){
        horas = dato;
    }
    
    //Metodos
}