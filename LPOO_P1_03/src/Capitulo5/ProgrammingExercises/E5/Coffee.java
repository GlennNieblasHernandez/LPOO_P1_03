package Capitulo5.ProgrammingExercises.E5;

import java.util.Scanner;

public class Coffee {

	private static int opcion;
	private static float amer=(float)(1.99);
	private static float expre=(float)(2.50);
	private static float latt=(float)(2.15);
	private static int contador1=0;
	private static int contador2=0;
	private static int contador3=0;
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);

		System.out.println("Elija una opcion");
		System.out.println("1.-American "+amer);
		System.out.println("2.-Espresso "+expre);
		System.out.println("3.-Latte "+latt);
		System.out.println("0.- Para SALIR");
		

		do{
			opcion = entrada.nextInt();
		switch(opcion){
		
		case 1:
			
			amer=(float)(1.99);
			contador1++;
			
			break;
						
		case 2:
			
			expre=(float)(2.50);
			contador2++;
			
			break;
			
		case 3:
			
			latt=(float)(2.15);
			contador3++;
			
			break;
			
		case 0: 
			
			System.out.println("$0");
			
			break;
		
		}
		
		

		}while(opcion!=0);
		
		System.out.println("American\n"+contador1+ "\nEspresso\n"+contador2+"\nLatte\n"+contador3);
	}

	
}
