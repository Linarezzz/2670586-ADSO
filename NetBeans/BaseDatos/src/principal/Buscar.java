
package principal;


import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import utils.ButtonEditor;
import utils.ButtonRenderer;


public class Buscar extends javax.swing.JFrame {
    
    DefaultTableModel modelo;
    Connection conexion;    // Objeto de conexion.
    Statement manipularDB;  
   
    public Buscar() {
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
	    conexion = DriverManager.getConnection(url, user, password);
	    manipularDB = conexion.createStatement();
	} catch (SQLException ex) {
	    conexion = null;
	    manipularDB = null;
	}
    }
    
    public void initAlternComponents(){
        setVisible(true);
        setTitle("Menu buscar persona");
        setLocationRelativeTo(null);
        setResizable(false);
        
        Image icono_buscar = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/buscar_usuario.png"));
        icono_buscar = icono_buscar.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        setIconImage(icono_buscar);
        
        modelo = (DefaultTableModel) tablaDatos.getModel();
        
        tablaDatos.getColumnModel().getColumn(5).setCellEditor(new ButtonEditor(new JCheckBox()));
        tablaDatos.getColumnModel().getColumn(5).setCellRenderer(new ButtonRenderer());
                
        // Tamaño de Columnas
        tablaDatos.getColumnModel().getColumn(0).setPreferredWidth(50);
        tablaDatos.getColumnModel().getColumn(1).setPreferredWidth(150);
        tablaDatos.getColumnModel().getColumn(2).setPreferredWidth(150);
        tablaDatos.getColumnModel().getColumn(3).setPreferredWidth(50);
        tablaDatos.getColumnModel().getColumn(4).setPreferredWidth(150);
        tablaDatos.getColumnModel().getColumn(5).setPreferredWidth(10);
        
        // Ajuste del Orden y Ancho de Columnas
        tablaDatos.getTableHeader().setReorderingAllowed(false);
        tablaDatos.getTableHeader().setResizingAllowed(false);
        
        // Centrar contenido de columnas
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        tablaDatos.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        tablaDatos.getColumnModel().getColumn(3).setCellRenderer(centerRender);
        
        // Alto de las filas
        tablaDatos.setRowHeight(25);
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contPrincipal = new javax.swing.JPanel();
        contEtiqueta = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        contInformacion = new javax.swing.JPanel();
        etqCedula = new javax.swing.JLabel();
        campoCedula = new java.awt.TextField();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        contDatos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        contPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        contEtiqueta.setBackground(new java.awt.Color(0, 51, 153));

        etqTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("BUSCAR PERSONA");

        javax.swing.GroupLayout contEtiquetaLayout = new javax.swing.GroupLayout(contEtiqueta);
        contEtiqueta.setLayout(contEtiquetaLayout);
        contEtiquetaLayout.setHorizontalGroup(
            contEtiquetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contEtiquetaLayout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(281, Short.MAX_VALUE))
        );
        contEtiquetaLayout.setVerticalGroup(
            contEtiquetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contEtiquetaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(etqTitulo)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        contInformacion.setBackground(new java.awt.Color(153, 204, 255));

        etqCedula.setBackground(new java.awt.Color(0, 0, 0));
        etqCedula.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqCedula.setForeground(new java.awt.Color(0, 0, 0));
        etqCedula.setText("Cedula:");

        btnBuscar.setBackground(new java.awt.Color(51, 204, 0));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 0, 0));

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombres", "Apellidos", "Telefono", "Direccion", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaDatos);

        javax.swing.GroupLayout contDatosLayout = new javax.swing.GroupLayout(contDatos);
        contDatos.setLayout(contDatosLayout);
        contDatosLayout.setHorizontalGroup(
            contDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        contDatosLayout.setVerticalGroup(
            contDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout contInformacionLayout = new javax.swing.GroupLayout(contInformacion);
        contInformacion.setLayout(contInformacionLayout);
        contInformacionLayout.setHorizontalGroup(
            contInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contInformacionLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(etqCedula)
                .addGap(36, 36, 36)
                .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btnBuscar)
                .addGap(48, 48, 48)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        contInformacionLayout.setVerticalGroup(
            contInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contInformacionLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(contInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar)
                        .addComponent(btnCancelar))
                    .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqCedula))
                .addGap(78, 78, 78)
                .addComponent(contDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contPrincipalLayout = new javax.swing.GroupLayout(contPrincipal);
        contPrincipal.setLayout(contPrincipalLayout);
        contPrincipalLayout.setHorizontalGroup(
            contPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contEtiqueta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contPrincipalLayout.setVerticalGroup(
            contPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contPrincipalLayout.createSequentialGroup()
                .addComponent(contEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(contPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private java.awt.TextField campoCedula;
    private javax.swing.JPanel contDatos;
    private javax.swing.JPanel contEtiqueta;
    private javax.swing.JPanel contInformacion;
    private javax.swing.JPanel contPrincipal;
    private javax.swing.JLabel etqCedula;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables
}
