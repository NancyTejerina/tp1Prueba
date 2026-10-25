package ar.edu.unlam.interfac;

public class SoloPracticoNANCY {

	public static void main(String[] args) {
		/*int variableInt=10;
		System.out.println("contenido int: " + variableInt);
		
		
		long variableLong=2;
		System.out.println("Contenido lon:  " + variableLong);
		
		//variableLong=variableInt;
		
		
		//System.out.println("nuevo long: " + variableLong);
		
		
		variableInt = (int) variableLong;
		
		System.out.println("variable int " + variableInt);
		
		char caracter = '1';
		System.out.println("caracter " + (char) (caracter+1));
		
		int caracterInt = caracter;
		System.out.println("Contenido de caracter: " + (int)caracterInt);
		
		int otraVariable= (caracter+1);

		System.out.println("otraVariable: " + otraVariable);
		
		float numeroFloat =12.5f;
		System.out.println("float: " + numeroFloat);
		
		numeroFloat = (7/3);
		System.out.println("contenido de numeroFloat: " + numeroFloat);
		
		numeroFloat=4%2
				;
		System.out.println("contenido resto: "+ numeroFloat);
		
		//-------------------------------------------------------
		int numero=1;
		System.out.println("contenido de numero: " + numero);//1
		System.out.println("contenido de pre decremento: " + --numero);//0
		numero++;//0
		++numero;//2
		System.out.println("post decremento "+ numero--);//2
		System.out.println("numero "+ numero);//recien restamos 1*/
		
		//----------------------------------------------------------
		
		int numeroEntero=1;
		
		boolean valorUno= false;
		
		boolean valorDos=!valorUno;
		
		System.out.println("Contenido de valor: " + valorDos);
		
		boolean valorTres=true;
		
		boolean resultado= ((valorUno|| valorDos)&& valorTres &&(numeroEntero>=1));
		
		System.out.println("Contenido de valor: " + resultado);
		
		char caracterMayuscula= 'C';
		
		resultado = caracterMayuscula>= 65 && caracterMayuscula <=90;
		
		System.out.println("Contenido de resultado: " + resultado);
		
        resultado = !(caracterMayuscula>= 65 && caracterMayuscula <=90);
		
		System.out.println("Contenido de resultado: " + resultado);
		
	
	}

}
