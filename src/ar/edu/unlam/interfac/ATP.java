package ar.edu.unlam.interfac;

public class ATP {

	public static void main(String[] args) {
		// 12. Se solicita desarrollar una clase de prueba llamada ATP. En esta clase se debe crear una variable
		//llamada edad, la cual contendrá la edad de una persona.
		// La salida del programa tiene que ser la siguiente:
		// La persona es mayor: true | false
		 //Visualizándose true para el caso que la edad sea mayor a 18 o false en caso contrario
		
		//ENTRADA
		int edadDeLaPersona=89;
		
		//PROCEDIMIENTO
		boolean esMayor= edadDeLaPersona>=18;
		
		//SALIDA
		System.out.println("Es mayor de edad ? " + esMayor);

	}

}
