package miworkspace.pruebas.numeroscomplejos;

public class Complejo {
	private double real;
	private double img;
	
	public Complejo (double real, double img){
		this.real=real;
		this.img=img;
	}
	
	public Complejo (){
		this.real=5;
		this.img=6;
	}
	
	public Complejo sumar (Complejo z2){
		Complejo aux=new Complejo();
		aux.real=this.real+z2.real;
		aux.img=this.img+z2.img;
		return aux;
	}
	
	public Complejo multiplicar (Complejo z2){
		Complejo aux=new Complejo();
		aux.real=this.real*z2.real-this.img*z2.img;
		aux.img=this.real*z2.img+z2.real*this.img;
		return aux;
	}
	
	public Double module(){
		return Math.sqrt(Math.pow(this.real, 2)+Math.pow(this.img, 2));
	}
	
	public Complejo clone(){
		Complejo aux=new Complejo();
		aux.real=this.real;
		aux.img=this.img;
		return aux;
	}

public String toString(){
	return +real+" + "+img+" i";
}

	public static void main(String[] args) {
		Complejo z1=new Complejo (3,2);
		Complejo z2=new Complejo ();
		Complejo z3=new Complejo ();
		Complejo z4=new Complejo ();
		Complejo z5=new Complejo ();
		z3=z1.sumar(z2);
		z4=z1.multiplicar (z2);
		z5=z2.clone();
		System.out.println(z1);
		System.out.println(z2);
		System.out.println(z3);
		System.out.println(z4);
		System.out.println(z2.module());
		System.out.println(z5);
	}

}
