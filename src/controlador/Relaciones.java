package controlador;

import modelo.dao.EstudianteDAO;
import modelo.operaciones.Procesos;
import vista.gui.VentanaConsulta;
import vista.gui.VentanaConsultaGeneral;
import vista.gui.VentanaConsultaPersonas;
import vista.gui.VentanaOperaciones;

public class Relaciones {

	public void iniciar() {
		//Se instancian las clases y que deben ser unicas
		VentanaOperaciones ventanaOperaciones = new VentanaOperaciones();
		VentanaConsulta ventanaConsulta = new VentanaConsulta();
		VentanaConsultaGeneral ventanaConsultaGeneral = new VentanaConsultaGeneral();
		VentanaConsultaPersonas ventanaConsultaPersonas = new VentanaConsultaPersonas();
		EstudianteDAO miEstudianteDAO = new EstudianteDAO();
		Procesos misProcesos = new Procesos();
		Coordinador miCoordinador = new Coordinador();
		
		//Se establecen las relaciones con cada clase
		ventanaOperaciones.setCoordinador(miCoordinador);
		ventanaConsulta.setCoordinador(miCoordinador);
		ventanaConsultaGeneral.setCoordinador(miCoordinador);
		ventanaConsultaPersonas.setCoordinador(miCoordinador);
		misProcesos.setCoordinador(miCoordinador);
		miEstudianteDAO.setCoordinador(miCoordinador);
		
		//Se establecen la relaciones con la clase coordinador
		miCoordinador.setVentanaOperaciones(ventanaOperaciones);
		miCoordinador.setVentanaConsulta(ventanaConsulta);
		miCoordinador.setVentanaConsultaGeneral(ventanaConsultaGeneral);
		miCoordinador.setVentanaConsultaPersonas(ventanaConsultaPersonas);
		miCoordinador.setProcesos(misProcesos);
		miCoordinador.setEstudianteDAO(miEstudianteDAO);
		
		miCoordinador.mostrarVentanaOperaciones();
		
	}
	
}
