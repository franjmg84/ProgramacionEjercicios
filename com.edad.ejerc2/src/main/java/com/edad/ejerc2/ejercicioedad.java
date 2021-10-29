package com.edad.ejerc2;

public class ejercicioedad {

	public static void main(String[] args) {
        byte puestosEnAula=28;
        byte nAlumnos=97;
        byte puestosEnBiblioteca=7;
        byte puestosEnDespacho=2;

        System.out.println("aulas que puedo ocupar: "
        +(nAlumnos/puestosEnAula));
        System.out.println("Pringados que se quedan sin sitio: "+
        (nAlumnos%puestosEnAula));
        System.out.println(" los que sobran los reparto en bibliotecas: "+
        (nAlumnos%puestosEnAula)/puestosEnBiblioteca);
        System.out.println("Pringaos que se quedan sin sitio también en"+
        " biblioteca. "+ (nAlumnos%puestosEnAula)%puestosEnBiblioteca);
        System.out.println("Con los que sobran podemos llenar estos despachos: "+
                (nAlumnos%puestosEnAula)%puestosEnBiblioteca/puestosEnDespacho
        );
        System.out.println("Gente que sigue sobrando: "+
                (nAlumnos%puestosEnAula)%puestosEnBiblioteca%puestosEnDespacho);
    }
	}


