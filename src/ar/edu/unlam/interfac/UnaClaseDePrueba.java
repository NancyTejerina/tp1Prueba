package ar.edu.unlam.interfac;

public class UnaClaseDePrueba {

	public static void main(String[] args) {
		/* Desarrollar un programa (una clase de prueba) donde los datos de entrada son las dos 
		notas de un alumno y la salida es la condición del alumno. 
		Promociona si ambas notas son mayores o iguales a 7 
		Aprobados si ambas notas son mayores o iguales a 4 (al menos una es menor a 7) 
		Desaprobado si alguna de las notas es menor a 4 
		NO SE PUEDE UTILIZAR NINGUNA ESTRUCTURA LOGICA PARA RESOLVERLO 
		La salida puede ser promociono false, aprobó true, desaprobó false.*/
		
		//entrada
		 double notaUno=7;
		 double notaDos=5;
		//proceso
		boolean promociono = (notaUno>=7) && (notaDos>=7);
		boolean aprobo = (notaUno>=4 || notaDos>=7) || (notaUno>=7 || notaDos>=4);
		boolean desaprobo = (notaUno<4)  || (notaDos<4);
		 
		//salida
		//condicion del alumno Promociono(false), aprobado(true), desaprobado(false)
		
		System.out.println("Promociono? " + " " + promociono);
		System.out.println("Aprobo? " + " " + aprobo);
		System.out.println("Desaprobo? " + " " + desaprobo);
		
		Long numeroLongWrapper = 1L; // Variable con tipo de dato Long
		
		byte numeroByte = numeroLongWrapper.byteValue(); 
		String numeroComoString = numeroLongWrapper.toString(); // Devuelve el contenido de la variable de tipo de dato Long como String

		System.out.println(numeroByte);
		System.out.println(numeroComoString );
		Character caracterCharacterWrapper = 'a';
		char caracter = caracterCharacterWrapper.charValue(); 
		boolean esUnaLetraDelAlfabeto = Character.isAlphabetic(caracter);
		System.out.println(esUnaLetraDelAlfabeto);
	}

}
