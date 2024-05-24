package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import utils.ConsumoAPI;

public class Interfaz extends javax.swing.JFrame {
    
    // Instancia para realizar consumos
    ConsumoAPI consumo = new ConsumoAPI();
    DefaultTableModel modelo;
    
    public Interfaz() {
        initComponents();
        initAlternComponents();
        imprimirPokemon();
    }
    
    public void initAlternComponents(){
        setTitle("POKEDEX");
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/pokeball.png") ) );
        
        contNombres.setLayout(new BoxLayout(contNombres, BoxLayout.Y_AXIS));
        revalidate();
        
        modelo = (DefaultTableModel) tablaHabilidades.getModel();
        
        tablaHabilidades.getColumnModel().getColumn(0).setPreferredWidth(50);
        tablaHabilidades.getColumnModel().getColumn(1).setPreferredWidth(150);
        tablaHabilidades.getColumnModel().getColumn(2).setPreferredWidth(200);
        
        // Ajuste del Orden y Ancho de Columnas
        tablaHabilidades.getTableHeader().setReorderingAllowed(false);
        tablaHabilidades.getTableHeader().setResizingAllowed(false);
        
        // Alto de las filas
        tablaHabilidades.setRowHeight(20);
    }
    
    public void imprimirPokemon() {
        // Endpoint pokemons
        String respuesta01 = consumo.consumoGET("https://pokeapi.co/api/v2/pokemon?limit=20");
        System.out.println("Respuesta obtener: " + respuesta01);

        JsonObject pokemonObject = JsonParser.parseString(respuesta01).getAsJsonObject();
        JsonArray pokemonArray = pokemonObject.getAsJsonArray("results");

        for (int i = 0; i < pokemonArray.size(); i++) {
            JsonObject pokemon = pokemonArray.get(i).getAsJsonObject();
            String name = pokemon.get("name").getAsString();
            String url = pokemon.get("url").getAsString();

            // Boton para cada pokemon
            JButton pokemonButton = new JButton(name);

            pokemonButton.setBackground(Color.WHITE);
            pokemonButton.setContentAreaFilled(false);
            pokemonButton.setFocusPainted(true);
            pokemonButton.setHorizontalAlignment(SwingConstants.CENTER);
            pokemonButton.setVerticalAlignment(SwingConstants.CENTER);
            pokemonButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String nombrePokemon = name;
                    String pokemonUrl = url;
                    String respuesta02 = consumo.consumoGET(pokemonUrl);
                    JsonObject pokemonObject = JsonParser.parseString(respuesta02).getAsJsonObject();
                    JsonArray pokemonInfo = pokemonObject.getAsJsonArray("abilities");
                    JsonObject pokemonImagen = pokemonObject.getAsJsonObject("sprites");
                    JsonObject pokemonImagenOtro = pokemonImagen.getAsJsonObject("other");
                    JsonObject pokemonImagenDreamWorld = pokemonImagenOtro.getAsJsonObject("official-artwork");
                    String imagen = pokemonImagenDreamWorld.get("front_default").getAsString();

                    try {
                        URL imageUrl = new URL(imagen);
                        BufferedImage image = ImageIO.read(imageUrl);
                        ImageIcon icon = new ImageIcon(image);
                        Image scaledImage = icon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
                        ImageIcon scaledIcon = new ImageIcon(scaledImage);
                        etqImagen.setIcon(scaledIcon);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    modelo.setRowCount(0);
                    for (int i = 0; i < pokemonInfo.size(); i++) {
                        JsonObject temp = pokemonInfo.get(i).getAsJsonObject();
                        JsonObject ObjetoHabilidad = temp.getAsJsonObject("ability");
                        String habilidad = ObjetoHabilidad.get("name").getAsString();
                        String url = ObjetoHabilidad.get("url").getAsString();                        

                        Object datos[] = new Object[]{(i + 1), habilidad, url};
                        modelo.addRow(datos);
                    }
                  
                    // Cambiar el etqPokemon con el nombre del Pokemon
                    etqNombrePokemon.setText(nombrePokemon);
                    etqNombrePokemon.setForeground(Color.BLACK);
                    etqNombrePokemon.setText(etqNombrePokemon.getText().toUpperCase());
                    contInfo.revalidate();
                    contInfo.repaint();
                    
                    


                }
            });

            // Poner el boton al contenedor
            contNombres.add(pokemonButton);
      
         }

        revalidate();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contPrincipal = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contNombres = new javax.swing.JPanel();
        contInfo = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaHabilidades = new javax.swing.JTable();
        etqNombrePokemon = new javax.swing.JLabel();
        etqImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        etqTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 51, 0));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("POKEDEX");

        contNombres.setLayout(new javax.swing.BoxLayout(contNombres, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(contNombres);

        contInfo.setBackground(new java.awt.Color(255, 255, 255));
        contInfo.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout contInfoLayout = new javax.swing.GroupLayout(contInfo);
        contInfo.setLayout(contInfoLayout);
        contInfoLayout.setHorizontalGroup(
            contInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );
        contInfoLayout.setVerticalGroup(
            contInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
        );

        tablaHabilidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "N", "Habilidad", "Url"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaHabilidades);

        etqNombrePokemon.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etqNombrePokemon.setForeground(new java.awt.Color(255, 255, 255));
        etqNombrePokemon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqNombrePokemon.setText("jLabel1");

        etqImagen.setForeground(new java.awt.Color(255, 255, 255));
        etqImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqImagen.setText("jLabel1");

        javax.swing.GroupLayout contPrincipalLayout = new javax.swing.GroupLayout(contPrincipal);
        contPrincipal.setLayout(contPrincipalLayout);
        contPrincipalLayout.setHorizontalGroup(
            contPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contPrincipalLayout.createSequentialGroup()
                .addGroup(contPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contPrincipalLayout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contPrincipalLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(contPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contPrincipalLayout.createSequentialGroup()
                                .addGroup(contPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contPrincipalLayout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contPrincipalLayout.createSequentialGroup()
                                        .addGap(120, 120, 120)
                                        .addComponent(etqNombrePokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contPrincipalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etqImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)))
                        .addComponent(contInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contPrincipalLayout.setVerticalGroup(
            contPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                    .addComponent(contInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contPrincipalLayout.createSequentialGroup()
                        .addComponent(etqNombrePokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(etqImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contInfo;
    private javax.swing.JPanel contNombres;
    private javax.swing.JPanel contPrincipal;
    private javax.swing.JLabel etqImagen;
    private javax.swing.JLabel etqNombrePokemon;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaHabilidades;
    // End of variables declaration//GEN-END:variables
}
