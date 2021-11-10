package Parecidos_examenes;

import java.util.Scanner;


public class Ejercicio1 {

	
	/*
	 * Given two numbers, indicate whether they are friends or not.
	 *  Two numbers are friends if the sum of the proper divisors of one of them is equal to the other
	 *   (the unit is considered a proper divisor, but the same number is not)
	220 y 284
	284 = 1 + 2 + 4 + 71 + 142 = 220
	220 = 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284
	 */
	
private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce el primer número: ");
		int Numero1 = sc.nextInt();
		System.out.println("Introduce el segundo número: ");
		int Numero2 = sc.nextInt();
		int SumaDivisoresNumero1 = 0, SumaDivisoresNumero2 = 0;
		
		for (int i = 1; i < Numero1; i++) {
			if(Numero1%i == 0) {
				SumaDivisoresNumero1=SumaDivisoresNumero1 + i;
			}
		}
		for (int j = 1; j < Numero2; j++) {
			if(Numero2%j == 0) {
				SumaDivisoresNumero2=SumaDivisoresNumero2 + j;
			}	
		}
		if(SumaDivisoresNumero1 == Numero2 && SumaDivisoresNumero2 == Numero1) {
			System.out.println("Los numeros " + Numero1 + " y " + Numero2 + " son amigos");
		}else {
			System.out.println("Los numeros " + Numero1 + " y " + Numero2 + " no son amigos");
		}
	}

}