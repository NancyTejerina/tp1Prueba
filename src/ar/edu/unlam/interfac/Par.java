package ar.edu.unlam.interfac;

public class Par {

	public static void main(String[] args) {
		/*11. Desarrollar una clase en Java llamada Par. La misma debe contener una variable entera. 
		La salida del programa debe ser 
		El número x es Par: true | false 
		Siendo x el valor que contenga la variable entera y true o false debe contener el valor correcto si es 
		que el número es divisible por 2 o no. */
		
		int numero=3;
		int cuenta= numero%2;
		boolean esPar= cuenta==0;
		
		System.out.println("Es par: " + " " + esPar);
		
		if(cuenta==0) {
			System.out.println("es par");
		}

	}

}
