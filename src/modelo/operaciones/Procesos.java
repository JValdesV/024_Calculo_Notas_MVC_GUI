package modelo.operaciones;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import controlador.Coordinador;
import modelo.vo.EstudianteVO;

public class Procesos {
	
	List<EstudianteVO> listaPersonas;
	private Coordinador miCoordinador;
	
	public Procesos() {
		listaPersonas = new ArrayList<EstudianteVO>();
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
	
	public double calcularPromedio(EstudianteVO e) {
		double resultado = (e.getNota1()+e.getNota2()+e.getNota3())/3;
		return resultado;
	}
	
	public void registrarBD(EstudianteVO p) {
		System.out.println("Se registra en la Base de Datos");
		listaPersonas.add(p);
		System.out.println(p.toString());
	}
	
	public void listarPersonas() {
		listaPersonas.forEach((obj -> System.out.println(obj)));
	}
	
	public EstudianteVO obtenerEstudiante(String documento) {
		EstudianteVO p=null;
		//Alternativa orienta a POO
		for(EstudianteVO persona: listaPersonas) {
			if(persona.getDocumento().equals(documento)) {
				p = persona; 
				return p;
			}
		}
		return null;
	}
	
	//Alternativa para obtener la lista de personas
	/*
	public List<Persona> getListaPersona(){
		return this.listaPersonas;
	}*/
	
	//Alternativa para obtener la lista de personas
	public ArrayList<EstudianteVO> getListaPersonas(){
		return (ArrayList<EstudianteVO>) listaPersonas;
	}


	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
		
	}
	
	
	
	

}
