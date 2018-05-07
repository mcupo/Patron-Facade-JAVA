package ar.edu.ort;

public class Cliente {
	
	public static void main(String[] args) {
		Amplificador 		amplificador 		= new Amplificador("Amplificador Panasonic");
		Sintonizador 		sintonizador 		= new Sintonizador("Sintonizador AM/FM Panasonic");
		ReproductorDvd 		reproductorDvd 		= new ReproductorDvd("Reproductor de DVD Panasonic");
		ReproductorCd 		reproductorCd 		= new ReproductorCd("Reproductor de CD Panasonic");
		PantallaProyector 	pantallaProyector 	= new PantallaProyector("Pantalla proyector Panasonic");
		Proyector 			projector 			= new Proyector("Proyector Panasonic", pantallaProyector);
		LucesHomeTheater 	luces 				= new LucesHomeTheater("Luces Panasonic");

 
		FacadeHomeTheater FacadeHomeTheater = new FacadeHomeTheater(amplificador, sintonizador, reproductorDvd, reproductorCd, 
										projector, pantallaProyector, luces);
		//Se llama a la Fachada para ver una pelicula
		FacadeHomeTheater.verPelicula("Matrix");
		FacadeHomeTheater.terminarPelicula();
		//Se llama a la Fachada para escuchar un cd
		FacadeHomeTheater.escucharCd("Thriller");
		FacadeHomeTheater.terminarCd();
		//Se llama a la Fachada para escuchar la radio
		FacadeHomeTheater.escucharRadio(102.3);
		//Se puede acceder directamente a los objetos sin pasar por la fachada
		sintonizador.setFrecuencia(105.5);
		FacadeHomeTheater.apagarRadio();
	}
}