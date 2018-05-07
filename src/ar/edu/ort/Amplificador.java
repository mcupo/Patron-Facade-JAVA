package ar.edu.ort;

public class Amplificador extends DispositivoElectronico {
	
	private	int 			nivelSonido;
	private	boolean 		sonidoSurround;
	private Sintonizador 	sintonizador;
	private	ReproductorDvd 	reproductorDvd;
	private	ReproductorCd 	reproductorCd;
	
	public Amplificador(String descripcion) {
		super(descripcion);
		this.nivelSonido = 1;
		this.sonidoSurround = false;
	}
	
	@Override
	public void encender() {
		System.out.println(descripcion + " encendido");
	}

	@Override
	public void apagar() {
		System.out.println(descripcion + " apagado");
	}
 
	public void setStereoSound() {
		System.out.println(descripcion + " stereo mode on");
	}
 
	public void activarSonidoSurround() {
		this.sonidoSurround = true;
		System.out.println(descripcion + " sonido surround activado");
	}
 
	public void setVolumen(int nivelSonido) {
		this.nivelSonido = nivelSonido;
		System.out.println(descripcion + " seteando volumen a " + this.nivelSonido);
	}

	public void setSintonizador(Sintonizador sintonizador) {
		this.sintonizador = sintonizador;
		System.out.println(descripcion + " seteando sintonizador a " + this.sintonizador);
	}
  
	public void setReproductorDvd(ReproductorDvd reproductorDvd) {
		this.reproductorDvd = reproductorDvd;
		System.out.println(descripcion + " seteando reproductor DVD a " + this.reproductorDvd);
	}
 
	public void setReproductorCd(ReproductorCd reproductorCd) {
		this.reproductorCd = reproductorCd;
		System.out.println(descripcion + " seteando reproductor de CD a " + this.reproductorCd);
	}
 
	@Override
	public String toString() {
		return descripcion;
	}
}