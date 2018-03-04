package Ex;

public class Circulo extends Figura{
	
	private double raio;
	
	public Circulo (double raio){
	 this.setRaio(raio);
	}
	@Override
	public double area(){
	 return Math.PI * (this.getRaio() * this.getRaio());
	}
	@Override
	public double perimetro(){
	 return 2 * Math.PI * (this.getRaio());
	}
	public double getRaio(){
	 return raio;
	}
	public void setRaio(double raio){
	 this.raio = raio;
	}
}

