package com.repaso.entidades;

public class Empleado extends Persona{
	
	private double sueldo;
	
	public Empleado(String nombre, String apellido, int edad, double sueldo) {
		super(nombre, apellido, edad);
		this.sueldo = sueldo;
	}

}
