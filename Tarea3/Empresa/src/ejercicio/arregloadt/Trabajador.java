package ejercicio.arregloadt;

public class Trabajador {
	private String numeroTrabajor;
	private String nombres;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private double horasExtras;
	private double horasExtra;
	private double sueldoBase;
	private int aņoDeIngreso;


	public Trabajador(String numeroTrabajor, String nombres, String apellidoPaterno, String apellidoMaterno,
			double horasExtras, double sueldoBase, int aņoDeIngreso) {
		super();
		this.horasExtra = 276.5;
		this.numeroTrabajor = numeroTrabajor;
		this.nombres = nombres;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.horasExtras = horasExtras;
		this.sueldoBase = sueldoBase;
		this.aņoDeIngreso = aņoDeIngreso;
	}

	public String getNumeroTrabajor() {
		return numeroTrabajor;
	}

	public void setNumeroTrabajor(String numeroTrabajor) {
		this.numeroTrabajor = numeroTrabajor;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public double getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(double horasExtras) {
		this.horasExtras = horasExtras;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getAņoDeIngreso() {
		return aņoDeIngreso;
	}

	public void setAņoDeIngreso(int aņoDeIngreso) {
		this.aņoDeIngreso = aņoDeIngreso;
	}

	@Override
	public String toString() {
		return "Trabajador [nombres=" + nombres + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno="
				+ apellidoMaterno + ", horasExtras=" + horasExtras + ", sueldoBase=" + sueldoBase + ", aņoDeIngreso="
				+ aņoDeIngreso + "]";
	}
	
	public double calcularSueldo() {
		int antiguedad = 2022 - this.aņoDeIngreso;
		double total = this.sueldoBase + (this.sueldoBase*(antiguedad*0.3)) + (this.horasExtras * horasExtra);
		return total;
	}
	
	
}
