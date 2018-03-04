package Ex;

public class Piramide extends Poligono{
	
	private double l, volume;

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}
	
	public Piramide(double l, double base, double altura,double volume) {
		super(base, altura);
		this.l = l;
		this.volume = volume;
	}
	
	public double volume() {
		return (1/3) * getBase() * l * getAltura();
	}
	
	

}
