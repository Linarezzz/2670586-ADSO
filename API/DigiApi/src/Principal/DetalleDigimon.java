
package Principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        contentPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        etqNombre.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etqNombre.setForeground(new java.awt.Color(0, 0, 0));
        etqNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqNombre.setText("DIGIMON");

        etqId.setForeground(new java.awt.Color(0, 0, 0));
        etqId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqId.setText("jLabel1");

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(etqId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addComponent(etqImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
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
                .addContainerGap(335, Short.MAX_VALUE))
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
        setIconImage( getToolkit().createImage(ClassLoader.getSystemResource("imagenes/logoDigimon.png")) );
        setLocationRelativeTo(null);

        String urlDigimon = temp.get("href").getAsString();
        String data = this.consumo.consumoGET(urlDigimon);

        JsonObject dataJson = JsonParser.parseString(data).getAsJsonObject();

        String nombre = dataJson.get("name").getAsString();
        String id = dataJson.get("id").getAsString();

        etqId.setText(id);
        etqNombre.setText(nombre);

        try {
            JsonArray imagenes = dataJson.getAsJsonArray("images");
            String imagenUrl = imagenes.get(0).getAsJsonObject().get("href").getAsString();

            URL imgUrl = new URL(imagenUrl);
            Image imagen = getToolkit().createImage(imgUrl);
            imagen = imagen.getScaledInstance(180, 180, Image.SCALE_SMOOTH);
            etqImagen.setIcon(new ImageIcon(imagen));
        } catch (MalformedURLException ex) {
            System.out.println("Error al cargar la imagen. ");
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
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etqId;
    private javax.swing.JLabel etqImagen;
    private javax.swing.JLabel etqNombre;
    // End of variables declaration//GEN-END:variables
}
