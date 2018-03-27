package stringspruebas;
import java.io.*; //import ImportStreamReader and Buffer


public class Main {

	public static void main(String[] args) {
	
		String texto = "";
		String texto2 = "";
		double x=30.0;
		//int n=0;
		//////////////////////////////////////////
		//Permite leer por teclado
		InputStreamReader in = new InputStreamReader (System.in);
		BufferedReader buffer = new BufferedReader (in);
		
		try{
			texto = buffer.readLine();
			//n = Integer.parseInt(texto); transformar String en int
		}catch (IOException e) {};
		//////////////////////////////////////////
		
		texto = texto.concat(" ConCaTeNado!!!!");
		//texto = texto.toLowerCase ();
		texto = texto.toUpperCase ();
		int a = texto.length();
		texto2 = String.valueOf(x); //transformar double en String
		System.out.println (texto);
		System.out.println (a);
		System.out.println(texto2);
	}
}
