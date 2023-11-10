import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Factura extends JFrame {

    public Factura(){
        initComponents();
    }

    public void initComponents(){
        setTitle("FACTURA");
        setIconImage(getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_factura.png") )); // Imagen de la ventana
        setSize(770,970);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JPanel contenedor = new JPanel();
        contenedor.setBackground(new Color(235,235,236));
        contenedor.setLayout(new GridBagLayout());

        GridBagConstraints restricciones = new GridBagConstraints();   // Layout

        // Restricciones para la etiqueta "DATOS CLIENTE:"
        JLabel etq_cliente = new JLabel();
        etq_cliente.setText("DATOS CLIENTE:");
        etq_cliente.setFont(new Font("Arial", Font.BOLD, 20));
        etq_cliente.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;  // Columna
        restricciones.gridy = 0;  // Fila
        restricciones.gridwidth = 1;  // Ocupa x columnas
        restricciones.gridheight = 1; // Ocupa x filas
        restricciones.weightx = 0.1;  // Peso para la distribución
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.anchor = GridBagConstraints.WEST;  // Alineación a la izquierda
        contenedor.add(etq_cliente, restricciones);


        JLabel etq_cedula_cliente = new JLabel();
        etq_cedula_cliente.setText("CEDULA:");
        etq_cedula_cliente.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_cedula_cliente,restricciones);

        JTextField campo_cedula_cliente = new JTextField();
        campo_cedula_cliente.setColumns(10);
        restricciones.gridx = 1;  // Columna
        restricciones.gridy = 1;  // Fila
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;
        //restricciones.insets = new Insets(0,5,0,0);   // Margen dentro de la celda
        contenedor.add(campo_cedula_cliente,restricciones);
        //restricciones.insets = new Insets(0,0,0,0);

        JButton btn_buscar_cedula_cliente = new JButton();
        btn_buscar_cedula_cliente.setText("BUSCAR");
        restricciones.gridx = 3; // Columna
        restricciones.gridy = 1;  // Fila
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;  // Configura el tamaño del boton
        contenedor.add(btn_buscar_cedula_cliente,restricciones);

        JLabel etq_nombre_cliente = new JLabel();
        etq_nombre_cliente.setText("NOMBRES:");
        etq_nombre_cliente.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 2;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;
        contenedor.add(etq_nombre_cliente,restricciones);

        JLabel etq_direccion_cliente = new JLabel();
        etq_direccion_cliente.setText("DIRECCION:");
        etq_direccion_cliente.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 3;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;
        contenedor.add(etq_direccion_cliente,restricciones);

        JLabel etq_vendedor = new JLabel();
        etq_vendedor.setText("DATOS VENDEDOR:");
        etq_vendedor.setFont(new Font("Arial",Font.BOLD, 20));
        etq_vendedor.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 4;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;
        contenedor.add(etq_vendedor,restricciones);

        JLabel etq_cedula_vendedor = new JLabel();
        etq_cedula_vendedor.setText("CEDULA:");
        etq_cedula_vendedor.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 5;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;
        contenedor.add(etq_cedula_vendedor,restricciones);

        JTextField campo_cedula_vendedor = new JTextField();
        campo_cedula_vendedor.setColumns(10);
        restricciones.gridx = 1;  // Columna
        restricciones.gridy = 5;  // Fila
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;
        //restricciones.insets = new Insets(0,5,0,0);   // Margen dentro de la celda
        contenedor.add(campo_cedula_vendedor,restricciones);
        //restricciones.insets = new Insets(0,0,0,0);

        JButton btn_buscar_cedula_vendedor = new JButton();
        btn_buscar_cedula_vendedor.setText("BUSCAR");
        restricciones.gridx = 3; // Columna
        restricciones.gridy = 5;  // Fila
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;  // Configura el tamaño del boton
        contenedor.add(btn_buscar_cedula_vendedor,restricciones);

        JLabel etq_nombre_vendedor = new JLabel();
        etq_nombre_vendedor.setText("NOMBRES:");
        etq_nombre_vendedor.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 6;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;
        contenedor.add(etq_nombre_vendedor,restricciones);

        JLabel etq_lista_productos = new JLabel();
        etq_lista_productos.setText("LISTA PRODUCTOS FACTURADOS:");
        etq_lista_productos.setFont(new Font("Arial",Font.BOLD, 20));
        etq_lista_productos.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 7;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;
        contenedor.add(etq_lista_productos,restricciones);

        JLabel etq_id_producto = new JLabel();
        etq_id_producto.setText("ID");
        etq_id_producto.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 0;
        restricciones.gridy = 8;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_id_producto,restricciones);

        JLabel etq_nombre_producto = new JLabel();
        etq_nombre_producto.setText("NOMBRE");
        etq_nombre_producto.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 1; // Columna
        restricciones.gridy = 8; // Fila
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_nombre_producto,restricciones);

        JLabel etq_cant_producto = new JLabel();
        etq_cant_producto.setText("CANT.");
        etq_cant_producto.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 2; // Columna
        restricciones.gridy = 8; // Fila
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_cant_producto,restricciones);

        JButton btn_add_producto = new JButton();
        btn_add_producto.setText("ADD");
        restricciones.gridx = 3; // Columna
        restricciones.gridy = 9;  // Fila
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;  // Configura el tamaño del boton
        contenedor.add(btn_add_producto,restricciones);

        JLabel etq_lista = new JLabel();
        etq_lista.setHorizontalAlignment(JLabel.CENTER);
        JScrollPane scroll = new JScrollPane(etq_lista);    // Crear scroll, para bajar 
        restricciones.gridx = 0;
        restricciones.gridy = 10;
        restricciones.gridwidth = 3;
        restricciones.gridheight = 1;
        restricciones.weightx = 10;
        restricciones.weighty = 10;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(scroll,restricciones);

        



        add(contenedor);
        setVisible(true);
        revalidate();
    }
}