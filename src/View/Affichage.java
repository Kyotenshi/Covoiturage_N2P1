package View;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import model.Membre;
import model.Trajet;


/**
 * 
 * @author Kyo (Hennache Johan)
 *
 */

public class Affichage {

	/**
	 * 
	 */
	
	private static String bienvenueMessage = "Bienvenue sur le logiciel de Covoiturage N2P1!\n";
	private static String menu = "MENU\n--------------------\n" +
			"1. Cr�er un compte\n" +
			"2. Cr�er un trajet\n" +
			"3. Voir les membres\n" +
			"4. Modifier les membres\n" +
			"5. Vider la liste des membres\n" +
			"0. Quitter\n";

	public static void afficherIntro() {
		System.out.print(bienvenueMessage);
	}

	/**
	 * 
	 * @return Retourne le choix effectu� dans le menu.
	 */
	
	public static int afficherMenu() {
		System.out.print(menu);
		return inputNumber("Votre choix");		
	}

	/**
	 * Prends en param�tre le membre concern� et affiche ses informations.
	 * @param membres
	 */
	
	public static void afficherMembres(List<Membre> membres) {
		System.out.println("Les Membres");
		for(Membre membre: membres) {
			System.out.println("1. -------------------- ");
			System.out.println("\tPseudo : " + membre.getPseudo());
			System.out.println("\tNom : " + membre.getNom());
			System.out.println("\tPrenom : " + membre.getPrenom());
			System.out.println("\tAdresse : " +membre.getAdresse());
			System.out.println("\tEmail : " + membre.getEmail());
			System.out.println("\tT�l : " + membre.getTelephone());
			System.out.println("\tTrajets : " + membre.getTrajets());
		}
	}
	
	/**
	 * 
	 * @return Retourne le membre et les infos renseign�es.
	 */

	public static Membre afficherCreerMembre() {
		System.out.println("Cr�ation d'un compte\n");
		String pseudo = inputString("Pseudo ?", "Votre pseudo", 3);
		String nom = inputString("Nom ?", "Votre nom", 3);
		String prenom = inputString("Prenom ?", "Votre prenom", 3);
		String adresse = inputString("Adresse ?", "Votre adresse", 3);
		String email = inputString("Email ?", "L'email", 5);
		String telephone = inputString("T�l�phone ?", "Le t�l�phone", 8);
		String nomVoiture = inputString("Nom de la voiture ?", "Nom voiture (si vous en possedez une)", 3);
		String couleurVoiture = inputString("Couleur de la voiture ?", "Couleur voiture (si vous en possedez une)", 3);
		String typeVoiture = inputString("Type de voiture", "Type voiture (si vous en possedez une)", 3);
		
		return new Membre(pseudo, nom, prenom, adresse, email, telephone, nomVoiture, couleurVoiture, typeVoiture);		
	}
    //Re-ecris dans le membre existant plac� en parametre
    public static void afficherModifierMembre(Membre membreChoix) {
            System.out.println("Modification d'un compte\n");
            membreChoix.setPseudo(inputString("Pseudo ?", "Votre pseudo", 3));
            membreChoix.setNom(inputString("Nom ?", "Votre nom", 3));
            membreChoix.setPrenom(inputString("Prenom ?", "Votre prenom", 3));
            membreChoix.setAdresse(inputString("Adresse ?", "Votre adresse", 3));
            membreChoix.setEmail(inputString("Email ?", "L'email", 5));
            membreChoix.setTelephone(inputString("T�l�phone ?", "Le t�l�phone", 8));
    }
    
    //Ajoute le trajet dans le membre existant plac� en parametre
    public static void afficherAjouterTrajet(Membre membreChoix) {
            System.out.println("Ajout d'un trajet\n");
            Trajet t = afficherCreerTrajet();
            membreChoix.getTrajets().add(t);
    }

    public static Trajet afficherCreerTrajet() {
            System.out.println("Cr�ation d'un trajet\n");
            String adresseDepart = inputString("Adresse de d�part ?", "Votre adresse de d�part", 20);
            String adresseArrivee =  inputString("Adresse d'arriv�e ?", "Votre addresse d'arriv�e", 20);
            String description = inputString("Descrption du trajet ?", "Votre description du trajet", 20);
            String heureDepart = inputString("Heure de d�part ?", "Votre heure de d�part", 5);
            String heureArrivee = inputString("Heure d'arriv�e ?", "Votre heure d'arriv�e", 5);
            int nbPlaces = inputNumber("Nombre de places ?");
            String conducteur = inputString("Conducteur ?", "Votre conducteur", 3);
            String voiture = inputString("Voiture ?", "Votre voiture", 2);
            return new Trajet(adresseDepart, adresseArrivee, description, heureDepart, heureArrivee, nbPlaces, conducteur, voiture);

    }
    
	/**
	 * Fonction qui permet d'interagir avec le programme en entr�e.
	 * @param message Affiche un message selon l'info � entrer.
	 * @param propriete D�fini le param�tre � entrer.
	 * @param minLength Correspond � la longueur minimal attendu de la saisie.
	 * @return
	 */

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
	
	/**
	 * 
	 * @param message Affiche un message en fonction du choix effectu�
	 * @return Retourne l'entr�e.
	 */

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
	
	/**
	 * 
	 * @return Retourne le pseudo du membre demand�.
	 */

	public static String demanderMembre() {
		String pseudo = inputString("Pseudo ?", "Votre pseudo", 3);
		return pseudo;

	}

	
}