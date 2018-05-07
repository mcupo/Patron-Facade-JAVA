package ar.edu.ort;

public class LucesHomeTheater extends DispositivoElectronico {
	
	private int nivel;
	
	public LucesHomeTheater(String descripcion) {
		super(descripcion);
		this.nivel = 100;
	}

	@Override
	public void encender() {
		System.out.println(descripcion + " encendido");
	}

	@Override
	public void apagar() {
		System.out.println(descripcion + " apgado");
	}
	
	public void atenuar(int nivel) {
		this.nivel = nivel;
		System.out.println(descripcion + " atenuando a " + this.nivel  + "%");
	}

	@Override
	public String toString() {
		return descripcion;
	}
}