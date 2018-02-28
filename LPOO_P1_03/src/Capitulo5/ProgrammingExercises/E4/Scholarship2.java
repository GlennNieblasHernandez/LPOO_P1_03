package Capitulo5.ProgrammingExercises.E4;

import java.util.Scanner;

public class Scholarship2 {

	private static float calificacion;
	private static int actividades_extracurriculares;
	private static int actividad_servicio;
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Inserte la calificacion del estudiante: ");
		calificacion = entrada.nextFloat();
		System.out.println("Número de actividades extracurriculares: ");
		actividades_extracurriculares = entrada.nextInt();
		System.out.println("Cantidad de actividades de servicio: ");
		actividad_servicio = entrada.nextInt();
		
		if(calificacion>=3.8 && actividades_extracurriculares==1 && actividad_servicio==1) {
			
			System.out.println("Becario candidato");
			
		}
		if(calificacion<3.8 && calificacion>=3.4 && actividades_extracurriculares<=3 && actividad_servicio<=3) {
			
			System.out.println("Becario candidato");
			
		}
		if(calificacion<3.4 && calificacion>=3.0 && actividades_extracurriculares<=2 && actividad_servicio<=3) {
			
			System.out.println("Becario candidato");
						
		}
		if(calificacion>3.8 && actividades_extracurriculares>3 && actividad_servicio>3) {
			
			System.out.println("No es candidato");
			
		}
		if(calificacion>=4 || calificacion<4 || actividades_extracurriculares<=0 || actividad_servicio<=0){
            System.out.println("Error");
        }  

	}
	
}
