
package Principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import utils.ConsumoAPI;

public class DetalleDigimon extends javax.swing.JFrame {
    
    JsonObject temp;
    ConsumoAPI consumo;

    
    public DetalleDigimon(JsonObject temp) {
        this.temp = temp;
        this.consumo = new ConsumoAPI();
        initComponents();
        initAlternComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPrincipal = new javax.swing.JPanel();
        etqNombre = new javax.swing.JLabel();
        etqImagen = new javax.swing.JLabel();
        etqId = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaNivel = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaAtributos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaTipos = new javax.swing.JTable();
        etqCampoBatalla = new javax.swing.JLabel();
        etqField1 = new javax.swing.JLabel();
        etqInfo_1 = new javax.swing.JLabel();
        etqField2 = new javax.swing.JLabel();
        etqInfo_2 = new javax.swing.JLabel();
        etqField3 = new javax.swing.JLabel();
        etqInfo_3 = new javax.swing.JLabel();
        etqField4 = new javax.swing.JLabel();
        etqInfo_4 = new javax.swing.JLabel();
        etqField5 = new javax.swing.JLabel();
        etqInfo_5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        contentPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        etqNombre.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etqNombre.setForeground(new java.awt.Color(0, 0, 0));
        etqNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqNombre.setText("DIGIMON");

        etqId.setForeground(new java.awt.Color(0, 0, 0));
        etqId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqId.setText("jLabel1");

        TablaNivel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIVEL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TablaNivel);

