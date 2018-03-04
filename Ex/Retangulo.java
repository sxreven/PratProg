package Ex;

public class Retangulo extends Poligono implements Diagonal{
	
	public Retangulo(double base, double altura) {
		super(base, altura);
	}
	@Override
	public double perimetro() {
		return 2 * getBase() + 2 * getAltura();
	}
	@Override
	public double area() {
		return getBase() * getAltura();
	}
	
}
