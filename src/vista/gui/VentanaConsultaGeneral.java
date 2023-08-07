package vista.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Coordinador;
import modelo.operaciones.Persona;
import modelo.operaciones.Procesos;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class VentanaConsultaGeneral extends JFrame implements ActionListener{

	private JPanel panelPrincipal;
	private JLabel lblImprimirInformacion;
	private JTextArea txtArea;
	private Coordinador miCoordinador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaConsultaGeneral frame = new VentanaConsultaGeneral();
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
	public VentanaConsultaGeneral() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		setResizable(false);
		
		componentes();
		
	}
	
	public void componentes() {
		lblImprimirInformacion = new JLabel("IMPRIMIR INFORMACION");
		lblImprimirInformacion.setBounds(0, 0, 436, 25);
		lblImprimirInformacion.setOpaque(true);
		lblImprimirInformacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblImprimirInformacion.setForeground(Color.WHITE);
		lblImprimirInformacion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblImprimirInformacion.setBackground(Color.BLACK);
		panelPrincipal.add(lblImprimirInformacion);
		
		txtArea = new JTextArea();
		txtArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtArea.setBounds(10, 35, 416, 218);
		panelPrincipal.add(txtArea);
	}

	

	public void mostrarListaEnArea() {
		//Creamos una lista como soporte contenedor para trabajar con los datos en la vista actual
		ArrayList<Persona> lista = miCoordinador.getListaPersonas();
		String cadena = "";
		System.out.println(lista.isEmpty());
		if(!lista.isEmpty()) {
			cadena = "Información Personas\n";
			
			for(Persona p:lista) {
				cadena+=p.toString()+"\n";
			}
			
		}else {
			cadena = "Sin información";
		}
		txtArea.setText(cadena);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
		
	}
	
}
