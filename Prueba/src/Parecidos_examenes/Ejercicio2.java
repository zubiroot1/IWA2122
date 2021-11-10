package Parecidos_examenes;

import java.util.Scanner;

public class Ejercicio2 {
/*
 * Request a number and show the square of the number. The square of a number is obtained by adding
 *  as many odd numbers as the number indicates. The square of 1 is 1. The square of 2 is 4,
 *  that is, 1 + 3. The square of 3 is 9, that is, 1 + 3 + 5.
 */
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Introduce número: ");
		int numero = sc.nextInt();
		int cuadrado = 0, impar = 1;
		for (int i = 1; i <= numero; i++) {
			cuadrado = cuadrado + impar;
			impar+=2;
		}
		System.out.println("El cuadrado de " + numero + " es " + cuadrado);
		sc.close();
	}

}