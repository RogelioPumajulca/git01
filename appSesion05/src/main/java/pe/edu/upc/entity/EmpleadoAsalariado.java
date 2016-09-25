package pe.edu.upc.entity;
// La clase EmpleadoAsalariado extiende a Empleado, que implementa a PorPagar.

import java.util.List;

import pe.edu.upc.interfaces.PorPagar;

public class EmpleadoAsalariado extends Empleado  {
	
	private double salarioSemanal;

	// constructor con cuatro argumentos
	public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,double salarioSemanal) 
	{
		super(primerNombre, apellidoPaterno, numeroSeguroSocial); // pasa argumentos al constructor de Empleado
		setSalarioSemanal(salarioSemanal); // valida y almacena el salario
	}

	// establece el salario
	public void setSalarioSemanal(double salarioSemanal) {
		if (salarioSemanal >= 0.0)
			this.salarioSemanal = salarioSemanal;
		else
			throw new IllegalArgumentException("El salario semanal debe ser >= 0.0");
	}

	// devuelve el salario
	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	// devuelve representacion String de un objeto EmpleadoAsalariado
	@Override
	public String toString() {
		return String.format("empleado asalariado: %s\n%s: $%,.2f", super.toString(), "salario semanal",
				getSalarioSemanal());
	}

	@Override
	public double calcularPago() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Empleado getByNeoSegSocial(String nss) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Insert(Empleado o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Update(Empleado o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empleado get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empleado> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
