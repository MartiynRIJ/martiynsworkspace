package complejos;

import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		
		boolean var;
		
		Complejo z1=new Complejo (11,12);
		Complejo z2=new Complejo ();
		Complejo z3=new Complejo (23,30);
		Complejo z5=new Complejo (23,30);
		Complejo [] vect=new Complejo[100];
		
		Complejo z4=z1.suma(z3);
		
		System.out.println(z1);
		System.out.println(z2);
		System.out.println(z3);
		System.out.println(z4);
		
		if(z5==z3)
			var=true;
		else
			var=false;
		
		System.out.printf("\n\n");
		System.out.println(var);
		
		boolean compar=z3.equals(z1);
		boolean compar2=z3.equals(z5);
		
		System.out.println(compar);
		System.out.println(compar2);
		
		double z=z1.modulo();
		
		System.out.println(z);
		
		int var2=z1.compareTo(z3);
		
		System.out.println(var2);
		
		int var3=z3.compareTo(z5);
		
		System.out.println(var3);
		
		for(int i=0;i<100;i++)
		{
		
				vect[i]=new Complejo((Math.random() * 100),(Math.random() * 100));
		}
		
		
		System.out.printf("\n");
		
		for (int i=0;i<100;i++)
		{
			System.out.println(vect[i].modulo());
		}
		
		Arrays.sort(vect);	
		
		System.out.printf("\n");
		
		for (int ind=0;ind<100;ind++)
		{
			System.out.println(vect[ind].modulo());
		}
	}
}
