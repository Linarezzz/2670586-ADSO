package principal;

import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Crear extends javax.swing.JFrame {
    
    Connection conexion;
    Statement manipularDB;
    
    public Crear() {
        initComponents();
        initAlternComponents();
        BaseDatos();
    }
    
    public void BaseDatos(){
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
    
    public void initAlternComponents(){
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("Menu crear persona");
        setResizable(false);
        
        Image icono_crear = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/crear_usuario.png"));
        icono_crear = icono_crear.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        setIconImage(icono_crear);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenPrincipal = new javax.swing.JPanel();
        contEtiqueta = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
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

        contenPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        contEtiqueta.setBackground(new java.awt.Color(51, 204, 0));

        etqTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("CREAR PERSONA");

        javax.swing.GroupLayout contEtiquetaLayout = new javax.swing.GroupLayout(contEtiqueta);
        contEtiqueta.setLayout(contEtiquetaLayout);
        contEtiquetaLayout.setHorizontalGroup(
            contEtiquetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contEtiquetaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        contEtiquetaLayout.setVerticalGroup(
            contEtiquetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contEtiquetaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addContainerGap())
        );

        contFormulario.setBackground(new java.awt.Color(204, 255, 204));

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
        btnAgregar.setText("AGREGAR");
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

        javax.swing.GroupLayout contenPrincipalLayout = new javax.swing.GroupLayout(contenPrincipal);
        contenPrincipal.setLayout(contenPrincipalLayout);
        contenPrincipalLayout.setHorizontalGroup(
            contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contEtiqueta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contFormulario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contenPrincipalLayout.setVerticalGroup(
            contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenPrincipalLayout.createSequentialGroup()
                .addComponent(contEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        boolean respuesta = false;
        try {
            String cedula = campoCedula.getText();
            String nombres = campoNombres.getText();
            String apellidos = campoApellidos.getText();
            String direccion = campoDireccion.getText();
            String telefono = campoTelefono.getText();
            String email = campoEmail.getText();

            // Verificar campos vacíos
            if (cedula.equals("") || nombres.equals("") || apellidos.equals("") || direccion.equals("") || telefono.equals("") || email.equals("")) {
                Alerta advertencia = new Alerta("Todos los campos son obligatorios.");
                return; 
            }

            String consulta = "INSERT INTO personas (cedula, nombres, apellidos, direccion, telefono, email) VALUES ('"+cedula+"','"+nombres+"','"+apellidos+"','"+direccion+"','"+telefono+"','"+email+"')";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta == 1) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("--> Error Insert: " + e.getMessage());
        }

            if (respuesta) {
                System.out.println("Insertado con éxito");
               Completado exito = new Completado("La persona ha sido añadida");
        
                campoCedula.setText("");
                campoNombres.setText("");
                campoApellidos.setText("");
                campoDireccion.setText("");
                campoTelefono.setText("");
                campoEmail.setText("");
            } else {
                System.out.println("No se pudo insertar");
            }
    }//GEN-LAST:event_btnAgregarActionPerformed

    

     
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private java.awt.TextField campoApellidos;
    private java.awt.TextField campoCedula;
    private java.awt.TextField campoDireccion;
    private java.awt.TextField campoEmail;
    private java.awt.TextField campoNombres;
    private java.awt.TextField campoTelefono;
    private javax.swing.JPanel contEtiqueta;
    private javax.swing.JPanel contFormulario;
    private javax.swing.JPanel contenPrincipal;
    private javax.swing.JLabel etqApellidos;
    private javax.swing.JLabel etqCedula;
    private javax.swing.JLabel etqDireccion;
    private javax.swing.JLabel etqEmail;
    private javax.swing.JLabel etqNombres;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JLabel etqTitulo;
    // End of variables declaration//GEN-END:variables
}
