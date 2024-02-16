package utils;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDatos {
    
    Connection conexion;
    Statement manipularDB;
    
    public BaseDatos(){
        String hostname = "localhost";
        String puerto = "3306";
        String databasename = "app_java";
        String user = "root";
        String password = "";
        
        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+databasename;
        
        try {
            conexion = DriverManager.getConnection(url, user, password);   // Probar errores en tiempo de ejecucion
            manipularDB = conexion.createStatement(); // Crea la conexion
            System.out.println("Conexion exitosa a la base de datos");
        } catch (SQLException ex) {  // Catch es la linea de codigo por la que se va si la conexion no es correcta
            System.out.println("Error en conexion a base de datos");
            System.out.println(ex.getLocalizedMessage());  // EX se tiene en cuenta en la linea de catch, puede ser otra diferente 
        }
    }
    
    public void imprimirPersonas(){
        ResultSet registros = null;  // Son paquetes de datos, trae la informacion de la base de datos
        
        try {
	    String consulta = "SELECT * FROM personas";
	    registros = manipularDB.executeQuery(consulta);  // Ejecutar registros
	    registros.next();  // Selecciona el siguiente dato de la base de datos, 
	    if(registros.getRow()==1){
	        do{
	            System.out.println(registros.getRow()+" => "+registros.getString("nombres")+" "+registros.getString("apellidos"));  // Imprime las personas en la base de datos
	        }while(registros.next()); // Mientras que existan las personas
	    }else{
	        System.out.println("No se encuentran clientes registrados.");
	    }
	} catch (SQLException ex) {
	    System.out.println("Error al buscar el cliente: "+ex.getMessage());
	}
    }
    
    public Persona[] extraerPersonas(){
        
        try {
            Persona arreglo [] = new Persona[100];
            String consulta = "SELECT * FROM personas";
            ResultSet registros = manipularDB.executeQuery(consulta);
            registros.next();
            if(registros.getRow()==1){
                int i = 0;
                do {
                    String documento = registros.getString("cedula");
                    String nombres = registros.getString("nombres");
                    String apellidos = registros.getString("apellidos");
                    String telefono = registros.getString("telefono");
                    String correo = registros.getString("email");
                    
                    arreglo[i] = new Persona(documento,nombres,apellidos,telefono,correo);
                    i++;
                } while (registros.next());
                return arreglo;
            }else{
                return arreglo;
            }
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar el SELECT");
            System.out.println(ex.getMessage());  // Obtener el mensaje
            return null;
        }
        
    }
    
    public boolean insertarPersonas(String cedula, String nombres, String apellidos,String telefono, String direccion, String email){   // Todas las columnas de la base de datos se envian como parametros
        boolean respuesta = false;
        try {
            String consulta = "INSERT INTO personas (cedula, nombres, apellidos, direccion, telefono, email) VALUES ('"+cedula+"','"+nombres+"','"+apellidos+"','"+direccion+"','"+telefono+"','"+email+"')";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta==1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Insert: " + ex.getMessage());
        }
        if (respuesta){
            System.out.println("Insertado con exito");
            
        }else{
            System.out.println("No se pudo insertar");
            
        }
        return respuesta;
        
        
    }
    
    public boolean actualizarPersona(String cedula, String nombres, String apellidos,String telefono, String direccion, String email){
        boolean respuesta = false;
        try {
            String consulta = "UPDATE personas SET nombres='"+nombres+"', apellidos='"+apellidos+"', direccion='"+direccion+"', telefono='"+telefono+"', email='"+email+"' WHERE cedula='"+cedula+"' ";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta==1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
        System.out.println("--> Error Update: " + ex.getMessage());
        }
        if (respuesta){
            System.out.println("Editado con exito");
        }else{
            System.out.println("No se pudo Editar");
        }
        return respuesta;
    }
    
    public boolean eliminarPersona(String cedula){
        boolean respuesta = false;
        try {        
            String consulta = "DELETE FROM personas WHERE cedula='"+cedula+"' ";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta==1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Delete: " + ex.getMessage());
        }
        if (respuesta){
            System.out.println("Eliminado con exito");
        }else{
            System.out.println("No se pudo Eliminar");
        }
        return respuesta;
    }
}
