package personas;

public class Persona {
	
	private String nombre;
	private int edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public Persona(String nombre,int edad)
	{
		setNombre(nombre);
		setEdad(edad);
	}
	
	public Persona()
	{
		this(null,0);
	}
	
	public void dormir()
	{
		System.out.println("Nahuel esta durmiendo");
	}
	
	public void comer()
	{
		int manzana=2;
		
		System.out.println("Nahuel comio "+manzana+" manzanas");
	}
	
	public void comer2(int num,String nombre)
	{
		System.out.println(nombre+" comio "+num+" manzanas");
	}
	
	public String toString()
	{
		return "Mi nombre es "+this.getNombre();
	}

}
