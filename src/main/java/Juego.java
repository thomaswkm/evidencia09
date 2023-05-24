public class Juego {
	private Dado d = new Dado();
	private Dado d2 = new Dado();

	public void iniciarJuego() {
		d.setCaraSuperior(d.lanzarDado());
		d2.setCaraSuperior(d.lanzarDado());
		entregarResultadoPartida(new Calculadora().calcularSuma(d.getCaraSuperior(),d2.getCaraSuperior()));
	}

	public void entregarResultadoPartida(int resultado) {
		if (resultado==7){
			System.out.println("Ganaste!");
		}else{
			System.out.println("Perdiste!");
		}
	}
}