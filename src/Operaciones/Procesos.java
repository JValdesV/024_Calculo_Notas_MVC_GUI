package Operaciones;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Procesos {
	
	List<Persona> listaPersonas;
	
	public Procesos() {
		listaPersonas = new ArrayList<Persona>();
	}
	
	
	public double calcularPromedio(double n1,double n2,double n3) {
		double prom = (n1+n2+n3)/3;
		return prom;
	}
	
	public String determinarAprobado(double promedio) {
		if(promedio>=4.0) {
			return "Aprobado";
		}else {
			return "Reprobado";
		}
	}

	public double calcularPromedio(Persona e) {
		double resultado = (e.getNota1()+e.getNota2()+e.getNota3())/3;
		return resultado;
	}
	
	public void registrarBD(Persona p) {
		System.out.println("Se registra en la Base de Datos");
		listaPersonas.add(p);
		System.out.println(p.toString());
	}
	
	public void listarPersonas() {
		listaPersonas.forEach((obj -> System.out.println(obj)));
	}
	

}
