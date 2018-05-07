package ar.edu.ort;

public class FacadeHomeTheater {
	
	private Amplificador amplificador;
	private Sintonizador sintonizador;
	private ReproductorDvd reproductorDvd;
	private ReproductorCd reproductorCd;
	private Proyector proyector;
	private LucesHomeTheater luces;
	private PantallaProyector pantallaProyector;
 
	public FacadeHomeTheater(Amplificador amplificador, Sintonizador sintonizador, ReproductorDvd reproductorDvd, 
			ReproductorCd reproductorCd, Proyector proyector, PantallaProyector pantallaProyector, LucesHomeTheater luces) {
		this.amplificador 		= amplificador;
		this.sintonizador 		= sintonizador;
		this.reproductorDvd 	= reproductorDvd;
		this.reproductorCd 		= reproductorCd;
		this.proyector 			= proyector;
		this.pantallaProyector 	= pantallaProyector;
		this.luces 				= luces;
	}
 
	public void verPelicula(String pelicula) {
		System.out.println("Inicia el proceso para ver una pelicula...");
		luces.atenuar(10);
		pantallaProyector.bajar();
		proyector.encender();
		proyector.modoWideScreen();
		amplificador.encender();
		amplificador.setReproductorDvd(reproductorDvd);
		amplificador.activarSonidoSurround();
		amplificador.setVolumen(5);
		reproductorDvd.encender();
		reproductorDvd.reproducir(pelicula);
	}
 
	public void terminarPelicula() {
		System.out.println("Inicia el proceso para terminar una pelicula...");
		luces.encender();
		pantallaProyector.subir();
		proyector.apagar();
		amplificador.apagar();
		reproductorDvd.parar();
		reproductorDvd.expulsar();
		reproductorDvd.apagar();
	}

	public void escucharCd(String nombreCd) {
		System.out.println("\nInicia el proceso para escuchar un cd...");
		luces.encender();
		amplificador.encender();
		amplificador.setVolumen(5);
		amplificador.setReproductorCd(reproductorCd);
		amplificador.setStereoSound();
		reproductorCd.encender();
		reproductorCd.reproducir(nombreCd);
	}

	public void terminarCd() {
		System.out.println("Inicia el proceso para terminar un cd...");
		amplificador.apagar();
		amplificador.setReproductorCd(reproductorCd);
		reproductorCd.expulsar();
		reproductorCd.apagar();
	}

	public void escucharRadio(double frecuencia) {
		System.out.println("\nInicia el proceso para escuchar la radio...");
		sintonizador.encender();
		sintonizador.setFrecuencia(frecuencia);
		amplificador.encender();
		amplificador.setVolumen(5);
		amplificador.setSintonizador(sintonizador);
	}

	public void apagarRadio() {
		System.out.println("Inicia el proceso para apagar la radio...");
		sintonizador.apagar();
		amplificador.apagar();
	}
}