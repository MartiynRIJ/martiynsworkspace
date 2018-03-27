/**
 * @author POO1 - Miercoles Noche
 * @version 16/09/2015
 */
public class Punto2D {
	
	private Double x;
	private Double y;
	
	public Punto2D(Double x, Double y) {
		this.setX(x);
		this.setY(y);
	}
	
	public Punto2D(Double xy) {
		this(xy, xy);
	}
	
	public Punto2D() {
		this(0.0);
	}
	
	public Double getX() {
		return this.x;
	}
	
	public void setX(Double x) {
		this.x = x;
	}
	
	public Double getY() {
		return this.y;
	}
	
	public void setY(Double y) {
		this.y = y;
	}
	
	public Double calcularDistancia(Punto2D punto2D) {
		return Math.hypot(this.getX() - punto2D.getX(), this.getY() - punto2D.getY());
	}
	
	public String toString() {
		return this.getX() + "," + this.getY();
	}
	
}
