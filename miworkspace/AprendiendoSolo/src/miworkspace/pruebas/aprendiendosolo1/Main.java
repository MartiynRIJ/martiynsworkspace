package miworkspace.pruebas.aprendiendosolo1;

public class Main {
	public static void main(String[] args){
		Pelota p;
		p = new Pelota ();
		Double x = p.obtenerPeso();
		System.out.println(x);
		p.atraparPelota();
		p.patearPelota();
		/////////////////////
		System.out.println("///////////////////////");
		Clase c;
		c = new Clase(800.00,900.00);
		x = c.obtenerPeso();
		c.estado();
		c.encender();
		c.estado();
		System.out.println(c);
		////////////////////
		System.out.println("///////////////////////");
		ClaseHeredada d;
		d = new ClaseHeredada();
		d.estado();
		d.encender();
		d.estado();
		System.out.println(d);
		d.loca();
		System.out.println(d.obtenerModelo());
	}

}