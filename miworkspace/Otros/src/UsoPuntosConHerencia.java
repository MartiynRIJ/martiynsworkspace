import java.util.ArrayList;

/**
 * @author POO1 - Miercoles Noche
 * @version 16/09/2015
 */
public class UsoPuntosConHerencia {
	
	public static void main(String[] args) {
		System.out.println(new Punto2D().calcularDistancia(new Punto2D(3.0, 4.0)));
		System.out.println(new Punto2D().calcularDistancia(new Punto3D(3.0, 4.0, 5.0)));
		System.out.println(new Punto3D().calcularDistancia(null));
		System.out.println(new Punto3D().calcularDistancia(new Punto2D(3.0, 4.0)));
		System.out.println(new Punto3D().calcularDistancia(new Punto3D(3.0, 4.0, 5.0)));
		ArrayList<Punto2D> puntos = new ArrayList<Punto2D>();
		puntos.add(new Punto2D(3.8, 4.1));
		puntos.add(new Punto3D(1.9, 3.5, 9.8));
		puntos.add(new Punto2D());
		puntos.add(new Punto3D(1.5));
		for (Punto2D punto : puntos)
			System.out.println(punto);
	}
	
}