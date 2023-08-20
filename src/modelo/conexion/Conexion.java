package modelo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;

import javax.naming.CommunicationException;

public class Conexion {
	
	private String nombreBD = "bd_notas";
	private String usuario = "root";
	private String password = "admin";
	private String url = "jdbc:mariadb://localhost:3306/"+nombreBD;
	
	Connection conn = null;
	
	public String conectar() {
		
		String respuesta = "";
		
		try {
			//Forma heredada para cargar un controlador jdbc
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(url,usuario,password);
			if(conn!=null) {
				respuesta="conectado";
			}else {
				respuesta="No se pudo conectar "+nombreBD;
			}
			
			
		}
		catch (ClassNotFoundException e) {
			respuesta = "ocurre una ClassNotFoundException"+e.getMessage();
		}
		catch (SQLSyntaxErrorException e) {
			respuesta="ocurre una SQLSyntaxErrorException: "+ e.getMessage();
			respuesta+="Verifique que se este usando la base de datos y tablas correctas...";
		}
		catch (SQLException e) {
			respuesta="ocurre una SQLSyntaxErrorException: "+ e.getMessage();
			respuesta+="Verifique que se este usando la base de datos y tablas correctas...";
		}
		
		return respuesta;
	}
	
	public Connection getConnection() {
		return conn;
	}
	
	public void desconectar() {
		conn=null;
	}
	

}
