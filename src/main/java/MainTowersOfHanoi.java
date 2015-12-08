package main.java;

import java.util.Scanner;

public class MainTowersOfHanoi {

	public static void main(String[] args) {
		TowersOfHanoi TOH = null;
		
		System.out.print("How many discs do you want to play with ? : ");
		Scanner monscanner = new Scanner(System.in);
		int discnbr = monscanner.nextInt();
		
		TOH = new TowersOfHanoi(discnbr);
		TOH.printStacks();
		
		TOH.resoudrehanoi(discnbr, TOH.get_Pile_de_Gauche(), TOH.get_Pile_du_Milieu(), TOH.get_Pile_de_Droite());
	}
}
