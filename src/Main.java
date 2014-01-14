import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//import javax.swing.JWindow;

import View.Affichage;
import model.Application;
import model.Membre;

/**
 * 
 * @author Kyo
 *
 */

public class Main {

	private static Application appli;
	
	public static void main(String[] args) {
		deserialize();
		Affichage.afficherIntro();
		boolean quitter = false;
		
		/* JWindow windows = new JWindow();
		windows.setSize(300, 200);
		windows.setVisible(true); */
		
		while(!quitter) {
			int action = Affichage.afficherMenu();
			switch(action) {
			//Dans le cas "0", le programme affiche un message pour dire Au revoir et change la variable "quitter" en "True" pour fermer
			//le soft
				case 0:
					quitter = true;
					System.out.println("Merci d'avoir utilisé le programme de Covoiturage N2P1, à bientôt !");
					break;
			//Dans le cas où l'utilisateur entre la valeur 1, le programme affiche l'interface permettant de créer un membre
				case 1:
					Membre m = Affichage.afficherCreerMembre();
					appli.ajouterMembre(m);
					serialize();
					break;
			//Dans le cas où l'utilisateur entre la valeur 2, le programme affiche [à complèter]
				case 2:
					System.out.println("Fonction indisponible actuellement, veuillez réessayer plus tard !");
					break;
			//Dans le cas où l'utilisateur entre la valeur 3, le programme affiche la liste des membres de Covoiturage N2P1
				case 3:
					Affichage.afficherMembres(appli.getMembres());
					Affichage.afficherMenu();
					break;
			//Dans le cas où l'utilisateur entre la valeur 4, le programme affiche l'interface permettant la modification
			//d'un membre.
				case 4:
					System.out.println("Modifier un membre");
					appli.estExistant();
					break;
			}
		}		
	}
	
	//
	private static void deserialize() {
		//Créer le fichier data
		File file = new File("data");
		//Si le fichier existe, l'application va le lire puis fermer le flux
		if(file.exists()) {
			try {
				FileInputStream fileIn = new FileInputStream(file);
				ObjectInputStream in = new ObjectInputStream(fileIn);
				appli = (Application) in.readObject();
				in.close();
				fileIn.close();
			}
			catch(IOException i) {
				i.printStackTrace();
			}
			catch(ClassNotFoundException c) {
				c.printStackTrace();
			}
		}
		else {
			//Sinon il crée l'application
			appli = new Application();
		}
	}
	
	private static void serialize() {
		try {
			FileOutputStream fileOut = new FileOutputStream("data");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(appli);
			out.close();
			fileOut.close();
		}
		catch(IOException i) {
			i.printStackTrace();
		}
	}
}
