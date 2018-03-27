/**
 * @author POO1 - Miercoles Noche
 * @version 09/09/2015
 */
public class UsoMonedero {
	
	public static void main(String[] args) {
		Monedero monedero = new Monedero(350.0);
		System.out.println(monedero.consultarMonto());
		monedero.sacarDinero(150.0);
		System.out.println(monedero.consultarMonto());
		monedero.sacarDinero(200.0);
		System.out.println(monedero.consultarMonto());
		monedero.agregarDinero(110.0);
		System.out.println(monedero.consultarMonto());
	}
	
}