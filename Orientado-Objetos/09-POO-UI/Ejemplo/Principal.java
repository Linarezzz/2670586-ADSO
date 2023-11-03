import javax.swing.*; // Swing
import java.awt.*; // Carpetas
import java.awt.event.*; // Eventos

public class Principal{
    public static void main (String[] args){

        // Dimension tamanio = new Dimension(600,500);   Se puede almacenar en una variable
        JFrame ventana_01 = new JFrame();  // Crear ventana

        ventana_01.setTitle("Primer ventana"); // Poner titulo a ventana
        ventana_01.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Cierra la aplicacion
        ventana_01.setSize(500,500);    // Recibe dos numeros enteros, ancho, alto
        ventana_01.setResizable(true); // La ventana ya no puede expandirse
        ventana_01.setLocation(500,100);  // Cambia la locacion de la ventana en la pantalla, en x,y
        ventana_01.setLocationRelativeTo(null);  // Sobre escribe la posicion de la ventana. null para intentarlo ubicar en la mitad
        ventana_01.setVisible(true); // Establecer la ventana para ser visible, y se pone al final

        JPanel contenedor = new JPanel(); // crear contenedor
        contenedor.setBackground(Color.WHITE); // Agregar color, se puede usar rgb, (new Color(0,0,0))
        contenedor.setVisible(true);


        JLabel etiqueta_titulo = new JLabel();  // Crear etiqueta
        etiqueta_titulo.setText("Titulo"); // Crear texto
        etiqueta_titulo.setFont(new Font("Snap ITC", Font. BOLD, 50));  // Cambiar tipo de fuente, font, bold y luego su tamaño
        etiqueta_titulo.setForeground(Color.black); // Cambiar color del texto
        etiqueta_titulo.setBackground(Color.green); // Cambiar el color del fondo
        etiqueta_titulo.setOpaque(true); // Por defecto no se ve, hay que configurarlo en true



        JLabel etiqueta_cedula = new JLabel();  // Crear etiqueta
        etiqueta_cedula.setText("Cedula:"); // Crear texto
        etiqueta_cedula.setFont(new Font("Arial", Font. PLAIN, 20));  // Cambiar tipo de fuente, font, bold y luego su tamaño

        JLabel etiqueta_nombre = new JLabel();  // Crear etiqueta
        etiqueta_nombre.setText("Nombre:"); // Crear texto
        etiqueta_nombre.setFont(new Font("Arial", Font. PLAIN, 20));  // Cambiar tipo de fuente, font, bold y luego su tamaño

        JLabel etiqueta_apellido = new JLabel();  // Crear etiqueta
        etiqueta_apellido.setText("Apellido:"); // Crear texto
        etiqueta_apellido.setFont(new Font("Arial", Font. PLAIN, 20));  // Cambiar tipo de fuente, font, bold y luego su tamaño


        JTextField campo_cedula = new JTextField(); // Crear campo de texto
        campo_cedula.setColumns(10); // Crear columnas

        JTextField campo_nombre = new JTextField(); // Crear campo de texto
        campo_nombre.setColumns(10); // Crear columnas

        JTextField campo_apellido = new JTextField(); // Crear campo de texto
        campo_apellido.setColumns(10); // Crear columnas

        JButton boton_enviar = new JButton();
        boton_enviar.setText("ENVIAR");

        JButton boton_cancelar = new JButton();
        boton_cancelar.setText("CANCELAR");

        contenedor.add(etiqueta_titulo);
        contenedor.add(etiqueta_cedula); // Agregar la etiqueta al contenedor
        contenedor.add(campo_cedula);
        

        contenedor.add(etiqueta_nombre);
        contenedor.add(campo_nombre);

        contenedor.add(etiqueta_apellido);
        contenedor.add(campo_apellido);

        contenedor.add(boton_enviar);
        contenedor.add(boton_cancelar);

        ventana_01.add(contenedor); // Agregar el contenedor a la entana
        ventana_01.revalidate(); // Fuerza la renderizacion
        ventana_01.pack(); // Organiza los elementos segun su tamaño

        //Eventos
        ActionListener evento_ingresar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\n\nSe ha dado click en el boton ingresar");
                String texto_nombre = campo_nombre.getText();
                System.out.println("--> Nombre: "+texto_nombre);
            }
        };  // Para el boton ingresar

        ActionListener evento_cancelar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se ha dado click en cancelar");
            }
        };  // Para cancelar 

        boton_enviar.addActionListener(evento_ingresar);
        boton_cancelar.addActionListener(evento_cancelar);


        // ventana_01.repaint();
        // ventana_01.revalidate();
        // ventana_01.pack(); // Forzar renderizado, ajusta la ventana al tamaño de los elementos
    }
}