package com.edad.ejerc2;

import java.util.Scanner;

public class ejercicioedad2 {

	public static void main(String[] args) {
		
	   
		Scanner lector=new Scanner(System.in);
		
		System.out.println("El a�o del PIB de Espa�a ");
		short a�oEspa�a=Short.parseShort(lector.nextLine());
		
		System.out.println("El a�o del PIB de Francia ");
		short a�oFrancia=Short.parseShort(lector.nextLine());
		
		System.out.println("El a�o del PIB de Alemania ");
		short a�oAlemania=Short.parseShort(lector.nextLine());
		
		System.out.println("El a�o del PIB de Portugal ");
		short a�oPortugal=Short.parseShort(lector.nextLine());
		
		System.out.println("El a�o del PIB de Andorra ");
		short a�oAndorra=Short.parseShort(lector.nextLine());
		
		System.out.println("El a�o del PIB de Belgica ");
		short a�oBelgica=Short.parseShort(lector.nextLine());
		
		
		
		
		System.out.println("indica el PIB de Espa�a ");
		long pibEspa�a=Long.parseLong(lector.nextLine());
		
		System.out.println("Indica el PIB de Francia ");
		long pibFrancia=Long.parseLong(lector.nextLine());
		
		System.out.println("Indica el PIB de Alemania ");
		long pibAlemania=Long.parseLong(lector.nextLine());
		
		System.out.println("Indica el PIB de Portugal ");
		long pibPortugal=Long.parseLong(lector.nextLine());
		
		System.out.println("Indica el PIB de Andorra ");
		long pibAndorra=Long.parseLong(lector.nextLine());
		
		System.out.println("Indica el PIB de Belgica ");
		long pibBelgica=Long.parseLong(lector.nextLine());
		
		
		// int pibEspa�a = 1121948;
	    // int pibFrancia = 2302860;
	    // int pibAlemania = 3367560;
	    // int pibPortugal = 200088;
	    // int pibAndorra = 2502;
	    // int pibBelgica = 456893;
	    
		//calcula el PIB medio de estos paises
		
	    System.out.println("el PIB medio de estos paises es: "
	    		+(long) (pibEspa�a+pibFrancia+pibAlemania+pibPortugal+pibAndorra+pibBelgica/6));
	    
	    long pibMedio=pibEspa�a+pibFrancia+pibAlemania+pibPortugal+pibAndorra+pibBelgica/6;
	    
	    // pais mayor a la media
	    
	    if (pibEspa�a > pibMedio);
	        System.out.println("�es el pib de espa�a mayor a la media?" +(pibEspa�a>pibMedio));
	   
	  
	
	    
		
	    
	
		

		

	}

}
