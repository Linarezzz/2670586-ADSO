public class Producto {
    
    private String id;
    private String nombre;
    private int precio;

    public Producto(String id, String nombre, int precio){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    //Getters
    public String getId(){
        return this.id;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getPrecio(){
        return this.precio;
    }

    //Setters
    public void getId(String id){
        this.id = id;
    }
    public void getNombre(String nombre){
        this.nombre = nombre;
    }
    public void getPrecio(int precio){
        this.precio = precio;
    }
}