        TablaAtributos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ATRIBUTOS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaAtributos);

        TablaTipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TIPOS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaTipos);

        etqCampoBatalla.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqCampoBatalla.setForeground(new java.awt.Color(0, 0, 0));
        etqCampoBatalla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqCampoBatalla.setText("CAMPO DE BATALLA");

        etqInfo_1.setBackground(new java.awt.Color(0, 0, 0));
        etqInfo_1.setForeground(new java.awt.Color(0, 0, 0));
        etqInfo_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etqInfo_2.setBackground(new java.awt.Color(0, 0, 0));
        etqInfo_2.setForeground(new java.awt.Color(0, 0, 0));
        etqInfo_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etqInfo_3.setBackground(new java.awt.Color(0, 0, 0));
        etqInfo_3.setForeground(new java.awt.Color(0, 0, 0));
        etqInfo_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etqInfo_4.setBackground(new java.awt.Color(0, 0, 0));
        etqInfo_4.setForeground(new java.awt.Color(0, 0, 0));
        etqInfo_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etqInfo_5.setBackground(new java.awt.Color(0, 0, 0));
        etqInfo_5.setForeground(new java.awt.Color(0, 0, 0));
        etqInfo_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(etqId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                .addComponent(etqCampoBatalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etqImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(286, 286, 286))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(etqInfo_1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(etqInfo_2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(etqInfo_3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(etqInfo_4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(etqInfo_5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(etqField1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(etqField2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(etqField3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etqField4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(etqField5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqId)
                .addGap(18, 18, 18)
                .addComponent(etqNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etqImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(etqCampoBatalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqField1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(etqField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(etqField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(etqField3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(etqInfo_1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(etqInfo_2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(etqInfo_3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(etqInfo_4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPrincipalLayout.createSequentialGroup()
                                .addComponent(etqInfo_5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))))
                    .addComponent(etqField2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void initAlternComponents(){
        setTitle("DETALLE DIGIMON");
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/logoDigimon.png")));
        setLocationRelativeTo(null);

        String urlDigimon = temp.get("href").getAsString();
        String data = this.consumo.consumoGET(urlDigimon);

        JsonObject dataJson = JsonParser.parseString(data).getAsJsonObject();

        String nombre = dataJson.get("name").getAsString();
        String id = dataJson.get("id").getAsString();

        etqId.setText(id);
        etqNombre.setText(nombre);
        etqNombre.setText(etqNombre.getText().toUpperCase());

        JsonArray imagenesHabilidades = dataJson.getAsJsonArray("fields");

        
        for (int i = 0; i < imagenesHabilidades.size(); i++) {
            JsonObject imagenObj = imagenesHabilidades.get(i).getAsJsonObject();
            String campoUrl = imagenObj.get("image").getAsString();
            String campoTexto = imagenObj.get("field").getAsString();

            try {
                URL imgUrl = new URL(campoUrl);
                Image imagen = getToolkit().createImage(imgUrl);
                imagen = imagen.getScaledInstance(70, 70, Image.SCALE_SMOOTH);

                
                switch (i) {
                    case 0:
                        etqField1.setIcon(new ImageIcon(imagen));
                        etqInfo_1.setText(campoTexto);
                        break;
                    case 1:
                        etqField2.setIcon(new ImageIcon(imagen));
                        etqInfo_2.setText(campoTexto);
                        break;
                    case 2:
                        etqField3.setIcon(new ImageIcon(imagen));
                        etqInfo_3.setText(campoTexto);
                        break;
                    case 3:
                        etqField4.setIcon(new ImageIcon(imagen));
                        etqInfo_4.setText(campoTexto);
                        break;
                    case 4:
                        etqField5.setIcon(new ImageIcon(imagen));
                        etqInfo_5.setText(campoTexto);
                        break;
                    default:
                        break;
                }
            } catch (MalformedURLException ex) {
                System.out.println("Error al cargar la imagen.");
            } catch (Exception ex) {
                System.out.println("Error al procesar la imagen.");
            }
        }

        // Cargar la imagen del Digimon principal
        try {
            JsonArray imagenDigimon = dataJson.getAsJsonArray("images");
            String imagenUrl = imagenDigimon.get(0).getAsJsonObject().get("href").getAsString();

            URL imgUrl = new URL(imagenUrl);
            Image imagen = getToolkit().createImage(imgUrl);
            imagen = imagen.getScaledInstance(180, 180, Image.SCALE_SMOOTH);
            etqImagen.setIcon(new ImageIcon(imagen));

        } catch (MalformedURLException ex) {
            System.out.println("Error al cargar la imagen.");
        } catch (Exception ex) {
            System.out.println("Error al procesar la imagen.");
        }
        
        
        

        DefaultTableModel modeloNivel = (DefaultTableModel) TablaNivel.getModel();
        DefaultTableModel modeloAtributos = (DefaultTableModel) TablaAtributos.getModel();
        DefaultTableModel modeloTipos = (DefaultTableModel) TablaTipos.getModel();

        // Ajuste del Orden y Ancho de Columnas
        TablaNivel.getTableHeader().setReorderingAllowed(false);
        TablaNivel.getTableHeader().setResizingAllowed(false);
        TablaAtributos.getTableHeader().setReorderingAllowed(false);
        TablaAtributos.getTableHeader().setResizingAllowed(false);
        TablaTipos.getTableHeader().setReorderingAllowed(false);
        TablaTipos.getTableHeader().setResizingAllowed(false);

        // Alto de las filas
        TablaNivel.setRowHeight(20);
        TablaAtributos.setRowHeight(20);
        TablaTipos.setRowHeight(20);

        // Centrar contenido de las tablas incluido las columnas
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        for (int i = 0; i < TablaNivel.getColumnCount(); i++) {
            TablaNivel.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        for (int i = 0; i < TablaAtributos.getColumnCount(); i++) {
            TablaAtributos.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        for (int i = 0; i < TablaTipos.getColumnCount(); i++) {
            TablaTipos.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        JsonArray niveles = dataJson.getAsJsonArray("levels");
        for (int i = 0; i < niveles.size(); i++) {
            String nivel = niveles.get(i).getAsJsonObject().get("level").getAsString();
            modeloNivel.addRow(new Object[]{nivel});
        }

        JsonArray atributos = dataJson.getAsJsonArray("attributes");
        for (int i = 0; i < atributos.size(); i++) {
            String atributo = atributos.get(i).getAsJsonObject().get("attribute").getAsString();
            modeloAtributos.addRow(new Object[]{atributo});
        }

        JsonArray tipos = dataJson.getAsJsonArray("types");
        for (int i = 0; i < tipos.size(); i++) {
            String tipo = tipos.get(i).getAsJsonObject().get("type").getAsString();
            modeloTipos.addRow(new Object[]{tipo});
        }

        setVisible(true);
        revalidate();
        repaint();
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DetalleDigimon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalleDigimon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalleDigimon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalleDigimon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
               
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaAtributos;
    private javax.swing.JTable TablaNivel;
    private javax.swing.JTable TablaTipos;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etqCampoBatalla;
    private javax.swing.JLabel etqField1;
    private javax.swing.JLabel etqField2;
    private javax.swing.JLabel etqField3;
    private javax.swing.JLabel etqField4;
    private javax.swing.JLabel etqField5;
    private javax.swing.JLabel etqId;
    private javax.swing.JLabel etqImagen;
    private javax.swing.JLabel etqInfo_1;
    private javax.swing.JLabel etqInfo_2;
    private javax.swing.JLabel etqInfo_3;
    private javax.swing.JLabel etqInfo_4;
    private javax.swing.JLabel etqInfo_5;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
