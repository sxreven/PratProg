package Ex;

public class Cubo extends Poligono{
	
	private double w, volume;
	
	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getW() {
		return w;
	}

	public void setW(double w) {
		this.w = w;
	}

	public Cubo(double base, double altura, double volume) {
		super(base, altura);
		this.volume = volume;
	}
	@Override
	public double volume() {
		return getBase() * w * getAltura();
	}

	
	
}
