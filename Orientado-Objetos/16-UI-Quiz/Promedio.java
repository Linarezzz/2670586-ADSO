import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.border.*;

public class Promedio extends JFrame {

    // Atributos
    private Materia listaMaterias[];
    private JPanel contenedorItems;
    private JLabel listaJLabels [];
    private int indiceItems;
    private JTextField input_materia; 
    private JTextField input_nota; 
    private JTextField input_creditos; 
    private JLabel etq_total;
    
    
    //Constructor
    public Promedio(Materia [] listaMaterias){
        this.listaMaterias = listaMaterias;
        this.listaJLabels = new JLabel [50];
        this.listaMaterias = new Materia [50];
        initComponent();
    }

    public void initComponent(){

        this.listaJLabels = new JLabel[50];

        setTitle("Promedio Ponderado");
        setSize(600,600);
        setDefaultCloseOperation( EXIT_ON_CLOSE );
		setLocationRelativeTo(null);

        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_promedio.png") ) );

        JPanel contPrincipal = new JPanel();
        contPrincipal.setBackground(Color.WHITE);
        contPrincipal.setLayout(new GridBagLayout());
		contPrincipal.setBorder( BorderFactory.createEmptyBorder(20, 20, 20, 10) );
		GridBagConstraints restriccion = new GridBagConstraints();

        JLabel etq_calcular_promedio = new JLabel("CALCULAR PROMEDIO");
        etq_calcular_promedio.setFont( new Font("Arial", Font.BOLD, 35) );
        etq_calcular_promedio.setForeground(Color.BLACK);
        restriccion.gridx = 1;   // Columna
		restriccion.gridy = 0;   // Fila
		restriccion.gridheight = 1;
		restriccion.gridwidth = 5;
		restriccion.weightx = 100;
		restriccion.weighty = 1;
		restriccion.fill = GridBagConstraints.NONE;
		contPrincipal.add( etq_calcular_promedio, restriccion );

        JLabel etq_materia = new JLabel("Materia:");
        etq_materia.setFont( new Font("Arial", Font.ROMAN_BASELINE, 20) );
        etq_materia.setForeground(Color.BLACK);
        etq_materia.setVerticalAlignment(JLabel.CENTER);
        restriccion.gridx = 0;
        restriccion.gridy = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weightx = 20;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add(etq_materia,restriccion);

        input_materia = new JTextField();
        input_materia.setColumns(5);
        //input_materia.setBorder( BorderFactory.createEmptyBorder(1, 1, 1, 1) );
		restriccion.gridx = 1;
		restriccion.gridy = 1;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weightx = 30;
		restriccion.weighty = 1;
        restriccion.insets = new Insets(0,0,0,0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_materia, restriccion );

        JLabel etq_creditos = new JLabel("Creditos:");
        etq_creditos.setFont( new Font("Arial", Font.ROMAN_BASELINE, 20));
        etq_creditos.setForeground(Color.BLACK);
        etq_creditos.setVerticalAlignment(JLabel.CENTER);
        restriccion.gridx = 2;
        restriccion.gridy = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weightx = 20;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add(etq_creditos,restriccion);

        input_creditos = new JTextField();
        input_creditos.setHorizontalAlignment(JTextField.CENTER);
		restriccion.gridx = 3;
		restriccion.gridy = 1;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weightx = 30;
		restriccion.weighty = 1;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_creditos, restriccion );

        JLabel etq_nota = new JLabel("Nota:");
        etq_nota.setFont( new Font("Arial", Font.ROMAN_BASELINE, 20));
        etq_nota.setForeground(Color.BLACK);
        etq_nota.setVerticalAlignment(JLabel.CENTER);
        restriccion.gridx = 0;
        restriccion.gridy = 2;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weightx = 20;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add(etq_nota,restriccion);

