import java.util.Random;

public class Dado {
	private int caraSuperior;

	public int getCaraSuperior() {
		return this.caraSuperior;
	}

	public void setCaraSuperior(int caraSuperior) {
		this.caraSuperior = caraSuperior;
	}

	public Dado() {

	}
	public int lanzarDado() {
		return new Random().nextInt(0,7);
	}
}