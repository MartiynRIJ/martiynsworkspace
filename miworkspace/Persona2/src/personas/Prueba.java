package personas;

public class Prueba {

	public static void main(String[] args) {
		
		Persona n1;
		
		n1=new Persona("Nahuel",21);
		
		n1.dormir();
		n1.comer();
		n1.comer2(5,"Miguel");
		System.out.println(n1);
	}

}
