package gui;

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

import Operaciones.Persona;
import Operaciones.Procesos;

public class VentanaConsultaPersonas extends JFrame {

	private JPanel panelControl;
	private JTable tblEstudiantes;
	private Procesos misProcesos;
	public DefaultTableModel modelTable;

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
		
		scrollPane.setViewportView(tblEstudiantes);
		
		
		
		
		tblEstudiantes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scrollPane.setViewportView(tblEstudiantes);
	}

	public void setProcesos(Procesos procesos) {
		this.misProcesos = procesos;
		
	}
	
	public void llenarTabla() {
		ArrayList<Persona> listaPersonas = misProcesos.getListaPersonas();
		
		//Creamos un object para cada fila
		for(Persona persona: listaPersonas) {
			Object[] fila = new Object[6];
			fila[0] = persona.getDocumento();
			fila[1] = persona.getNombre();
			fila[2] = persona.getNota1();
			fila[3] = persona.getNota2();
			fila[4] = persona.getNota3();
			fila[5] = persona.getPromedio();
			modelTable.addRow(fila);
		}
		
		
	}
	
	
	
}
