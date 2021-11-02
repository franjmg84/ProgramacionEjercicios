package com.edad.ejerc2;

import java.util.Scanner;

public class ejercicioedad2 {

	public static void main(String[] args) {
		
	   
		Scanner lector=new Scanner(System.in);
		
		System.out.println("El año del PIB de España ");
		short añoEspaña=Short.parseShort(lector.nextLine());
		
		System.out.println("El año del PIB de Francia ");
		short añoFrancia=Short.parseShort(lector.nextLine());
		
		System.out.println("El año del PIB de Alemania ");
		short añoAlemania=Short.parseShort(lector.nextLine());
		
		System.out.println("El año del PIB de Portugal ");
		short añoPortugal=Short.parseShort(lector.nextLine());
		
		System.out.println("El año del PIB de Andorra ");
		short añoAndorra=Short.parseShort(lector.nextLine());
		
		System.out.println("El año del PIB de Belgica ");
		short añoBelgica=Short.parseShort(lector.nextLine());
		
		
		
		
		System.out.println("indica el PIB de España ");
		long pibEspaña=Long.parseLong(lector.nextLine());
		
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
		
		
		// int pibEspaña = 1121948;
	    // int pibFrancia = 2302860;
	    // int pibAlemania = 3367560;
	    // int pibPortugal = 200088;
	    // int pibAndorra = 2502;
	    // int pibBelgica = 456893;
	    
		//calcula el PIB medio de estos paises
		
	    System.out.println("el PIB medio de estos paises es: "
	    		+(long) (pibEspaña+pibFrancia+pibAlemania+pibPortugal+pibAndorra+pibBelgica/6));
	    
	    long pibMedio=pibEspaña+pibFrancia+pibAlemania+pibPortugal+pibAndorra+pibBelgica/6;
	    
	    // pais mayor a la media
	    
	    if (pibEspaña > pibMedio);
	        System.out.println("¿es el pib de españa mayor a la media?" +(pibEspaña>pibMedio));
	   
	  
	
	    
		
	    
	
		

		

	}

}
