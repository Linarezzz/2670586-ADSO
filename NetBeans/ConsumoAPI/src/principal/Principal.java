package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.HashMap;
import java.util.Map;
import util.ConsumoAPI;

public class Principal {
    public static void main(String[] args) {
        
        Interfaz ventana = new Interfaz();
        
        // Instancia para realizar consumos
        ConsumoAPI consumo = new ConsumoAPI();
        
        // EndPoint obtener
        String respuesta01 = consumo.consumoGET("https://codetesthub.com/API/Obtener.php");
        System.out.println("Respuesta obtener" + respuesta01);
        
        // EndPoint Insertar
        Map<String, String> datosInsertar = new HashMap<>();
        datosInsertar.put("cedula", "1099010");
        datosInsertar.put("nombres", "Juan");
        datosInsertar.put("apellidos", "Linares");
        datosInsertar.put("telefono", "58948684");
        datosInsertar.put("direccion", "Calle 20");
        datosInsertar.put("email", "Juan@gmail.com");

        String respuesta02 = consumo.consumoPOST("https://codetesthub.com/API/Insertar.php", datosInsertar);
        System.out.println("Respuesta insertar" + respuesta02);
        
        // EndPoint Actualizar
        Map<String, String> datosActualizar = new HashMap<>();
        datosActualizar.put("cedula", "1099010");
        datosActualizar.put("nombres", "Longaniza");
        datosActualizar.put("apellidos", "Ramirez");
        datosActualizar.put("telefono", "84848");
        datosActualizar.put("direccion", "Debajo del viaducto");
        datosActualizar.put("email", "longaniza@gmail.com");
        
        String respuesta03 = consumo.consumoPOST("https://codetesthub.com/API/Actualizar.php", datosActualizar);
        System.out.println("Respuesta actualizar" + respuesta03);
        
        // EndPoint Eliminar
        //Map<String, String> datosEliminar = new HashMap<>();
        //datosEliminar.put("cedula", "1099010");
        
        //String respuesta04 = consumo.consumoPOST("https://codetesthub.com/API/Eliminar.php", datosEliminar);
        //System.out.println("Respuesta eliminar" + respuesta04);
        
        // Convertir texto a arreglo JSON
        JsonArray registros = JsonParser.parseString(respuesta01).getAsJsonArray();
        for (int i = 0; i < registros.size(); i++) {
            JsonObject temp = registros.get(i).getAsJsonObject();
            String nombres = temp.get("nombres").getAsString();
            String apellidos = temp.get("apellidos").getAsString();

         
            System.out.println(nombres+" "+apellidos);
        }


    }
    
}
