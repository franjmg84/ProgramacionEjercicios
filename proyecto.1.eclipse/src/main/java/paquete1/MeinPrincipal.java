package paquete1;

public class MeinPrincipal {

	public static void main(String[] args) {
		/*este simbolo es para poner cometarios 
		 * o codigos y que no salgan*/
		 // barra izquierda n es para un espacio entre lineas
		System.out.println("Hola");
        String meVoy="me piro";
        String miNombre="Fran";
        int edad=35;
        System.out.println("no te aguanto, " +meVoy);
        System.out.println("mi edad, " +edad);
        System.out.println("ya toca descansar, " +miNombre);
        
        // la clase byte permite almacenar los numeros sin decimales entre -128 y 127
        byte numeroByte=0; // ocupa 1 byte de memoria
        // la clase short permite almacenar numeros sin decimales entre -32 mil y pico y + 32 mil y pico
        short numeroShort=32767; //ocupan 2 bytes en memoria
        	//la clase int permite almacenar numeros sin decimales entre -2 mil millones y pico y +  2 mis milllones y pico
        int numeroInt=2138459834; //ocupa 4 bytes de en memoria
        //la clase long permite almacenar numeros muchos mas grande
        long numeroLong=8325345354355435889L;
        
        //tipos de datos con decimales 
        //clase folat permite almacenar numeros condecimales muy grandes, pero redondea a 2 decimales al imprimir
        //Ocupa 4 bytes
        float numeroFloat=8888888888888888888888888888888888888.85987946987594876F;
        //laclase double permite almacenar numeros con decimales absurdamente grandes. ocupa 8 bytes
        double numeroDouble=776843568345837645832874593845879857348758343794583298574837459832857932847893745983747686858975.0;
       
        //Char ocupa entre 1 y 2 bytes pero podemos asumir 1
        char letras='&';
        
        //boolean solo permite valores true o false
        boolean siONo=true;
        
        boolean esMayorDeEdad = edad > 17;
        
      
        	
        
      
        
        // ocupa,os 45.000.000 si guardamos la edad de 45.000.000 de personas en bytes
     // ocupa,os 180.000.000 si guardamos la edad de 45.000.000 de personas en int
        
        
	}  

}