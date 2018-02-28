package Capitulo5.ProgrammingExercises.E3;

import java.util.Scanner;

public class CondoSales {

private static int opcion;
	
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

		System.out.println("Su precio es: $150,000" );

		break;

		case 2: 

		System.out.println("Selecciono la opcion 2 Para ver el campo de golf");
		System.out.println("Su precio es: $170,000" );

		break;


		case 3: 

		System.out.println("Selecciono la opcion 3 Para ver el lago");
		System.out.println("Su precio es: $ 210,000");

		break;

		default:
		System.out.println("$0");

		}

	}
	
}