        input_nota = new JTextField();
		restriccion.gridx = 1;
		restriccion.gridy = 2;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weightx = 30;
		restriccion.weighty = 1;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_nota, restriccion );

        JButton btn_registrar = new JButton("REGISTRAR");
        btn_registrar.setFont( new Font("Arial", Font.ROMAN_BASELINE, 18));
        btn_registrar.setFocusable(false);
        btn_registrar.setBackground(Color.BLUE);
        btn_registrar.setForeground(Color.WHITE);
		restriccion.gridx = 2;
		restriccion.gridy = 2;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 2;
		restriccion.weighty = 1;
		restriccion.weightx = 50;
		restriccion.fill = GridBagConstraints.NONE;
		contPrincipal.add( btn_registrar, restriccion );

        JLabel etq_resumen = new JLabel("RESUMEN");
        etq_resumen.setHorizontalAlignment(JLabel.CENTER);
        etq_resumen.setFont( new Font("Arial", Font.BOLD, 20) );
        etq_resumen.setForeground(Color.BLACK);
        restriccion.gridx = 0;   // Columna
		restriccion.gridy = 3;   // Fila
		restriccion.gridheight = 1;
		restriccion.gridwidth = 4;
		restriccion.weightx = 100;
		restriccion.weighty = 1;
        restriccion.insets = new Insets(30,0,0,0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_resumen, restriccion );

        JPanel contenedorItems = new JPanel();
        contenedorItems.setLayout( new GridBagLayout() );
        contenedorItems.setBackground(Color.WHITE);
        JScrollPane scrollPane = new JScrollPane(contenedorItems);
        scrollPane.setBorder(null);
        
        restriccion.gridy = 4;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 90;
        restriccion.weightx = 100;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(10, 1, 1, 10);
        contPrincipal.add( scrollPane, restriccion );
        
        GridBagConstraints constItems = new GridBagConstraints();
        
        Border borderColor = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode("#D5D5D5"));
        Border borderPadding = new EmptyBorder(3,10,3,10);
        Border borderGris = new CompoundBorder(borderColor, borderPadding);
        
        for (int i=0; i<this.listaJLabels.length; i++) {
            JLabel etq_temporal = new JLabel(" ");
            etq_temporal.setHorizontalAlignment( JLabel.RIGHT );
            etq_temporal.setFont( new Font("Arial", Font.PLAIN, 18) );
            etq_temporal.setOpaque(true);
            etq_temporal.setBackground( Color.WHITE );
            etq_temporal.setBorder( borderGris );
            this.listaJLabels[i] = etq_temporal;
            constItems.gridy = i;
            constItems.gridx = 0;
            constItems.gridheight = 1;
            constItems.gridwidth = 1;
            constItems.weighty = 1;
            constItems.weightx = 1;
            constItems.fill = GridBagConstraints.HORIZONTAL;
            constItems.anchor = GridBagConstraints.NORTH;
            constItems.insets = new Insets(0, 0, 0, 0);
            contenedorItems.add(this.listaJLabels[i], constItems);
        }

        etq_total = new JLabel("Total: ---");
        etq_total.setHorizontalAlignment( JLabel.CENTER );
        etq_total.setBackground( Color.WHITE);
        etq_total.setForeground(Color.BLACK);
        etq_total.setFont( new Font("Arial", Font.ROMAN_BASELINE, 25) );
        etq_total.setOpaque(true);
        etq_total.setBorder( BorderFactory.createEmptyBorder(5, 10, 5, 10) );
        restriccion.gridx = 0;
        restriccion.gridy = 5;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weightx = 2;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 10, 0, 0);
        contPrincipal.add( etq_total, restriccion );

        JButton btn_limpiar = new JButton("LIMPIAR");
        btn_limpiar.setFont( new Font("Arial", Font.ROMAN_BASELINE, 18));
        btn_limpiar.setHorizontalAlignment(JButton.CENTER);
        btn_limpiar.setFocusable(false);
        btn_limpiar.setBackground(Color.RED);
        btn_limpiar.setForeground(Color.WHITE);
        restriccion.gridx = 0;
        restriccion.gridy = 6;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weightx = 1;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.NONE;
        contPrincipal.add(btn_limpiar,restriccion);

        add( contPrincipal );
        setResizable(false);
		setVisible(true);
		revalidate();
		repaint();

        //Eventos

        ActionListener evento_click_registrar = new ActionListener(){
			public void actionPerformed(ActionEvent event){
				agregarMateria();
			}
		};
		btn_registrar.addActionListener(evento_click_registrar);

        ActionListener evento_click_limpiar = new ActionListener(){
			public void actionPerformed(ActionEvent event){
				limpiarCampos();
                indiceItems = 0;
			}
		};
		btn_limpiar.addActionListener(evento_click_limpiar);

    }

    //Metodos
    public void limpiarCampos(){
        for (int i = 0; i < listaMaterias.length; i++) {
            input_materia.requestFocus();
            input_materia.setText("");
            input_creditos.setText("");
            input_nota.setText("");
            etq_total.setText("Total: ----");
            listaJLabels[i].setText("");
           
			
		}
    }

    public void agregarMateria(){
        String nombre = input_materia.getText();
        double creditos = Double.parseDouble(input_creditos.getText());
        double nota = Double.parseDouble(input_nota.getText());

        for (int i = indiceItems; i < listaMaterias.length; i++) {
            
			listaMaterias[i] = new Materia(nombre, creditos, nota);
            input_materia.requestFocus();
            input_materia.setText("");
            input_creditos.setText("");
            input_nota.setText("");
            listaJLabels[i].setText(nombre+" -> Creditos: "+creditos+" -> Nota: "+nota);
            break;
			
		}

        // double acumulador_notas = 0;
        // double acumulador_creditos = 0;
        // double nota_auxiliar = 0;
        // double creditos_auxiliar = 0;
        // double promedio_ponderado = 0;
        // for (int i = 0; i < listaMaterias.length; i++) {
		// 	if (listaMaterias[i] != null){
		// 		nota_auxiliar = listaMaterias[i].getNota();
        //         creditos_auxiliar = listaMaterias[i].getCreditos();
        //         promedio_ponderado = (nota_auxiliar * creditos_auxiliar) / creditos_auxiliar;
		// 	}
			
		// }
        // double promedio_final = promedio_ponderado;
        // etq_total.setText("Total: "+promedio_final);
    }

}
