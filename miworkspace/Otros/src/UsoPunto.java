/**
 * @author POO1 - Miercoles Noche
 * @version 02/09/2015
 */
public class UsoPunto {
	
	public static void main(String[] args) {
		Punto punto0 = new Punto();
		Punto punto1 = new Punto(3, 4);
		System.out.println(punto1.getX());
		System.out.println(punto1.getY());
		System.out.println(punto1);
		System.out.println(Punto.calcularDistanciaEntreDosPuntos(punto0, punto1));
		System.out.println(punto1.calcularDistanciaEntreDosPuntos(punto0));
		Punto[] arreglo = new Punto[] {
				punto0, punto1, new Punto(4)
		};
		for (int i = 0; i < arreglo.length; i++)
			System.out.print(arreglo[i] + "||");
		System.out.println();
		for (Punto punto : arreglo)
			System.out.print(punto + "||");
	}
	
}