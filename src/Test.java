import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int choix;
		
		// Menu
		System.out.println("Bonjour et bienvenue sur le programme de coiturage \"En voiture Simone\", que souhaitez-vous faire ?");
		System.out.println("1. Créer un compte");
		System.out.println("2. Créer un trajet");
		System.out.println("3. Gestion du trajet");
		System.out.println("4. Gestion du véhicule");
		Scanner menu = new Scanner(System.in);

		do {
			System.out.print("Quel est votre choix ? : ");
			choix = menu.nextInt();
			switch (choix) {
			case 1:
				System.out.println("Vous avez choisi de créer un compte.");
				Membre membre1 = new Membre();
				membre1.editionMembre();
				try {
					FileOutputStream fichier = new FileOutputStream("membre.csv");
					ObjectOutputStream oos = new ObjectOutputStream(fichier);
					oos.writeObject(membre1);
					oos.flush();
					oos.close();
				}
				catch(java.io.IOException e) {
					e.printStackTrace();
				}
				//System.out.println(membre1.toString());
				break;
			case 2:
				System.out.println("Vous avez choisi de créer un trajet.");
				break;
			case 3:
				System.out.println("Vous voulez accéder à la gestion du trajet.");
				Trajet trajet1 = new Trajet();
				trajet1.editionTrajet();
				System.out.println(trajet1.toString());
				break;
			case 4:
				System.out.println("Vous voulez accéder à la gestion du véhicule.");
				Voiture voiture1 = new Voiture();
				voiture1.editionVoiture();
				System.out.println(voiture1.toString());
				break;
			default:
				System.out.println("Menu inexistant, veuillez entrer un menu existant.");
			}
		} while (choix < 1 || choix > 4);
		menu.close();
		}

	}
