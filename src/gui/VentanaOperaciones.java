package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Operaciones.Persona;
import Operaciones.Procesos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;

public class VentanaOperaciones extends JFrame implements ActionListener{

	//Recordar de implementar la interfaz ActionListener en la clase de la Ventana
	//Recordar que el componente que queremos escuchar lo debemos agregar al componente.addActionListener(this)
	//Implementar el metodo abstracto de ActionListener if(e.getsource == componente)
	//Colocar todos los objetos o componentes al inicio como elementos privados
	//
	
	private JPanel panelPrincipal;
	private JTextField txtNombre;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JButton btnCalcular;
	private JLabel lblResPromedio;
	private JLabel lblResResultado;
	
	//instanciamos la clase procesos donde realizamos las tareas
	Procesos misProcesos;
	private JButton btnImprimir;
	private JButton btnConsultar;
	private JTextField txtDocumento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaOperaciones frame = new VentanaOperaciones();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaOperaciones() {
		misProcesos = new Procesos();
		//Esta instruccion cierra todos los jframe por eso se comenta
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 472);
		setTitle("CALCULO DE PROMEDIO");
		setLocationRelativeTo(null);
		setResizable(false);
		componenetes();
	}
	
	private void componenetes() {
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CALCULAR PROMEDIO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(Color.black);
		lblNewLabel.setForeground(Color.white);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(0, 0, 436, 36);
		lblNewLabel.setOpaque(true);
		panelPrincipal.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombre.setBounds(27, 45, 60, 17);
		panelPrincipal.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(85, 46, 170, 19);
		panelPrincipal.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNota1 = new JLabel("Nota 1");
		lblNota1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNota1.setBounds(29, 83, 45, 13);
		panelPrincipal.add(lblNota1);
		
		txtNota1 = new JTextField();
		txtNota1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNota1.setBounds(85, 82, 45, 19);
		panelPrincipal.add(txtNota1);
		txtNota1.setColumns(10);
		
		JLabel lblNota2 = new JLabel("Nota 2");
		lblNota2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNota2.setBounds(152, 83, 45, 13);
		panelPrincipal.add(lblNota2);
		
		txtNota2 = new JTextField();
		txtNota2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNota2.setColumns(10);
		txtNota2.setBounds(208, 82, 45, 19);
		panelPrincipal.add(txtNota2);
		
		JLabel lblNota3 = new JLabel("Nota 3");
		lblNota3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNota3.setBounds(293, 84, 45, 13);
		panelPrincipal.add(lblNota3);
		
		txtNota3 = new JTextField();
		txtNota3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNota3.setColumns(10);
		txtNota3.setBounds(349, 83, 45, 19);
		panelPrincipal.add(txtNota3);
		
		JLabel lblPromedio = new JLabel("Promedio");
		lblPromedio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPromedio.setBounds(14, 134, 73, 13);
		panelPrincipal.add(lblPromedio);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblResultado.setBounds(14, 157, 73, 13);
		panelPrincipal.add(lblResultado);
		
		lblResPromedio = new JLabel("");
		lblResPromedio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblResPromedio.setBounds(85, 134, 309, 13);
		panelPrincipal.add(lblResPromedio);
		
		lblResResultado = new JLabel("");
		lblResResultado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblResResultado.setBounds(85, 157, 309, 13);
		panelPrincipal.add(lblResResultado);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCalcular.setBounds(85, 198, 309, 33);
		btnCalcular.addActionListener(this);
		panelPrincipal.add(btnCalcular);
		
		btnImprimir = new JButton("Imprimir");
		btnImprimir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnImprimir.setBounds(14, 278, 151, 33);
		btnImprimir.addActionListener(this);
		panelPrincipal.add(btnImprimir);
		
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnConsultar.setBounds(243, 278, 151, 33);
		btnConsultar.addActionListener(this);
		panelPrincipal.add(btnConsultar);
		
		txtDocumento = new JTextField();
		txtDocumento.setColumns(10);
		txtDocumento.setBounds(344, 46, 60, 19);
		panelPrincipal.add(txtDocumento);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnCalcular) {
			calcularPromedio();
		
		}else if(e.getSource()==btnImprimir) {
			//Creo un objeto ventanaGeneral
			VentanaConsultaGeneral miConsultaGeneral = new VentanaConsultaGeneral();
			//Hago visible la ventana
			miConsultaGeneral.setVisible(true);
			//Cargo la lista en la vista
			miConsultaGeneral.setProcesos(misProcesos);
			//Muestro los objetos de la lista
			miConsultaGeneral.mostrarListaEnArea();
		
		}else if(e.getSource()==btnConsultar) {
			VentanaConsulta ventanaConsulta = new VentanaConsulta();
			ventanaConsulta.asignarProcesos(misProcesos);
			ventanaConsulta.setVisible(true);
			
		}else{
			
		}
		
	}
	
	public void calcularPromedio() {
		
		//Creamos un objeto para dar soporte a los datos
		Persona estudiante = new Persona();
		estudiante.setNombre(txtNombre.getText());
		estudiante.setDocumento(txtDocumento.getText());
		
		try {
			estudiante.setNota1(Double.parseDouble(txtNota1.getText()));
			estudiante.setNota2(Double.parseDouble(txtNota2.getText()));
			estudiante.setNota3(Double.parseDouble(txtNota3.getText()));
			
			estudiante.setPromedio(misProcesos.calcularPromedio(estudiante));
			System.out.println(estudiante.getPromedio());
			
			lblResPromedio.setText(String.valueOf(estudiante.getPromedio()));
			
			if(misProcesos.determinarAprobado(estudiante.getPromedio()).equals("Aprobado")) {
				lblResResultado.setText("Aprobado");
				lblResResultado.setForeground(Color.GREEN);
			}else {
				lblResResultado.setText("Reprobado");
				lblResResultado.setForeground(Color.RED);
			}
			
			misProcesos.registrarBD(estudiante);
			
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Se solicita un valor numerico ¡No texto en un campo!","Error",JOptionPane.ERROR_MESSAGE);
		} 
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ocurre un error, verifique los datos","Error",JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	
	

}
