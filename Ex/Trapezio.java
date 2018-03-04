package Ex;

public class Trapezio extends Poligono {

	private double mn, b;

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getMn() {
		return mn;
	}

	public void setMn(double mn) {
		this.mn = mn;
	}

	
	
	public Trapezio(double mn, double b, double base, double altura) {
		super(base, altura);
		this.mn = mn;
		this.b = b;
	}
	
	public double area() {
		return ((base * b) * altura) / 2;
	}
}
