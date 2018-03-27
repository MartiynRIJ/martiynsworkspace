/**
 * @author POO1 - Miercoles Noche
 * @version 16/09/2015
 */
public class Punto3D extends Punto2D {
	
	private Double z;
	
	public Punto3D(Double x, Double y, Double z) {
		super(x, y);
		this.setZ(z);
	}
	
	public Punto3D(Double xyz) {
		this(xyz, xyz, xyz);
	}
	
	public Punto3D() {
		this(0.0);
	}
	
	public Double getZ() {
		return this.z;
	}
	
	public void setZ(Double z) {
		this.z = z;
	}
	
	public Double calcularDistancia(Punto2D punto2D) {
		if (punto2D == null)
			return null;
		if (!(punto2D instanceof Punto3D))
			return null;
		Punto3D punto3D = (Punto3D) punto2D;
		return Math.hypot(super.calcularDistancia(punto3D), this.getY() - punto3D.getZ());
	}
	
	public String toString() {
		return super.toString() + "," + this.getZ();
	}
	
}