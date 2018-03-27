package puntos;

public class Punto {
	
	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.setX(x);
		this.setY(y);
	}
	
	public Punto() {
		this(0.0, 0.0);
	}
	
	public Punto(double xy) {
		this(xy, xy);
	}
	
	public double getX() {
		return this.x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public static double calcularDistanciaEntreDosPuntos(Punto punto1, Punto punto2) {
		return Math.hypot(punto1.getX() - punto2.getX(), punto1.getY() - punto2.getY());
	}
	
	public double calcularDistanciaEntreDosPuntos(Punto punto1) {
		return Punto.calcularDistanciaEntreDosPuntos(this, punto1);
	}
	
	public String toString() {
		return this.getX() + "," + this.getY();
	}
	
}