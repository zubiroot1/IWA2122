package Actividades_tablas;

import java.util.Scanner;


	/* 
	 * Read n numbers in increasing order. Ask the user for a number and look it up
	   In the table. Your current position should be displayed. If not, indicate it
       with a message
	 * 
	 */

public class Ejercicio5 {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int cantidad, buscar, posicion=0;
		boolean encontrado=false;
		
		System.out.println("Diga cu�ntos n�meros va a introducir: ");
		cantidad=sc.nextInt();
		
		int[] numeros= new int[cantidad];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca n�mero en orden creciente: ");
			numeros[i]=sc.nextInt();
		}
		
		System.out.println("Introduzca el n�mero a buscar: ");
		buscar=sc.nextInt();
		do {
			if(buscar==numeros[posicion]) {
				encontrado=true;
			}else {
				posicion++;
			}
		} while (!encontrado && posicion <cantidad);
		
		if(encontrado) {
			System.out.println("El n�mero " + buscar + " est� en la posici�n " + posicion++);
		}else {
			System.out.println("El n�mero no est� en la tabla");
		}
	}

}