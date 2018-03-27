package complejos;
import complejos.Complejo;
public class Main {
	public static void main(String[] args) {
		Complejo z1=new Complejo (11,12);
		Complejo z2=new Complejo ();
		Complejo z3=new Complejo (23,30);
		
		Complejo z4=z1.sumar(z1);
		Complejo z5=z2.sumar(z3);
		
		Complejo z6=z3.restar(z1);
		Complejo z7=z1.restar(z3);
		
		System.out.println(z1);
		System.out.println(z2);
		System.out.println(z3);
		System.out.println(z4);
		System.out.println(z5);
		System.out.println(z6);
		System.out.println(z7);
	}
}
