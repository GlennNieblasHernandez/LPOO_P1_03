package Capitulo6.ProgrammingExercises.E10;

import java.util.Scanner;

public class RetirementGoal {

	private static int a,b,t;
	
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.print("Ingrese cuantos a�os falta para su jubilaci�n ");
	    do{
	    a=sc.nextInt();
	    }while(a<=0);
	    System.out.print("Ingrese el dinero que puede ahorrar al a�o ");
	    b=sc.nextInt();
	    t=a*b;
	    System.out.printf("Usted tendr� un total de %d pesos ahorrados ",t);

	    }
	
}
