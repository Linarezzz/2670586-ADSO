package Principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import utils.ConsumoAPI;


public class Digidex extends javax.swing.JFrame {

    ConsumoAPI consumo;
    int pagina;
    
    public Digidex() {
        this.consumo = new ConsumoAPI();
        this.pagina = 0;
        initComponents();
        initAlternComponents();
        cargarDigimones();
        
    }
    
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPrincipal = new javax.swing.JPanel();
        etqLogo = new javax.swing.JLabel();
        panelDigimones = new javax.swing.JPanel();
        panelPaginador = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        etqLogo.setForeground(new java.awt.Color(255, 255, 255));
        etqLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqLogo.setText("jLabel1");

        panelDigimones.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panelDigimonesLayout = new javax.swing.GroupLayout(panelDigimones);
        panelDigimones.setLayout(panelDigimonesLayout);
        panelDigimonesLayout.setHorizontalGroup(
            panelDigimonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelDigimonesLayout.setVerticalGroup(
            panelDigimonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        panelPaginador.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panelPaginadorLayout = new javax.swing.GroupLayout(panelPaginador);
        panelPaginador.setLayout(panelPaginadorLayout);
        panelPaginadorLayout.setHorizontalGroup(
            panelPaginadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 877, Short.MAX_VALUE)
        );
        panelPaginadorLayout.setVerticalGroup(
            panelPaginadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 67, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDigimones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPaginador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
            .addComponent(etqLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(etqLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panelDigimones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(panelPaginador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
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
        setTitle("DIGIMON");
        setIconImage( getToolkit().createImage(ClassLoader.getSystemResource("imagenes/logoDigimon.png")) );
        setLocationRelativeTo(null);
      
        Image icono = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/logoDigimon.png"));
        icono= icono.getScaledInstance(130, 130, Image.SCALE_SMOOTH);
        etqLogo.setIcon(new ImageIcon(icono));
        setResizable(false);
        setVisible(true);
        
        panelDigimones.setLayout(new GridLayout(2,3));
        
        
    }
    
    public void cargarDigimones(){
        int page = (this.pagina);
        String endpoint = "https://digi-api.com/api/v1/digimon?page="+page;
        String data = this.consumo.consumoGET(endpoint);
        
        JsonObject dataJson = JsonParser.parseString(data).getAsJsonObject();
        JsonArray content = dataJson.getAsJsonArray("content");
        
        for (int i = 0; i < content.size(); i++) {
            //Añadir los contenedores InfoDigimon
            
            JsonObject temp = content.get(i).getAsJsonObject();
            InfoDigimon contenedor = new InfoDigimon(temp);
            panelDigimones.add(contenedor);
            
            revalidate();
            repaint();
        }
        cargarPaginador();   
        revalidate();
        repaint();
        
    }
    
    public void cargarPaginador() {
        panelPaginador.removeAll();
        panelPaginador.setLayout(new BoxLayout(panelPaginador, BoxLayout.LINE_AXIS));
        panelPaginador.add(Box.createHorizontalGlue());

        JButton boton_atras_pagina = new JButton("<");
        JButton boton_atras_completo = new JButton("<<");

        boton_atras_pagina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pagina = Math.max(0, pagina - 1);
                panelDigimones.removeAll();
                cargarDigimones();
            }
        });

        boton_atras_completo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pagina = 0;
                panelDigimones.removeAll();
                cargarDigimones();
            }
        });

        panelPaginador.add(boton_atras_completo);
        panelPaginador.add(boton_atras_pagina);

        
        for (int i = 0; i < 7; i++) {
            final int paginaActual = pagina + i; 

            if (paginaActual <= 291) {
                JButton botones = new JButton(String.valueOf(paginaActual + 1)); 
                panelPaginador.add(botones);

                botones.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pagina = paginaActual;
                        panelDigimones.removeAll();
                        cargarDigimones();
                    }
                });
            }
        }

        JButton boton_siguiente_pagina = new JButton(">");
        JButton boton_siguiente_completo = new JButton(">>");

        boton_siguiente_pagina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pagina = Math.min(291, pagina + 1); 
                panelDigimones.removeAll();
                cargarDigimones();
            }
        });

        boton_siguiente_completo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pagina = 291;
                panelDigimones.removeAll();
                cargarDigimones();
            }
        });

        panelPaginador.add(boton_siguiente_pagina);
        panelPaginador.add(boton_siguiente_completo);

        panelPaginador.add(Box.createHorizontalGlue());
        panelPaginador.revalidate();
        panelPaginador.repaint();
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
            java.util.logging.Logger.getLogger(Digidex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Digidex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Digidex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Digidex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Digidex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etqLogo;
    private javax.swing.JPanel panelDigimones;
    private javax.swing.JPanel panelPaginador;
    // End of variables declaration//GEN-END:variables
}
