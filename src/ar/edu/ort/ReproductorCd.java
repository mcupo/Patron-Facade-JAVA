package ar.edu.ort;

public class ReproductorCd extends DispositivoElectronico {
	
	private int 	temaActual;
	private String 	nombreCd;
	
	public ReproductorCd(String descripcion) {
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

	public void expulsar() {
		nombreCd = null;
		System.out.println(descripcion + " expulsar");
	}
 
	public void reproducir(String nombreCd) {
		this.nombreCd = nombreCd;
		temaActual = 0;
		System.out.println(descripcion + " reproduciendo \"" + this.nombreCd + "\"");
	}

	public void reproducir(int tema) {
		if (nombreCd == null) {
			System.out.println(descripcion + " no se puede reproducir el tema " + temaActual + 
					", no hay un cd");
		} else {
			temaActual = tema;
			System.out.println(descripcion + " reproduciendo tema " + temaActual);
		}
	}

	public void parar() {
		temaActual = 0;
		System.out.println(descripcion + " parado");
	}
 
	public void pausar() {
		System.out.println(descripcion + " pausado \"" + nombreCd + "\"");
	}
 
	@Override
	public String toString() {
		return descripcion;
	}
}