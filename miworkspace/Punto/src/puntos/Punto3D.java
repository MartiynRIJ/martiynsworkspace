package puntos;

public class Punto3D extends Punto {
	
	private double z;
	
	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public Punto3D(double x, double y, double z){
		super (x,y);
		this.setZ(z);
	}

}
