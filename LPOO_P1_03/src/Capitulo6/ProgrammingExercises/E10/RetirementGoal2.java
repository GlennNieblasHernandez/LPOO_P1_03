package Capitulo6.ProgrammingExercises.E10;

import java.util.Scanner;

public class RetirementGoal2 {

	private static int a,b;
	private static float c,d,t;
	
	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	    
	    System.out.print("Ingrese cuantos a�os falta para su jubilaci�n ");
	    do{
	    a=sc.nextInt();
	    }while(a<=0);
	    System.out.print("Ingrese el dinero que puede ahorrar al a�o ");
	    b=sc.nextInt();
	    
	    c=  (float)(b*0.05);
	     d=b+c;
	    t=  (float) (d * a );
	    
	   
	    System.out.printf("Usted tendr� un total de %.2f pesos ahorrados\n",t);
	       
	    }
	
}
