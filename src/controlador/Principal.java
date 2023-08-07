package controlador;
import modelo.operaciones.Procesos;
import vista.gui.VentanaConsulta;
import vista.gui.VentanaConsultaGeneral;
import vista.gui.VentanaConsultaPersonas;
import vista.gui.VentanaOperaciones;

public class Principal {

	public static void main(String[] args) {
		//VentanaOperaciones miVentana = new VentanaOperaciones();
		//miVentana.setVisible(true);
		new Relaciones().iniciar();
	}

	

}
