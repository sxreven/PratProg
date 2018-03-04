package Ex;
import java.util.ArrayList;

public class Geometria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList< Geometria> formas = new ArrayList< Geometria >();
			formas.add(new Cilindo(5,10));
			formas.add(new Circulo(2));
			formas.add(new Cubo(3, 3, 3));
			formas.add(new Esfera(2));
			formas.add(new Losango(3, 5));
			formas.add(new Piramide(10));
			formas.add(new Quadrado(5));
			formas.add(new Retangulo(10,5));
			formas.add(new Trapezio());
			formas.add(new Triangulo(10,5));
	}
	for(Geometria emp:formas){
		System.out.println(emp.getArea());
		System.out.println(emp.getPerimetro());
		System.out.println(emp.getDiagonal());		

}
