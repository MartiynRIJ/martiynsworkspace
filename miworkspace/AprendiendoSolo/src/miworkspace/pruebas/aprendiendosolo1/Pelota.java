package miworkspace.pruebas.aprendiendosolo1;

public class Pelota {
	String cadena;
	Double radio;
	Double peso;

	public Pelota(){
		radio=100.00;
		peso=250.00;
	}
	public Pelota (Double radio,Double peso){
		this.radio=radio;
		this.peso=peso;
	}
	
	public Double obtenerRadio(){
		return radio;
	}
	
	public Double obtenerPeso(){
		return peso;
	}
	///////////////////////////////
	public void patearPelota(){
		System.out.println("Haz pateado la pelota");
	}
	
	public void atraparPelota (){
		System.out.println("Haz atrapado la pelota");
	}

}
