package Ex;

public abstract class Figura {
	private double area, perimetro;

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	public abstract double area();
	public abstract double perimetro();

}
