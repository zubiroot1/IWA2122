package Actividades_tablas;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {

	/*
	 * Read 2 tables of n numbers and mix it in a third table in the following way: 1st
	from A, 1st from B, 2nd from A, 2nd from B, 3rd from A, 3rd from B, 
	 */

	private static int [] TablaA = new int [10];
	private static int [] TablaB = new int [10];
	private static int [] TablaSuma = new int [20];
	
	public static void main(String[] args) {
		
		RellenarTablas();
		RellenarTablaSuma();
		System.out.println(Arrays.toString(TablaA));
		System.out.println(Arrays.toString(TablaB));
		System.out.println(Arrays.toString(TablaSuma));
							
	}
	
	private static void RellenarTablas() {
		
		for (int i = 0; i < TablaA.length; i++) {
			TablaA[i]= new Random().nextInt(50);
			TablaB[i]= new Random().nextInt(50);
		}
		
	}

	private static void RellenarTablaSuma() {
		int contador=0;
		
		for (int i = 0; i < TablaA.length; i++) {
			TablaSuma[contador]=TablaA[i];
			contador++;
			TablaSuma[contador]=TablaB[i];
			contador++;
		}
		
	}
	
}
