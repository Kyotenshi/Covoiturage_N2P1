package View;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import model.Membre;
import model.Trajet;

public class Affichage {
	private static String bienvenueMessage = "Bienvenue sur le logiciel de Covoiturage N2P1!\n";
	private static String menu = "MENU\n--------------------\n" +
			"1. Créer un compte\n" +
			"2. Créer un trajet [Non Fonctionnel actuellement]\n" +
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
			System.out.println("\tPseudo : " + membre.getPseudo());
			System.out.println("\tNom : " + membre.getNom());
			System.out.println("\tPrenom : " + membre.getPrenom());
			System.out.println("\tAdresse : " +membre.getAdresse());
			System.out.println("\tEmail : " + membre.getEmail());
			System.out.println("\tTél : " + membre.getTelephone());
		}
	}

	public static Membre afficherCreerMembre() {
		System.out.println("Création d'un compte\n");
		String pseudo = inputString("Pseudo ?", "Votre pseudo", 3);
		String nom = inputString("Nom?", "Votre nom", 3);
		String prenom = inputString("Prenom?", "Votre prenom", 3);
		String adresse = inputString("Adresse?", "Votre adresse", 20);
		String email = inputString("Email?", "L'email", 5);
		String telephone = inputString("Téléphone?", "Le téléphone", 8);

		return new Membre(pseudo, nom, prenom, adresse, email, telephone);		
	}
	
	/* public static Trajet afficherCreerTrajet() {
		System.out.println("Création d'un trajet\n");
		String adresseDepart = inputString("Adresse de départ ?", "Votre adresse de départ", 20);
		String adresseArrivee =  inputString("Adresse d'arrivée ?", "Votre addresse d'arrivée", 20);
		String description = inputString("Descrption du trajet ?", "Votre description du trajet", 20);
		String heureDepart = inputString("Heure de départ ?", "Votre heure de départ", 5);
		String heureArrivee = inputString("Heure d'arrivée ?", "Votre heure d'arrivée", 5);
		String nbPlaces = inputString("Nombre de places ?", "Votre nombre de place", 1);
		String conducteur = inputString("Conducteur ?", "Votre conducteur", 3);
		String voiture = inputString("Voiture ?", "Votre voiture", 2);
		return new Trajet(adresseDepart, adresseArrivee, description, heureDepart, heureArrivee, nbPlaces, conducteur, voiture);
		
	} */
	
	private static String inputString(String message, String propriete, int minLength) {
		System.out.println(message);
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		while(input.trim().length() < minLength) {
			System.out.println(propriete + " doit avoir au moins " + minLength + " caratères.");
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
				System.out.println("Cela doit être un nombre");
				sc = new Scanner(System.in);
			}
		}
		return input;
		
	}
}