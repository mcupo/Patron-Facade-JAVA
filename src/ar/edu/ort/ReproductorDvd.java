package ar.edu.ort;

public class ReproductorDvd extends DispositivoElectronico {

	private int 	temaActual;
	private String 	pelicula;
	
	public ReproductorDvd(String descripcion) {
		super(descripcion);
		this.temaActual = 0;
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
    	pelicula = null;
    	System.out.println(descripcion + " expulsar");
    }
 
	public void reproducir(String pelicula) {
		this.pelicula = pelicula;
		temaActual = 0;
		System.out.println(descripcion + " reproduciendo \"" + this.pelicula + "\"");
	}

	public void play(int tema) {
		if (pelicula == null) {
			System.out.println(descripcion + " no se puede reproducir " + tema + " no hay un dvd");
		} else {
			temaActual = tema;
			System.out.println(descripcion + " reproduciendo tema " + temaActual + " de \"" + pelicula + "\"");
		}
	}

	public void parar() {
		temaActual = 0;
		System.out.println(descripcion + " parado \"" + pelicula + "\"");
	}
 
	public void pausar() {
		System.out.println(descripcion + " pausado \"" + pelicula + "\"");
	}
 
	@Override
	public String toString() {
		return descripcion;
	}
}