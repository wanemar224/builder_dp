package main;

import example.Brique;
import example.Couleur;
import example.Maison;
import example.Picine;
import example.Toit;

public class Main {

	public static void main(String[] args) {
		Maison maison_1 = new Maison.MaisonBuilder(8, Brique.TERRE_CUITE, Toit.PLAT ).build();
		System.out.println(maison_1);
		
		Maison maison_2 = new Maison.MaisonBuilder(8, Brique.TERRE_CUITE, Toit.PLAT)
							.picine(new Picine(1.20, "rectangle"))
							.peinture(Couleur.BLANCHE)
							.build();
		System.out.println(maison_2);

	}

}
