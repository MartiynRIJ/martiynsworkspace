package complejos;

public class Complejo {
	private double real;
	private double img;
	

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImg() {
		return img;
	}

	public void setImg(double img) {
		this.img = img;
		}
	
	public Complejo (double real, double img){
		setReal(real);
		setImg(img);
		}

	
	public Complejo (){
		setReal(0);
		setImg(0);
		}
		
		public String toString() {
		return + getReal() + "+" + getImg() + "i";
	}
	
	
}
