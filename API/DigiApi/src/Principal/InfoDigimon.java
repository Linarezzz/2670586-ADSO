
package Principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import utils.ConsumoAPI;


public class InfoDigimon extends javax.swing.JPanel {
    
    JsonObject temp;
    ConsumoAPI consumo;
    
    public InfoDigimon(JsonObject temp) {
        this.temp = temp;
        initComponents();
        initAlternComponents();
    }
    
    public void initAlternComponents(){
        
        String imagenDigimon = temp.get("image").getAsString();
        
        try {
           
            String url = imagenDigimon;
            URL imgUrl = new URL(url);
            Image imagen = getToolkit().createImage(imgUrl);
            imagen = imagen.getScaledInstance(180, 180, Image.SCALE_SMOOTH);
            etqImagen.setIcon(new ImageIcon(imagen));
        } catch (MalformedURLException ex) {
            System.out.println("Error al cargar la imagen.");
        }
        
        String nombreDigimon = temp.get("name").getAsString();
        
        etqNombre.setText(nombreDigimon);
        
        
        contentPrincipal.setBorder(BorderFactory.createLineBorder(Color.WHITE,2));
        contentPrincipal.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e) {
                contentPrincipal.setCursor(new Cursor(Cursor.HAND_CURSOR));
                contentPrincipal.setBorder(BorderFactory.createLineBorder(Color.BLUE,2));
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                contentPrincipal.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                contentPrincipal.setBorder(BorderFactory.createLineBorder(Color.WHITE,2));
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPrincipal = new javax.swing.JPanel();
        etqImagen = new javax.swing.JLabel();
        etqNombre = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        contentPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        contentPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contentPrincipalMouseClicked(evt);
            }
        });

        etqImagen.setBackground(new java.awt.Color(0, 0, 0));
        etqImagen.setForeground(new java.awt.Color(0, 0, 0));
        etqImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etqNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqNombre.setForeground(new java.awt.Color(0, 0, 0));
        etqNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqNombre.setText("Nombre");

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etqNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(etqImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etqNombre)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void contentPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contentPrincipalMouseClicked
        // Detalle del digimon
        DetalleDigimon ventana = new DetalleDigimon(temp);
    }//GEN-LAST:event_contentPrincipalMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etqImagen;
    private javax.swing.JLabel etqNombre;
    // End of variables declaration//GEN-END:variables
}
