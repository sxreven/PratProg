package Ex;

public class Quadrado extends Poligono implements Diagonal{
	
	public Quadrado(double base) {
		super(base);
	}
	@Override
	public double perimetro() {
		return (4 * getBase());
	}
	@Override
	public double area() {
		return (Math.pow(getBase(), 2));
	}
}

