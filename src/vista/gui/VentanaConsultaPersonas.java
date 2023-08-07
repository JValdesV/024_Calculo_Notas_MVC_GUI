package vista.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controlador.Coordinador;
import modelo.operaciones.Persona;
import modelo.operaciones.Procesos;

public class VentanaConsultaPersonas extends JFrame {

	private JPanel panelControl;
	private JTable tblEstudiantes;
	public DefaultTableModel modelTable;
	private Coordinador miCoordinador;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaConsultaPersonas frame = new VentanaConsultaPersonas();
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
	public VentanaConsultaPersonas() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panelControl = new JPanel();
		panelControl.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panelControl);
		panelControl.setLayout(null);
		componentes();
		
	}
	
	public void componentes() {
		JLabel lblNewLabel = new JLabel("MOSTRAR PERSONAS");
		lblNewLabel.setBounds(0, 0, 436, 25);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBackground(Color.BLACK);
		panelControl.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 46, 426, 207);
		panelControl.add(scrollPane);
		
		tblEstudiantes = new JTable();
		
		scrollPane.setViewportView(tblEstudiantes);
		
		tblEstudiantes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scrollPane.setViewportView(tblEstudiantes);
	}

	
	
	public void llenarTabla() {
		ArrayList<Persona> misPersonas = miCoordinador.getListaPersonas();
		crearModeloTabla();
		for(Persona p: misPersonas ) {
			Object[] obj = new Object[6];
			obj[0] = p.getDocumento();
			obj[1] = p.getNombre();
			obj[2] = p.getNota1();
			obj[3] = p.getNota2();
			obj[4] = p.getNota3();
			obj[5] = p.getPromedio();
			modelTable.addRow(obj);
		}
		
		
	}
	
	public void crearModeloTabla() {
		//Creamos un modelo para llenar la tabla
		
		modelTable = new DefaultTableModel();
		tblEstudiantes.setModel(modelTable);
		
		//Creacion de las columnas
				
		modelTable.addColumn("Documento");
		modelTable.addColumn("Nombre");
		modelTable.addColumn("Nota 1");
		modelTable.addColumn("Nota 2");
		modelTable.addColumn("Nota 3");
		modelTable.addColumn("Promedio");
	}
	
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}
	
	
	
}
