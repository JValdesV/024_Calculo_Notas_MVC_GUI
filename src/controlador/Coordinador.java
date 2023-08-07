package controlador;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.operaciones.Persona;
import modelo.operaciones.Procesos;
import vista.gui.VentanaConsulta;
import vista.gui.VentanaConsultaGeneral;
import vista.gui.VentanaConsultaPersonas;
import vista.gui.VentanaOperaciones;

public class Coordinador {

	private VentanaOperaciones ventanaOperaciones;
	private VentanaConsulta ventanaConsulta;
	private VentanaConsultaGeneral ventanaConsultaGeneral;
	private VentanaConsultaPersonas ventanaConsultaPersonas;
	private Procesos misProcesos;

	public void setVentanaOperaciones(VentanaOperaciones ventanaOperaciones) {
		this.ventanaOperaciones = ventanaOperaciones;
		
	}

	public void setVentanaConsulta(VentanaConsulta ventanaConsulta) {
		this.ventanaConsulta = ventanaConsulta;
		
	}

	public void setVentanaConsultaGeneral(VentanaConsultaGeneral ventanaConsultaGeneral) {
		this.ventanaConsultaGeneral = ventanaConsultaGeneral;
		
	}

	public void setVentanaConsultaPersonas(VentanaConsultaPersonas ventanaConsultaPersonas) {
		this.ventanaConsultaPersonas = ventanaConsultaPersonas;
		
	}

	public void setProcesos(Procesos misProcesos) {
		this.misProcesos = misProcesos;
		
	}
	
	public void mostrarVentanaOperaciones() {
		this.ventanaOperaciones.setVisible(true);
	}

	public void mostrarVentanaConsulta() {
		this.ventanaConsulta.setVisible(true);
	}

	public double calcularPromedio(double nota1, double nota2, double nota3) {
		return misProcesos.calcularPromedio(nota1, nota2, nota3);
	}

	public double calcularPromedio(Persona estudiante) {
		return misProcesos.calcularPromedio(estudiante);
		
	}

	public String determinarAprobado(double promedio) {
		return misProcesos.determinarAprobado(promedio);
	}

	public void registrarBD(Persona estudiante) {
		misProcesos.registrarBD(estudiante);
	}

	public void mostrarVentanaConsultaPersonas() {
		if(misProcesos.getListaPersonas().isEmpty()) {
			JOptionPane.showMessageDialog(null, "No hay información en la listas");
		}else {
			//ventanaConsultaPersonas.setProcesos(misProcesos);
			ventanaConsultaPersonas.llenarTabla();
			ventanaConsultaPersonas.setVisible(true);
		}
		
		
	}

	public ArrayList<Persona> getListaPersonas() {
		return misProcesos.getListaPersonas();
	}

	public Persona obtenerEstudiante(String documento) {
		return misProcesos.obtenerEstudiante(documento);
	}

	public void mostrarVentanaConsultaGeneral() {
		ventanaConsultaGeneral.mostrarListaEnArea();
		ventanaConsultaGeneral.setVisible(true);
	}
	
		

}
