package ar.edu.ort;

public abstract class DispositivoElectronico {
	
	public String descripcion;
	
	public DispositivoElectronico(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public abstract void encender();
	public abstract void apagar();

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}