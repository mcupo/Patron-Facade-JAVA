package ar.edu.ort;

public class Sintonizador extends DispositivoElectronico {
	
	private double frecuencia;

	public Sintonizador(String descripcion) {
		super(descripcion);
	}
	
	@Override
	public void encender() {
		System.out.println(descripcion + " encendido");
	}

	@Override
	public void apagar() {
		System.out.println(descripcion + " apagado");
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
		System.out.println(descripcion + " seteando frecuencia a " + this.frecuencia);
	}

	public void setAm() {
		System.out.println(descripcion + " seteando modo AM");
	}

	public void setFm() {
		System.out.println(descripcion + " seteando modo FM");
	}

	@Override
	public String toString() {
		return descripcion;
	}
}