package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Operaciones.Procesos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaConsulta extends JFrame implements ActionListener{

	private JPanel panelPrincipal;
	private JTextField txtNombre;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtDocumento;
	private JButton btnConsultar;
	private Procesos misProcesos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaConsulta frame = new VentanaConsulta();
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
	public VentanaConsulta() {
		//Esta instruccion cierra todos los jframe por eso se comenta
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 460);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

		iniciarComponenetes();
		
	}
	
	public VentanaConsulta(Procesos misProcesos) {
		this.misProcesos = misProcesos;
	}

	public void iniciarComponenetes() {

		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JPanel panelPrincipal_1 = new JPanel();
		panelPrincipal_1.setLayout(null);
		panelPrincipal_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelPrincipal_1.setBounds(0, 0, 436, 413);
		panelPrincipal.add(panelPrincipal_1);
		
		JLabel lblNewLabel = new JLabel("CONSULTA ALUMNO");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(0, 0, 436, 36);
		panelPrincipal_1.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombre.setBounds(27, 45, 60, 17);
		panelPrincipal_1.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(85, 46, 170, 19);
		panelPrincipal_1.add(txtNombre);
		
		JLabel lblNota1 = new JLabel("Nota 1");
		lblNota1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNota1.setBounds(29, 83, 45, 13);
		panelPrincipal_1.add(lblNota1);
		
		txtNota1 = new JTextField();
		txtNota1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNota1.setColumns(10);
		txtNota1.setBounds(85, 82, 45, 19);
		panelPrincipal_1.add(txtNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2");
		lblNota2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNota2.setBounds(152, 83, 45, 13);
		panelPrincipal_1.add(lblNota2);
		
		txtNota2 = new JTextField();
		txtNota2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNota2.setColumns(10);
		txtNota2.setBounds(208, 82, 45, 19);
		panelPrincipal_1.add(txtNota2);
		
		JLabel lblNota3 = new JLabel("Nota 3");
		lblNota3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNota3.setBounds(293, 84, 45, 13);
		panelPrincipal_1.add(lblNota3);
		
		txtNota3 = new JTextField();
		txtNota3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNota3.setColumns(10);
		txtNota3.setBounds(349, 83, 45, 19);
		panelPrincipal_1.add(txtNota3);
		
		JLabel lblPromedio = new JLabel("Promedio");
		lblPromedio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPromedio.setBounds(14, 134, 73, 13);
		panelPrincipal_1.add(lblPromedio);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblResultado.setBounds(14, 157, 73, 13);
		panelPrincipal_1.add(lblResultado);
		
		JLabel lblResPromedio = new JLabel("");
		lblResPromedio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblResPromedio.setBounds(85, 134, 309, 13);
		panelPrincipal_1.add(lblResPromedio);
		
		JLabel lblResResultado = new JLabel("");
		lblResResultado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblResResultado.setBounds(85, 157, 309, 13);
		panelPrincipal_1.add(lblResResultado);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCalcular.setBounds(85, 198, 309, 33);
		panelPrincipal_1.add(btnCalcular);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnImprimir.setBounds(14, 278, 151, 33);
		panelPrincipal_1.add(btnImprimir);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnConsultar.setBounds(243, 278, 151, 33);
		btnConsultar.addActionListener(this);
		
		panelPrincipal_1.add(btnConsultar);
		
		
		txtDocumento = new JTextField();
		txtDocumento.setColumns(10);
		txtDocumento.setBounds(344, 46, 60, 19);
		panelPrincipal_1.add(txtDocumento);
		
		JLabel lblNewLabel_1 = new JLabel("Documento");
		lblNewLabel_1.setBounds(278, 49, 60, 13);
		panelPrincipal_1.add(lblNewLabel_1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnConsultar) {
			JOptionPane.showMessageDialog(null, "Haz presionado el boton consultar");
		}
		
	}
}
