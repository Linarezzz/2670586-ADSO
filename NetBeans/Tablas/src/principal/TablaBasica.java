
package principal;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author INSTRUCTOR
 */
public class TablaBasica extends javax.swing.JFrame {

    DefaultTableModel modelo;
    Persona listaPersonas[];
    
    public TablaBasica() {
        listaPersonas = new Persona[100];
        listaPersonas[0] = new Persona("19493","Susana","Eguis","481283","susi@eguis.com");
        listaPersonas[1] = new Persona("582848","Sebastian","Valencia","3295827","sebas@valencia.com");
        listaPersonas[2] = new Persona("1089599163","Juan","Linares","3206897147","juanpa@linares.com");
        listaPersonas[3] = new Persona("69291","Laura","Grajales","3959281","laura@grajales.com");
        listaPersonas[4] = new Persona("4919592","Camila","Velazques","311268376","camila@velazques.com");
                
        initComponents();
        initAlterncomponents();
        imprimirPersonas();
    }
    
    public void initAlterncomponents(){
        setLocationRelativeTo(null);
        setTitle("Tabla Basica");
        setVisible(true);
        
        modelo = (DefaultTableModel) tablaDatos.getModel();   //Extraer modelo de toda la tabla 
        
        // AQUI SE PUEDE CAMBIAR LOS ESTILOS DE LA TABLA
    }
    
    public void imprimirPersonas(){
        
        modelo.setRowCount(0);   // Limpia la tabla 
        for (int i = 0; listaPersonas[i]!=null; i++) {
            String documento = listaPersonas[i].getDocumento();
            String nombres = listaPersonas[i].getNombres();
            String apellidos = listaPersonas[i].getApellidos();
            String telefono = listaPersonas[i].getTelefono();
            String correo = listaPersonas[i].getCorreo();
            
            Object dato[] = new Object[]{documento,nombres,apellidos,telefono,correo};
            modelo.addRow(dato);
                 
            
        }
    }
    
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorTitulo = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        contenedorFormulario = new javax.swing.JPanel();
        etq_documento = new javax.swing.JLabel();
        campoDocumento = new javax.swing.JTextField();
        etq_nombres = new javax.swing.JLabel();
        campoNombres = new javax.swing.JTextField();
        etq_apellidos = new javax.swing.JLabel();
        campoApellidos = new javax.swing.JTextField();
        etq_telefono = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        etq_correo = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        contenedorDatos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedorTitulo.setBackground(new java.awt.Color(0, 0, 204));

        etq_titulo.setBackground(new java.awt.Color(255, 255, 255));
        etq_titulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(255, 255, 255));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Tabla Basica");

        javax.swing.GroupLayout contenedorTituloLayout = new javax.swing.GroupLayout(contenedorTitulo);
        contenedorTitulo.setLayout(contenedorTituloLayout);
        contenedorTituloLayout.setHorizontalGroup(
            contenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        contenedorTituloLayout.setVerticalGroup(
            contenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        contenedorFormulario.setBackground(new java.awt.Color(0, 204, 255));

        etq_documento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etq_documento.setForeground(new java.awt.Color(0, 0, 0));
        etq_documento.setText("Documento:");

        campoDocumento.setBackground(new java.awt.Color(255, 255, 255));

        etq_nombres.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etq_nombres.setForeground(new java.awt.Color(0, 0, 0));
        etq_nombres.setText("Nombres:");

        campoNombres.setBackground(new java.awt.Color(255, 255, 255));

        etq_apellidos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etq_apellidos.setForeground(new java.awt.Color(0, 0, 0));
        etq_apellidos.setText("Apellidos:");

        campoApellidos.setBackground(new java.awt.Color(255, 255, 255));

        etq_telefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etq_telefono.setForeground(new java.awt.Color(0, 0, 0));
        etq_telefono.setText("Telefono:");

        campoTelefono.setBackground(new java.awt.Color(255, 255, 255));

        etq_correo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etq_correo.setForeground(new java.awt.Color(0, 0, 0));
        etq_correo.setText("Correo Elec..:");

        campoCorreo.setBackground(new java.awt.Color(255, 255, 255));

        btn_agregar.setBackground(new java.awt.Color(51, 204, 0));
        btn_agregar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar.setText("AGREGAR");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorFormularioLayout = new javax.swing.GroupLayout(contenedorFormulario);
        contenedorFormulario.setLayout(contenedorFormularioLayout);
        contenedorFormularioLayout.setHorizontalGroup(
            contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etq_documento, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(campoTelefono))
                .addGap(18, 18, 18)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etq_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(campoCorreo))
                .addGap(18, 18, 18)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(etq_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                    .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
        );
        contenedorFormularioLayout.setVerticalGroup(
            contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                        .addComponent(etq_documento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                        .addComponent(etq_apellidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                        .addComponent(etq_nombres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                        .addComponent(etq_correo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_agregar)))
                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                        .addComponent(etq_telefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        contenedorDatos.setBackground(new java.awt.Color(51, 255, 255));

        tablaDatos.setBackground(new java.awt.Color(255, 255, 255));
        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documento", "Nombres", "Apellidos", "Telefono", "Correo Elec"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaDatos);

        javax.swing.GroupLayout contenedorDatosLayout = new javax.swing.GroupLayout(contenedorDatos);
        contenedorDatos.setLayout(contenedorDatosLayout);
        contenedorDatosLayout.setHorizontalGroup(
            contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        contenedorDatosLayout.setVerticalGroup(
            contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedorFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedorDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenedorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        String documento = campoDocumento.getText();
        String nombres = campoNombres.getText();
        String apellidos = campoApellidos.getText();
        String telefono = campoTelefono.getText();
        String correo = campoCorreo.getText();
        
        if(documento.equals("") || nombres.equals("") || apellidos.equals("") || telefono.equals("") || correo.equals("")){ // Que ninguno de los campos este vacio con ! antes del campo
            Alerta ventana = new Alerta();
        }else{
            
            //Buscar posicion vacia
            int posicion = -1;
            for(int i = 0; i <listaPersonas.length;i++){
                if(listaPersonas[i]==null){
                    posicion = i;
                    break;
                }
            }
            
            // Crear objeto en posicion vacia
            if(posicion!=-1){
                
                listaPersonas[posicion] = new Persona( documento,nombres,apellidos,telefono,correo );
                
                Object data[] = new Object[]{ documento,nombres,apellidos,telefono,correo };   //Objeto tipo data con arreglo para guardar las variables
                modelo.addRow(data);

                campoDocumento.setText("");
                campoNombres.setText("");
                campoApellidos.setText("");
                campoTelefono.setText("");
                campoCorreo.setText("");

                campoDocumento.requestFocus();
            }
      
        }
    }//GEN-LAST:event_btn_agregarActionPerformed


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoDocumento;
    private javax.swing.JTextField campoNombres;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JPanel contenedorDatos;
    private javax.swing.JPanel contenedorFormulario;
    private javax.swing.JPanel contenedorTitulo;
    private javax.swing.JLabel etq_apellidos;
    private javax.swing.JLabel etq_correo;
    private javax.swing.JLabel etq_documento;
    private javax.swing.JLabel etq_nombres;
    private javax.swing.JLabel etq_telefono;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables
}
