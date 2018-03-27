package fecha;

public class Fecha {
	
	private int dia;
	private int mes;
	private int anual;
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnual() {
		return anual;
	}
	public void setAnual(int anual) {
		this.anual = anual;
	}
	
	public Fecha(){
		setDia (1);
		setMes (1);
		setAnual (1);
		}
	
	public Fecha (int dia,int mes, int anual){

		setDia (dia);
		setMes (mes);
		setAnual (anual);
		
	}

	public boolean consultarError(){
		boolean consultarDia=false,consultarMes=false,consultarAnual=false;
		if (getDia()<1||getDia()>31){
			consultarDia=true;
		}
		if (getMes()<1||getMes()>12){
			consultarMes=true;
		}
		if (getAnual()<1){
			consultarAnual=true;
		}
		if (consultarDia || consultarMes || consultarAnual){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String toString(){
		if (consultarError()==true){
			return "Error";
		}
		else{
		if (getDia()<10 && getMes()<10){
			return "0"+getDia()+"/0"+getMes()+"/"+getAnual();
		}
		if (getDia()<10){
			return "0"+getDia()+"/"+getMes()+"/"+getAnual();
		}
		if (getMes()<10){
			return +getDia()+"/0"+getMes()+"/"+getAnual();
		}

		return +getDia()+"/"+getMes()+"/"+getAnual();
		}
	}
	
}
