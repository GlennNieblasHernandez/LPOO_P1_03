package Capitulo5.ProgrammingExercises.E1;

import java.util.Scanner;

public class EvenOdd {
	
private static int n1;
	
	public static void main(String[] args) {
		

		Scanner entrada = new Scanner (System.in);

		System.out.println("Ingresa un Numero: ");
		n1 = entrada.nextInt();


		if(n1 % 2 == 0){


		System.out.println("El numero es PAR");

		}else{


		System.out.println("El numero es IMPAR");


		}

	}
	

}
