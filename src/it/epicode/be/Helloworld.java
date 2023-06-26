package it.epicode.be;

import java.util.Scanner;

public class Helloworld {

	public static void main(String[] args)
		{
		System.out.println("This is my first Epicode Java Project!");

		// Esercizio 2
		System.out.println("Esercizio 2.1");
		int result = molt(4, 3);
		System.out.println(result);

		System.out.println("Esercizio 2.2");
		String concatRes = conc("Ciao ", 7);
		System.out.println(concatRes);

		System.out.println("Esercizio 2.3");
		String[] array = { "Finché", "la", "barca", "lasciala", "andare" };
		String nuovaStringa = "va,";

		String[] nuovoArray = inserisciInArray(array, nuovaStringa);

		System.out.println("Nuovo array lunghezza: " + nuovoArray.length);

		for (String s : nuovoArray) {
			System.out.println(s);
		}
		
		//Esercizio 3
		
		System.out.println("Esercizio 3");

		Scanner input = new Scanner(System.in);
		System.out.println("Prima frase: ");
		String firstString = input.nextLine();
		System.out.println("Seconda frase: ");
		String secondString = input.nextLine();
		System.out.println("Terza frase: ");
		String thirdString = input.nextLine();
		System.out.println(firstString + " " + secondString + " " + thirdString);
		System.out.println(thirdString + " " + secondString + " " + firstString);

		// Esercizio 4

		System.out.println("Esercizio 4");

		double perimetroRettRes = perimetroRettangolo(5.5, 7.8);
		System.out.println(perimetroRettRes);

		// Esercizio 5
		System.out.println("Esercizio 5");

		int numPariDispari = pariDispari(19);
		System.out.println(numPariDispari);

		// Esercizio 6
		System.out.println("Esercizio 6");

		double areaTriangolo = perimetroTriangolo(2.4, 4.7, 6.1);
		System.out.println(Math.sqrt(areaTriangolo));

		input.close();
		}

	public static int molt(int n1, int n2) {
			return n1 * n2;
		}

		public static String conc(String myString, int numb) {
			return myString + numb;
		}

		public static String[] inserisciInArray(String[] array, String nuovaStringa) {
			String[] nuovoArray = new String[6];

			for (int i = 0; i < nuovoArray.length; i++) {
				if (i == 3) {
					nuovoArray[i] = nuovaStringa;
				} else if (i > 3) {
					nuovoArray[i] = array[i - 1];
				} else {
					nuovoArray[i] = array[i];
				}
			}

			return nuovoArray;
		}

		public static double perimetroRettangolo(double lato1, double lato2) {
			return (lato1 + lato2) * 2;
		}

		public static int pariDispari(int intero) {
			if (intero % 2 == 0) {
				return 0;
			} else {
				return 1;
			}

	}

	public static double perimetroTriangolo(double lato1, double lato2, double lato3) {
		double p = (lato1 + lato2 + lato3) / 2;
		return p * (p - lato1) * (p - lato2) * (p - lato3);
	}
}



