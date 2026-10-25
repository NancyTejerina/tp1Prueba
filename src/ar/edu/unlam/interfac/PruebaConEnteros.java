package ar.edu.unlam.interfac;

public class PruebaConEnteros {

	public static void main(String[] args) {
		/*Desarrolla, compila y ejecuta un programa que realice lo siguiente: 
		a. En una clase llamada PruebaConEnteros, almacena en una variable entera el valor máximo 
		que soporta dicho tipo de dato (2147483647). 
		b. Imprimí el valor por pantalla. 
		c. Incrementa el valor guardado en la variable a. 
		d. Volvé a imprimir el nuevo valor por pantalla 
		*/
		int variableA = 2147483647;
		System.out.println(variableA);
		
		variableA += 3;
		System.out.println(variableA); // RESULTADO: -2147483646S
		//e. ¿Qué sucede? ¿Porqué? ¿Qué cambios realizarías? 
		//Se vuelve negativa, sufre un desbordamiento llamado overflow. Porque no supero el limite del entero que puede llegar almacenar. 
		//En datos primitivos rebota y vuelve al rango negativo. Sucede lo siguuiente:
		//2147483647 + 1 = -2147483648
		//-2147483648 + 1 = -2147483647
		//-2147483647 + 1 = -2147483646
		//Los cambios que realizaria es usar otro tipo de dato , el cual seria long
		
		//3. Repetí lo realizado en el ejercicio 2 con byte, char, short, long, tipos primitivos en Java. 
		
		byte variableByte=(byte) 2147483647;
		System.out.println(variableByte);//RESULTADO -1
		
		short variableShort=(short) 2147483647;
		System.out.println(variableShort);//RESULTADO -1
		//Aqui lo quise castear, pero eso no se debe hacer porque se esta queriendo covertir un numero grande en un numero chico
		//sucede el desbordamiento
		
		char variableChar='0';
		System.out.println(variableChar);
		//char solo es para letras o numeroa (0-9) y siempre van entre apostrofes
		// se pueden poner numeros pero eso no quiere decir que sirven para hacer calculos
		
		long variableLong = 2147483647;
		System.out.println(variableLong);
		//Esta variable almacena datos grandes por eso acepta este tipo de numeros
		
	
	}

}
