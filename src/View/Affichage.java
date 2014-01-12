package View;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import model.Membre;


public class Affichage {
	private static String bienvenueMessage = "Bienvenue sur le logiciel de Covoiturage N2P1!\n";
	private static String menu = "MENU\n***********************************\n" +
			"1. Cr�er un compte\n" +
			"2. Cr�er un trajet\n" +
			"3. Voir les membres\n" +
			"0. Quitter\n";

	public static void afficherIntro() {
		System.out.print(bienvenueMessage);
	}
	
	public static int afficherMenu() {
		System.out.print(menu);
		return inputNumber("Votre choix");		
	}
	
	public static void afficherMembres(List<Membre> membres) {
		System.out.println("Les Membres");
		for(Membre membre: membres) {
			System.out.println("1. -------------------- ");
			System.out.println("\tNom : " + membre.getNom());
			System.out.println("\tPrenom :" + membre.getPrenom());
			System.out.println("\tAdresse : " +membre.getAdresse());
			System.out.println("\tEmail : " + membre.getMail());
			System.out.println("\tT�l : " + membre.getTelephone());
		}
	}

	public static Membre afficherCreerMembre() {
		System.out.println("Cr�ation d'un compte\n");
		String nom = inputString("Nom?", "Votre nom", 3);
		String email = inputString("Email?", "L'email", 5);
		String telephone = inputString("T�l�phone?", "Le t�l�phone", 8);

		return new Membre(nom, prenom, adresse, email, telephone);		
	}
	
	private static String inputString(String message, String propriete, int minLength) {
		System.out.println(message);
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		while(input.trim().length() < minLength) {
			System.out.println(propriete + " doit avoir au moins " + minLength + " carat�res.");
			input = sc.nextLine();
		}
		return input;
	}
	
	private static int inputNumber(String message) {
		System.out.println(message);
		Scanner sc = new Scanner(System.in);
		boolean stop = false;
		int input = 0;
		while(!stop) {
			try {
				input = sc.nextInt();
				stop = true;
			}
			catch (InputMismatchException ex) {
				System.out.println("Cela doit �tre un nombre");
				sc = new Scanner(System.in);
			}
		}
		return input;
		
	}
}