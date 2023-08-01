package Operaciones;

import java.awt.Color;

public class Procesos {
	
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

}
