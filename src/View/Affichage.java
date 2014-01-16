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
			"1. Créer un compte\n" +
			"2. Créer un trajet\n" +
			"3. Voir les membres\n" +
			"4. Modifier les membres\n" +
			"5. Vider la liste des membres\n" +
			"6. Vider la liste des trajets d'un membre\n" +
			"0. Quitter\n";

	public static void afficherIntro() {
		System.out.print(bienvenueMessage);
	}

	/**
	 * 
	 * @return Retourne le choix effectué dans le menu.
	 */
	
	public static int afficherMenu() {
		System.out.print(menu);
		return inputNumber("Votre choix :");		
	}

	/**
	 * Prends en paramètre le membre concerné et affiche ses informations.
	 * @param membres
	 */
	
	public static void afficherMembres(List<Membre> membres) {
		int i=0;
		System.out.println("Les Membres");
		for(Membre membre: membres) {
			i++;
			System.out.println(i + ". -------------------- ");
			System.out.println("\tPseudo : " + membre.getPseudo());
			System.out.println("\tNom : " + membre.getNom());
			System.out.println("\tPrenom : " + membre.getPrenom());
			System.out.println("\tAdresse : " +membre.getAdresse());
			System.out.println("\tEmail : " + membre.getEmail());
			System.out.println("\tTél : " + membre.getTelephone());
    		if(membre.getEstConducteur().equals("O")){
    			System.out.println("\tNom voiture : " + membre.getNomVoiture());
    			System.out.println("\tCouleur voiture : " + membre.getCouleurVoiture());
    			System.out.println("\tMarque voiture : " + membre.getTypeVoiture());
    		}
			System.out.println("\tTrajets : " + membre.getTrajets());
		}
	}
	
	/**
	 * 
	 * @return Retourne le membre et les infos renseignées.
	 */

	public static Membre afficherCreerMembre() {
		System.out.println("Création d'un compte :\n");
		String pseudo = inputString("Pseudo :", "Votre pseudo :", 3);
		String nom = inputString("Nom :", "Votre nom :", 3);
		String prenom = inputString("Prenom :", "Votre prenom :", 3);
		String adresse = inputString("Ville :", "Votre ville :", 3);
		String email = inputString("Email :", "L'email :", 5);
		String telephone = inputString("Téléphone :", "Le téléphone :", 8);
		String estConducteur = inputString("Etes vous conducteur (O/N) :", "Etes vous conducteur (O/N) :", 1);
		String nomVoiture = "Aucune voiture.";
		String couleurVoiture = "Aucune voiture.";
		String typeVoiture = "Aucune voiture.";
		if(estConducteur.equals("O")){
			nomVoiture = inputString("Nom de la voiture (si vous en possedez une) :", "Nom voiture (si vous en possedez une) :", 0);
			couleurVoiture = inputString("Couleur de la voiture (si vous en possedez une) :", "Couleur voiture (si vous en possedez une) :", 0);
			typeVoiture = inputString("Type de voiture (si vous en possedez une) :", "Type voiture (si vous en possedez une) :", 0);
		}
		return new Membre(pseudo, nom, prenom, adresse, email, telephone, estConducteur, nomVoiture, couleurVoiture, typeVoiture);		
	}
    //Re-ecris dans le membre existant placé en parametre
    public static void afficherModifierMembre(Membre membreChoix) {
    	if(membreChoix != null){
            System.out.println("Modification d'un compte\n");
            membreChoix.setPseudo(inputString("Pseudo :", "Votre pseudo :", 3));
            membreChoix.setNom(inputString("Nom :", "Votre nom :", 3));
            membreChoix.setPrenom(inputString("Prenom :", "Votre prenom :", 3));
            membreChoix.setAdresse(inputString("Ville :", "Votre ville :", 3));
            membreChoix.setEmail(inputString("Email :", "L'email :", 5));
            membreChoix.setTelephone(inputString("Téléphone :", "Le téléphone :", 8));
            membreChoix.setEstConducteur(inputString("Etes vous conducteur (O/N) :", "Etes vous conducteur (O/N) :", 1));
    		if(membreChoix.getEstConducteur().equals("O")){
    			membreChoix.setNomVoiture(inputString("Nom de la voiture (si vous en possedez une) :", "Nom de la voiture (si vous en possedez une) :", 0));
    			membreChoix.setCouleurVoiture(inputString("Couleur de la voiture (si vous en possedez une) :", "Couleur de la voiture (si vous en possedez une) :", 0));
    			membreChoix.setTypeVoiture(inputString("Type de voiture (si vous en possedez une) :", "Type de voiture (si vous en possedez une) :", 0));
    		}else{
    			membreChoix.setNomVoiture("Aucune voiture.");
    			membreChoix.setCouleurVoiture("Aucune voiture.");
    			membreChoix.setTypeVoiture("Aucune voiture.");
    		}
    	}else{
    		System.out.println("Le membre n'existe pas.");
    	}
    }
    
    //Ajoute le trajet dans le membre existant placé en parametre
    public static void afficherAjouterTrajet(Membre membreChoix) {
    	if(membreChoix != null){
            Trajet t = afficherCreerTrajet();
            membreChoix.getTrajets().add(t);
    	}else{
    		System.out.println("Le membre n'existe pas.");
    	}
    }

    public static Trajet afficherCreerTrajet() {
            System.out.println("Création d'un trajet\n");
            String adresseDepart = inputString("Adresse de départ :", "Votre ville de départ :", 3);
            String adresseArrivee =  inputString("Adresse d'arrivée :", "Votre ville d'arrivée :", 3);
            String description = inputString("Descrption du trajet :", "Votre description du trajet :", 0);
            String heureDepart = inputString("Heure de départ :", "Votre heure de départ :", 5);
            String heureArrivee = inputString("Heure d'arrivée :", "Votre heure d'arrivée :", 5);
            int nbPlaces = inputNumber("Nombre de places :");
            String conducteur = inputString("Conducteur :", "Votre conducteur :", 3);
            String voiture = inputString("Voiture :", "Votre voiture :", 2);
            return new Trajet(adresseDepart, adresseArrivee, description, heureDepart, heureArrivee, nbPlaces, conducteur, voiture);

    }
    
	/**
	 * Fonction qui permet d'interagir avec le programme en entrée.
	 * @param message Affiche un message selon l'info à entrer.
	 * @param propriete Défini le paramètre à entrer.
	 * @param minLength Correspond à la longueur minimal attendu de la saisie.
	 * @return
	 */

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
	
	/**
	 * 
	 * @param message Affiche un message en fonction du choix effectué
	 * @return Retourne l'entrée.
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
				System.out.println("Cela doit être un nombre");
				sc = new Scanner(System.in);
			}
		}
		return input;

	}
	
	/**
	 * 
	 * @return Retourne le pseudo du membre demandé.
	 */

	public static String demanderMembre() {
		String pseudo = inputString("Pseudo :", "Votre pseudo", 3);
		return pseudo;

	}

	
}