package Capitulo7.ProgrammingExercises.E6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Alphabetize {

	private static Scanner input = new Scanner(System.in);
	static List<String> lista = new ArrayList<>();
	private String text;
	
	public Alphabetize(String string) {
		
		this.text = string;
	}
	
	public String getText() {
		return text;
	}

	public static void agregarSring () {
		System.out.println("Ingrese un texto: ");
		String text = input.nextLine();
		lista.add(new String(text));
		
	}
	public static void ordenar() {

		Collections.sort(lista);
		
	}
	public static void main(String[] args) {
		
		for(int i = 0 ; i<3 ; i++){
		agregarSring();
		}
		ordenar();
		
		System.out.println("Ordenacion de cadenas ");
		System.out.println(lista.get(0));
	}
	
}
