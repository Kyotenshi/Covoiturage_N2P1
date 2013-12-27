import java.util.*;

public class Test {

	public static void main(String[] args) {
		//Clavier permettant la saisie de données
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Quelle est la marque de votre voiture ?");
		String marque = clavier.nextLine();
		System.out.println("Quelle est le modele de votre voiture ?");
		String modele = clavier.nextLine();
		System.out.println("Combien de places disponibles dans votre voiture ?");
		int place = clavier.nextInt();
		
		Voiture voiture = new Voiture(marque, modele, place);
		System.out.println("Il s'agit d'une " + voiture.marqueVoiture + " " + voiture.modeleVoiture + " qui dispose de" + voiture.nbPlaces + " places libres.");
	}

}
 /*Ceci est un code ajouter par Jérôme... Noraj de mon passage */