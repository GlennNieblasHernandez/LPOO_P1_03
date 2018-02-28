package Capitulo5.ProgrammingExercises.E2;

import java.util.Scanner;

public class Temperatures {

	private static int temperatura_alta;
	private static int temperatura_baja;
	
	public static void main(String[] args) {
		

		Scanner entrada = new Scanner (System.in);

		System.out.println("Ingresa una temperatura alta: ");
		temperatura_alta = entrada.nextInt();
		
		System.out.println("Ingresa un temperatuta baja: ");
		temperatura_baja = entrada.nextInt();


		if(temperatura_alta >= 90){

     	System.out.println("Advertencia de calor");

		}
		if (temperatura_baja < 32){


		System.out.println("Advertencia de congelamiento");


		}
		if((temperatura_alta-temperatura_baja) >40){

		System.out.println("Gran oscilación de temperatura");

		}

	}
	
}
