package Capitulo5.ProgrammingExercises.E3;

import java.util.Scanner;

public class CondoSales2 {

	private static int opcion;
	private static int opcion2;
	private static int parque=150000;
	private static int golf=170000;
	private static int lago=210000;
	private static int garaje=5000;
	private static int estacionamiento=0;
	
	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);

		System.out.println("Elija una opcion");
		System.out.println("1.-Para ver el parque");
		System.out.println("2.-Para ver el campo de golf");
		System.out.println("3.-Para ver el lago");
		opcion = entrada.nextInt();

		switch(opcion){

		case 1:
		     
		System.out.println("Selecciono la opcion 1 Para ver el parque");
        System.out.println("Su precio es: $" +parque );
        System.out.println("Eliga una opcion: ");
        System.out.println("1.-Garaje. ");
        System.out.println("2.-Espacio de estacionamiento.");
        opcion2 = entrada.nextInt();
        if(opcion2 == 1) {
        	
        	System.out.println("Su precio es ahora porque eligio la opcion con garaje: $" + (parque+garaje));
        	
        }
        if(opcion2 == 2) {
        	
        	System.out.println("Su precio es igual porque eligio la opcion de espacio de estacionamiento: $" + (parque+estacionamiento));
        	
        }
        

		break;

		case 2: 

		System.out.println("Selecciono la opcion 2 Para ver el campo de golf");
		System.out.println("Su precio es: $" +golf );
		System.out.println("Eliga una opcion: ");
        System.out.println("1.-Garaje. ");
        System.out.println("2.-Espacio de estacionamiento.");
        opcion2 = entrada.nextInt();
        if(opcion2 == 1) {
        	
        	System.out.println("Su precio es ahora porque eligio la opcion con garaje: $" + (golf+garaje));
        	
        }
        if(opcion2 == 2) {
        	
        	System.out.println("Su precio es igual porque eligio la opcion de espacio de estacionamiento: $" + (golf+estacionamiento));
        	
        }
		
		break;


		case 3: 

		System.out.println("Selecciono la opcion 3 Para ver el lago");
		System.out.println("Su precio es: $" +lago);
		System.out.println("Eliga una opcion: ");
        System.out.println("1.-Garaje. ");
        System.out.println("2.-Espacio de estacionamiento.");
        opcion2 = entrada.nextInt();
        if(opcion2 == 1) {
        	
        	System.out.println("Su precio es ahora porque eligio la opcion con garaje: $" + (lago+garaje));
        	
        }
        if(opcion2 == 2) {
        	
        	System.out.println("Su precio es igual porque eligio la opcion de espacio de estacionamiento: $" + (lago+estacionamiento));
        	
        }
		
		break;
		

		default:
		System.out.println("$0");

		}

	}
	
}
