package Parecidos_examenes;

import java.util.Arrays;
import java.util.Random;

/*
 * Fill in a table of 10 numbers (random values from 1 to 20).
 *  Perform a function that returns the most repeated number.
  */
public class Ejerciciocasa {

	private static int numeros [] = new int [10];
	public static void main(String[] args) {
		int MasRepetido=0;
		for (int i = 0; i < 10; i++) {
			numeros[i] = new Random().nextInt(21);
		}
		MasRepetido=BuscaMasRepetido(numeros);
		System.out.println(MasRepetido);
	}
	private static int BuscaMasRepetido(int[] numeros) {
		int repetido, contador=1, veces=0,VecesAnterior=0;
		int[] SinRepetidos = new int[10];
		Arrays.sort(numeros);
		SinRepetidos[0]=numeros[0];
		System.out.println(Arrays.toString(numeros));
		for (int i = 0; i < 9; i++) {
			if(numeros[i] != numeros[i+1]) {
				SinRepetidos[contador]=numeros[i+1];
				contador++;
			}
		}
		repetido=SinRepetidos[0];
		for (int i = 0; i < SinRepetidos.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				if(SinRepetidos[i]==numeros[j]) {
					veces++;
				}
			}
			if(veces>VecesAnterior) {
				repetido=SinRepetidos[i];
				VecesAnterior=veces;
			}
			veces=0;
		}		
		return repetido;
	}
}