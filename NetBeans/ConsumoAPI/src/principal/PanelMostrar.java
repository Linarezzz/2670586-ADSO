package principal;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.HashMap;
import java.util.Map;
import util.ConsumoAPI;

import javax.swing.table.DefaultTableModel;


public class PanelMostrar extends javax.swing.JPanel {
    
    ConsumoAPI consumo = new ConsumoAPI();
    DefaultTableModel modelo;

    public PanelMostrar() {
        initComponents();
        initAlternComponent();
        imprimirPersonas();
    }

    public void initAlternComponent(){
        modelo = (DefaultTableModel) tablaPersonas.getModel();
        
        tablaPersonas.getColumnModel().getColumn(0).setPreferredWidth(20);
        tablaPersonas.getColumnModel().getColumn(1).setPreferredWidth(150);
        tablaPersonas.getColumnModel().getColumn(2).setPreferredWidth(250);
        tablaPersonas.getColumnModel().getColumn(3).setPreferredWidth(150);
        tablaPersonas.getColumnModel().getColumn(4).setPreferredWidth(200);
        
        // Ajuste del Orden y Ancho de Columnas
        tablaPersonas.getTableHeader().setReorderingAllowed(false);
        tablaPersonas.getTableHeader().setResizingAllowed(false);
        
        // Alto de las filas
        tablaPersonas.setRowHeight(20);
    }

    public void imprimirPersonas(){
        // EndPoint obtener
        String respuesta01 = consumo.consumoGET("https://codetesthub.com/API/Obtener.php");
        
        // Convertir texto a arreglo JSON
        JsonArray registros = JsonParser.parseString(respuesta01).getAsJsonArray();
        modelo.setRowCount(0);
        for (int i = 0; i < registros.size(); i++) {
            JsonObject temp = registros.get(i).getAsJsonObject();
            String cedula = temp.get("cedula").getAsString();
            String nombres = temp.get("nombres").getAsString();
            String telefono = temp.get("telefono").getAsString();
            String email = temp.get("email").getAsString();
            
            Object datos[] = new Object[]{ (i+1), cedula, nombres, telefono, email};
            modelo.addRow(datos);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etqTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersonas = new javax.swing.JTable();

        etqTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(0, 51, 255));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("MOSTRAR PERSONAS");

        tablaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Cedula", "Nombre", "Telefono", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaPersonas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPersonas;
    // End of variables declaration//GEN-END:variables
}
