package Actividades_tablas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
	/*
	 *  Create a table of n numbers and move it down one position, that is, the
	first becomes second, second becomes third, and so on
	successively. The last becomes the first
	 */
	
	public static void main(String[] args) {
		int[] tabla= new int [10];
		RellenaTabla(tabla);
		System.out.print(Arrays.toString(tabla));
		System.out.println();
		MueveDatosTabla(tabla);
		System.out.println(Arrays.toString(tabla));
	}

	private static void MueveDatosTabla(int[] tabla) {
		int[] TablaCopia =new int[tabla.length];
		TablaCopia=Arrays.copyOfRange(tabla,0,tabla.length);
		for (int i = 1; i < tabla.length; i++) {
			tabla[i]=TablaCopia[i-1];
		}
		tabla[0]=TablaCopia[TablaCopia.length-1];
	}

	private static void RellenaTabla(int[] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i]= new Random().nextInt(50);
		}
		
	}
	
	
}