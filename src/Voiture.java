
public class Voiture {
	String marqueVoiture;
	String modeleVoiture;
	int nbPlaces;

	public Voiture(String mVoiture, String modVoiture, int nPlaces){
		System.out.println("Quelle est la marque de votre voiture ?");      
		this.marqueVoiture = mVoiture;
		this.modeleVoiture = modVoiture;
		this.nbPlaces = nPlaces;
	}
}