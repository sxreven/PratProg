package Ex;

public class Cilindro extends Poligono{
	
	private double raio,volume,altura;

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}
	
	public Cilindro(double raio, double volume, double altura) {
		super();
		this.raio = raio;
		this.volume = volume;
		this.altura = altura;
	}
	@Override
	public double volume() {
		return Math.PI * Math.pow(raio, 3) * altura;
	}
}
