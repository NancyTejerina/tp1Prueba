package ar.edu.unlam.interfac;

public class Triangulo {

	public static void main(String[] args) {
		/*Se solicita desarrollar una clase de prueba llamada Triangulo, la cual debe tener 3 variables
		enteras, llamadas ladoA, ladoB y ladoC.*/
		 
		//ENTRADA
		int ladoA=3;
		int ladoB=3;
		int ladoC=6;
		
		//Procedimiento
		
		//todos los lados iguales
		 boolean equilatero= ladoA==ladoC && ladoB == ladoA  && ladoC==ladoB ;
		 
		 //Dos lados iguales y uno diferente
		 boolean isosceles = ladoA==ladoB && ladoC!= ladoA && ladoC != ladoB;
		
		 //LADOS DIFERENTES
		 boolean escaleno= ladoA!= ladoB && ladoA!=ladoC && ladoB!=ladoC;
		 
		 
		
		/*La salida del programa tiene que ser la siguiente:
			 El triángulo es Equilátero: true | false
			 El triángulo es Isósceles: true | false
			 El triángulo es Escaleno: true | false*/
		System.out.println("El triangulo es Equilatero? " + equilatero);
		System.out.println("El triangulo es Isosceles? " + isosceles);
		System.out.println("El triangulo es Escaleno?" + escaleno);

	}

}
