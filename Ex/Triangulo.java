package Ex;

public class Triangulo extends Poligono{
	
	private double x,y;
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Triangulo(double base, double altura, double x, double y) {
		super(base, altura);
		this.x = x;
		this.y = y;
	}
	
	//Contas
	@Override
	public double area() {
		return getArea() / 2;
	}
	@Override
	public double perimetro() {
		return x + y + getBase();
	}
		
}
