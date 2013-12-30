import java.util.Scanner;

public class Voiture {
	private String marqueVoiture;
	private String modeleVoiture;
	private int nbPlaces;

	/* Classe Voiture Vide*/
	public Voiture(){
		this.marqueVoiture = "[Non definie]";
		this.modeleVoiture = "[Non definie]";
		this.nbPlaces = -1;
	}
	
	/* Classe Voiture Non Vide*/	
	public Voiture(String mVoiture, String modVoiture, int nPlaces){
		this.marqueVoiture = mVoiture;
		this.modeleVoiture = modVoiture;
		this.nbPlaces = nPlaces;
	}
	
	
	/* Methode d'edition de voiture */
	public void editionVoiture(){
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Quelle est la marque de votre voiture ?");
		String marque = clavier.nextLine();
		setMarqueVoiture(marque);
		
		System.out.println("Quelle est le modele de votre voiture ?");
		String modele = clavier.nextLine();
		setModeleVoiture(modele);
		
		System.out.println("Combien de places disponibles dans votre voiture ?");
		int place = clavier.nextInt();
		setNbPlaces(place);
		
		clavier.close();

	}
	

	/* Getters Setters */
	public String getMarqueVoiture() {
		return marqueVoiture;
	}

	public void setMarqueVoiture(String marqueVoiture) {
		this.marqueVoiture = marqueVoiture;
	}

	public String getModeleVoiture() {
		return modeleVoiture;
	}

	public void setModeleVoiture(String modeleVoiture) {
		this.modeleVoiture = modeleVoiture;
	}

	public int getNbPlaces() {
		return nbPlaces;
	}

	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}
 
	/* ToString */
	public String toString() {
		return "Il s'agit d'une " + marqueVoiture + " "+ modeleVoiture + ", qui dispose de " + nbPlaces + " places libres.";
	}
}