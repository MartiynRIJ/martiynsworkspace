package complejos;

public class Complejo implements Comparable<Complejo> {
	
	private double real;
	private double img;
	

	public double getReal() 
	{
		return real;
	}

	public void setReal(double real) 
	{
		this.real = real;
	}

	public double getImg() 
	{
		return img;
	}

	public void setImg(double img) 
	{
		this.img = img;
	}
	
	public Complejo (double real, double img)
	{
		setReal(real);
		setImg(img);
	}

	public Complejo ()
	{
		setReal(0);
		setImg(0);
	}
	
	public Complejo suma(Complejo z)
	{
		return new Complejo (this.getReal()+z.getReal(),this.getImg()+z.getImg());
	}
	
	public boolean equals(Complejo z)
	{
		return this.getReal()==z.getReal() && this.getImg()==z.getImg();
	}
	
	public double modulo()
	{
		return (Math.sqrt(Math.pow(getReal(),2)+Math.pow(getImg(),2)));
	}
	
	public int compareTo (Complejo z)
	{
		if (this.modulo()>z.modulo())
		{
			return 1;  
		}
		else 
		{
			if (this.modulo()==z.modulo())
			{
				return 0;
			}
			else
				return -1;
		}
			
	}
		
	public String toString() 
	{
		return  getReal() + "+" + getImg() + "i";
	}
	
	
}
