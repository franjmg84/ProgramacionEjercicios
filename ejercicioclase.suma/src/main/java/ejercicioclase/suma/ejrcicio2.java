package ejercicioclase.suma;

public class ejrcicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte suma=4+5;
		
		suma--; //este es unario
		System.out.println("suma vale: "+suma);
		float cuenta = 5/(suma+7f-4)*2f;
		System.out.println(cuenta);
		
		// EPOCH
		long timestamp=1635434265;
		float segundosEnUnAño=60*60*24*365.2425f;
		System.out.println("años desde 1970: "+ 
		(timestamp/segundosEnUnAño));
		System.out.println("segundos desde el 1 de enero de 2021: ");

		

	}

}
