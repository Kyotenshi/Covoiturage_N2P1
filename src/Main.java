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
				case 0:
					quitter = true;
					System.out.println("Merci d'avoir utilisé le programme de Covoiturage N2P1, à bientôt !");
					break;
				case 1:
					Membre m = Affichage.afficherCreerMembre();
					appli.ajouterMembre(m);
					serialize();
					break;
				case 2:
					System.out.println("Fonction indisponible actuellement, veuillez réessayer plus tard !");
					break;
					
				case 3:
					Affichage.afficherMembres(appli.getMembres());
					Affichage.afficherMenu();
					break;
			}
		}		
	}
	
	private static void deserialize() {
		File file = new File("data");
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
