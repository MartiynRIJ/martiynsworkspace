package miworkspace.pruebas.aprendiendosolo1;

public class Clase {
	
	Double peso;
	Double altura;
	Double ancho;
	Double largo;
	String modelo;
	boolean encendido=false;

	public Clase(){
		this.peso = 1000.00;
		this.altura = 1.90;
		this.ancho = 4.0;
	}
	
	public Clase(Double peso,Double altura){
		this.peso = peso;
		this.altura = altura;
	}
	
	public Double obtenerPeso(){
		return this.peso;
	}
	
	public Double obtenerAltura(){
		return this.altura;
	}

	public String obtenerModelo(){
		return this.modelo;
	}
	
	public String toString(){
		return "Peso "+peso+", altura "+altura+"";
	}
	///////////////////////////////////
	public void encender(){
		this.encendido=true;
		System.out.println("La Clase esta activada");
	}
	
	public void apagar(){
		this.encendido=false;
		System.out.println("La clase esta apagada");
	}
	
	public void estado(){
		if (this.encendido==true){
			System.out.println("La clase esta activada");
		}
		else {
			System.out.println("La clase esta apagada");
		}
	}
}

	class ClaseHeredada extends Clase{
		public ClaseHeredada(){
			this.modelo="Heredada:)";
		}
		public void loca(){
			System.out.println("La clase esta loca!!!");
		}
	}