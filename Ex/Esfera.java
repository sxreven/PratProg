package Ex;

public class Esfera extends Figura{
	
	private double raio, volume;

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public Esfera(double raio, double volume) {
		this.raio = raio;
		this.volume = volume;
	}
	@Override
	public double volume() {
		return (4/3) * Math.PI * Math.pow(raio, 3);
	}
}
