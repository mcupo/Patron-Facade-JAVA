package ar.edu.ort;

public class Proyector extends DispositivoElectronico {
	
	private PantallaProyector 	pantalla;
	
	public Proyector(String descripcion, PantallaProyector pantalla) {
		super(descripcion);
		this.pantalla = pantalla;
	}
	
	@Override
	public void encender() {
		System.out.println(descripcion + " encendido");
	}

	@Override
	public void apagar() {
		System.out.println(descripcion + " apagado");
	}

	public void modoWideScreen() {
		System.out.println(descripcion + " en modo widescreen (relacion de aspecto 16x9)");
	}

	public void modoTv() {
		System.out.println(descripcion + " en modo TV (relacion de aspecto 4x3)");
	}
  
	@Override
    public String toString() {
            return descripcion;
    }
}