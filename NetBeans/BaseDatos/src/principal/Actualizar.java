
package principal;

import java.awt.Image;


public class Actualizar extends javax.swing.JFrame {

   
    public Actualizar() {
        initComponents();
        initAlternComponents();
    }

    
    public void initAlternComponents(){
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("Menu editar persona");
        setResizable(false);
        
        Image icono_editar = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/editar_usuario.png"));
        icono_editar = icono_editar.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        setIconImage(icono_editar);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contPrincipal = new javax.swing.JPanel();
        contSecundario = new javax.swing.JPanel();
        contEtiqueta4 = new javax.swing.JPanel();
        etqTitulo4 = new javax.swing.JLabel();
        contFormulario = new javax.swing.JPanel();
        etqCedula = new javax.swing.JLabel();
        campoCedula = new java.awt.TextField();
        etqNombres = new javax.swing.JLabel();
        campoNombres = new java.awt.TextField();
        etqApellidos = new javax.swing.JLabel();
        campoApellidos = new java.awt.TextField();
        etqTelefono = new javax.swing.JLabel();
        campoTelefono = new java.awt.TextField();
        etqDireccion = new javax.swing.JLabel();
        campoDireccion = new java.awt.TextField();
        etqEmail = new javax.swing.JLabel();
        campoEmail = new java.awt.TextField();
        btnCancelar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        contSecundario.setBackground(new java.awt.Color(255, 255, 255));

        contEtiqueta4.setBackground(new java.awt.Color(0, 51, 255));

        etqTitulo4.setBackground(new java.awt.Color(0, 51, 255));
        etqTitulo4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqTitulo4.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo4.setText("EDITAR PERSONA");

        javax.swing.GroupLayout contEtiqueta4Layout = new javax.swing.GroupLayout(contEtiqueta4);
        contEtiqueta4.setLayout(contEtiqueta4Layout);
        contEtiqueta4Layout.setHorizontalGroup(
            contEtiqueta4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contEtiqueta4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        contEtiqueta4Layout.setVerticalGroup(
            contEtiqueta4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contEtiqueta4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo4, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addContainerGap())
        );

        contFormulario.setBackground(new java.awt.Color(102, 204, 255));

        etqCedula.setBackground(new java.awt.Color(204, 255, 0));
        etqCedula.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqCedula.setForeground(new java.awt.Color(0, 0, 0));
        etqCedula.setText("Cedula:");

        etqNombres.setBackground(new java.awt.Color(204, 255, 0));
        etqNombres.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqNombres.setForeground(new java.awt.Color(0, 0, 0));
        etqNombres.setText("Nombres:");

        etqApellidos.setBackground(new java.awt.Color(204, 255, 0));
        etqApellidos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqApellidos.setForeground(new java.awt.Color(0, 0, 0));
        etqApellidos.setText("Apellidos:");

        etqTelefono.setBackground(new java.awt.Color(204, 255, 0));
        etqTelefono.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqTelefono.setForeground(new java.awt.Color(0, 0, 0));
        etqTelefono.setText("Telefono:");

        etqDireccion.setBackground(new java.awt.Color(204, 255, 0));
        etqDireccion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqDireccion.setForeground(new java.awt.Color(0, 0, 0));
        etqDireccion.setText("Direccion:");

        etqEmail.setBackground(new java.awt.Color(204, 255, 0));
        etqEmail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqEmail.setForeground(new java.awt.Color(0, 0, 0));
        etqEmail.setText("Email:");

        btnCancelar.setBackground(new java.awt.Color(255, 51, 0));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(51, 204, 0));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("EDITAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contFormularioLayout = new javax.swing.GroupLayout(contFormulario);
        contFormulario.setLayout(contFormularioLayout);
        contFormularioLayout.setHorizontalGroup(
            contFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contFormularioLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(contFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etqTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(etqCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(contFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contFormularioLayout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(contFormularioLayout.createSequentialGroup()
                        .addGroup(contFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(campoCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(80, 80, 80)
                        .addGroup(contFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etqNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(contFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(campoDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(contFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etqApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                        .addGroup(contFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(contFormularioLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contFormularioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(102, 102, 102))))
        );
        contFormularioLayout.setVerticalGroup(
            contFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contFormularioLayout.createSequentialGroup()
                .addGroup(contFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etqDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contFormularioLayout.createSequentialGroup()
                        .addGroup(contFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contFormularioLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contFormularioLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(contFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etqApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etqCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etqNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(contFormularioLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(contFormularioLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(contFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contFormularioLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contFormularioLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(etqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contFormularioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contFormularioLayout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(etqEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(contFormularioLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(contFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(94, 94, 94))
        );

        javax.swing.GroupLayout contSecundarioLayout = new javax.swing.GroupLayout(contSecundario);
        contSecundario.setLayout(contSecundarioLayout);
        contSecundarioLayout.setHorizontalGroup(
            contSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contEtiqueta4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contFormulario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contSecundarioLayout.setVerticalGroup(
            contSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contSecundarioLayout.createSequentialGroup()
                .addComponent(contEtiqueta4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contPrincipalLayout = new javax.swing.GroupLayout(contPrincipal);
        contPrincipal.setLayout(contPrincipalLayout);
        contPrincipalLayout.setHorizontalGroup(
            contPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contSecundario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contPrincipalLayout.setVerticalGroup(
            contPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contSecundario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private java.awt.TextField campoApellidos;
    private java.awt.TextField campoCedula;
    private java.awt.TextField campoDireccion;
    private java.awt.TextField campoEmail;
    private java.awt.TextField campoNombres;
    private java.awt.TextField campoTelefono;
    private javax.swing.JPanel contEtiqueta4;
    private javax.swing.JPanel contFormulario;
    private javax.swing.JPanel contPrincipal;
    private javax.swing.JPanel contSecundario;
    private javax.swing.JLabel etqApellidos;
    private javax.swing.JLabel etqCedula;
    private javax.swing.JLabel etqDireccion;
    private javax.swing.JLabel etqEmail;
    private javax.swing.JLabel etqNombres;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JLabel etqTitulo4;
    // End of variables declaration//GEN-END:variables
}
