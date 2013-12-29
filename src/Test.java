import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		final char SEPARATEUR = ',';
		FileInputStream fis = null;
		FileOutputStream fos = null;

		// Cr�ation du fichier
		File f = new File("listeMembre.csv");

		// Test afin de voir si le .csv existe ou non
		System.out.println("Chemin absolu du fichier : " + f.getAbsolutePath());
		System.out.println("Nom du fichier : " + f.getName());
		System.out.println("Est-ce qu'il existe ? " + f.exists());
		System.out.println("Est-ce un r�pertoire ? " + f.isDirectory());
		System.out.println("Est-ce un fichier ? " + f.isFile());

		try {
			// On instancie nos objets :
			// fis va lire le fichier
			// fos va �crire dans le nouveau !
			fis = new FileInputStream(new File("listeMembre.csv"));
			fos = new FileOutputStream(new File("test2.txt"));

			byte[] buf = new byte[8];

			// Tant que l'affectation dans la variable est possible, on boucle
			// Lorsque la lecture du fichier est termin�e l'affectation n'est
			// plus possible !
			// On sort donc de la boucle
			while ((fis.read(buf)) >= 0) {
				// On �crit dans notre deuxi�me fichier avec l'objet ad�quat
				fos.write(buf);
				// On affiche ce qu'a lu notre boucle au format byte et au
				// format char
				for (byte bit : buf) {
					System.out.print("\t" + bit + "(" + (char) bit + ")");
					System.out.println("");
				}
			}
			System.out.println("Copie termin�e !");

		} catch (FileNotFoundException e) {
			// Cette exception est lev�e si l'objet FileInputStream ne trouve
			// aucun fichier
			e.printStackTrace();
		} catch (IOException e) {
			// Celle-ci se produit lors d'une erreur d'�criture ou de lecture
			e.printStackTrace();
		} finally {
			// On ferme nos flux de donn�es dans un bloc finally pour s'assurer
			// que ces instructions seront ex�cut�es dans tous les cas m�me si
			// une exception est lev�e !
			try {
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			// Voiture voiture1 = new Voiture();
			// voiture1.editionVoiture();
			// System.out.println(voiture1.toString());
			//
			// Membre membre1 = new Membre();
			// membre1.editionMembre();
			// System.out.println(membre1.toString());

			// Trajet trajet1 = new Trajet();
			// trajet1.editionTrajet();
			// System.out.println(trajet1.toString());
			// System.out.println();
		}

	}
}
