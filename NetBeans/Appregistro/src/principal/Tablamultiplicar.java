
package principal;

public class Tablamultiplicar extends javax.swing.JFrame {

    
    public Tablamultiplicar() {
        initComponents();
        initAlternComponent();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor_1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        formulario = new javax.swing.JPanel();
        etq_tabla = new javax.swing.JLabel();
        campo_tabla = new javax.swing.JTextField();
        etq_multiplos = new javax.swing.JLabel();
        campo_multiplos = new javax.swing.JTextField();
        btn_crear = new javax.swing.JButton();
        contenedor_resultado = new javax.swing.JPanel();
        etq_resultado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedor_1.setBackground(new java.awt.Color(0, 153, 153));
        contenedor_1.setForeground(new java.awt.Color(255, 255, 255));
        contenedor_1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TABLA DE MULTIPLICAR");

        javax.swing.GroupLayout contenedor_1Layout = new javax.swing.GroupLayout(contenedor_1);
        contenedor_1.setLayout(contenedor_1Layout);
        contenedor_1Layout.setHorizontalGroup(
            contenedor_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        contenedor_1Layout.setVerticalGroup(
            contenedor_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );

        formulario.setBackground(new java.awt.Color(51, 255, 255));

        etq_tabla.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etq_tabla.setForeground(new java.awt.Color(0, 0, 0));
        etq_tabla.setText("Tabla:");

        campo_tabla.setBackground(new java.awt.Color(255, 255, 255));

        etq_multiplos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etq_multiplos.setForeground(new java.awt.Color(0, 0, 0));
        etq_multiplos.setText("Multiplos:");

        campo_multiplos.setBackground(new java.awt.Color(255, 255, 255));

        btn_crear.setBackground(new java.awt.Color(0, 51, 204));
        btn_crear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_crear.setForeground(new java.awt.Color(255, 255, 255));
        btn_crear.setText("CREAR");
        btn_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formularioLayout = new javax.swing.GroupLayout(formulario);
        formulario.setLayout(formularioLayout);
        formularioLayout.setHorizontalGroup(
            formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(etq_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campo_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(etq_multiplos, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campo_multiplos, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(btn_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        formularioLayout.setVerticalGroup(
            formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_multiplos)
                    .addComponent(campo_multiplos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        etq_resultado.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etq_resultado.setForeground(new java.awt.Color(0, 0, 0));
        etq_resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_resultado.setText("-----");

        javax.swing.GroupLayout contenedor_resultadoLayout = new javax.swing.GroupLayout(contenedor_resultado);
        contenedor_resultado.setLayout(contenedor_resultadoLayout);
        contenedor_resultadoLayout.setHorizontalGroup(
            contenedor_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_resultadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etq_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        contenedor_resultadoLayout.setVerticalGroup(
            contenedor_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_resultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(contenedor_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addComponent(contenedor_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(formulario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedor_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(formulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contenedor_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearActionPerformed
        int numero = Integer.valueOf(campo_tabla.getText());
        int multiplos = Integer.valueOf(campo_multiplos.getText());

        campo_tabla.setText("");
        campo_multiplos.setText("");

        StringBuilder html = new StringBuilder("<html>");

        for (int i = 1; i <= multiplos; i++) {
            int resultado = numero * i;
            html.append(numero).append("x").append(i).append(" = ").append(resultado).append("<br>");
        }

        html.append("</html>");
        etq_resultado.setText(html.toString());
    }//GEN-LAST:event_btn_crearActionPerformed
    
    public void initAlternComponent(){
        setVisible(true);
        setLocationRelativeTo(null);
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_crear;
    private javax.swing.JTextField campo_multiplos;
    private javax.swing.JTextField campo_tabla;
    private javax.swing.JPanel contenedor_1;
    private javax.swing.JPanel contenedor_resultado;
    private javax.swing.JLabel etq_multiplos;
    private javax.swing.JLabel etq_resultado;
    private javax.swing.JLabel etq_tabla;
    private javax.swing.JPanel formulario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
