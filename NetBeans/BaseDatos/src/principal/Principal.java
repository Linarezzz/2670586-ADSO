package principal;

import utils.BaseDatos;

public class Principal {
    public static void main (String[] args){
        
        BaseDatos basedatos = new BaseDatos();
        
        //basedatos.imprimirPersonas();
        
        //Persona listado[] = basedatos.extraerPersonas();
        //for (int i = 0; i < listado.length && listado[i]!=null; i++) {
            //System.out.println(" -> "+listado[i].getNombres()+" "+listado[i].getApellidos());
            
        //}
        
        //basedatos.insertarPersonas("1089","Juan","Linares","32048","Calle 37","juan@gmail.com");
        
        //basedatos.imprimirPersonas();
        //basedatos.actualizarPersona(, nombres, apellidos, telefono, direccion, email)
        
        //basedatos.eliminarPersona("1089");
        
        Menu ventana = new Menu();
    }
}
