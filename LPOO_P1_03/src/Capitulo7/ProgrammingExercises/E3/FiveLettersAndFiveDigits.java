package Capitulo7.ProgrammingExercises.E3;

import java.util.Scanner;

public class FiveLettersAndFiveDigits {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text;
		Integer cantLetras =0;
		Integer cantDigitos =0;
		
		do {
			System.out.println("Cadena que contenga al menos cinco letras y al menos cinco dígitos.");
			System.out.println("Ingrese la cadena: ");
			text = input.nextLine();
			for(int x =0 ; x < text.length() ; x++) {
				if(text.substring(x,x+1).equals(" ")) cantLetras++;
				if(text.substring(x,x+1).equals("1") 
				|| text.substring(x,x+1).equals("2")
				|| text.substring(x,x+1).equals("3")
				|| text.substring(x,x+1).equals("4")
				|| text.substring(x,x+1).equals("5")
				|| text.substring(x,x+1).equals("6")
				|| text.substring(x,x+1).equals("7")
				|| text.substring(x,x+1).equals("8")
				|| text.substring(x,x+1).equals("9")
				|| text.substring(x,x+1).equals("0")) cantDigitos++;
			}
			if(cantLetras>= 5 || cantDigitos >= 5) System.out.println("Mensaje exitoso");
			else System.out.println("no ingresó suficientes dígitos, letras o ambos.");
		}while(cantLetras<= 5 && cantDigitos <= 5);
		
	
	}
}
