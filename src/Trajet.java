//
//editionTrajet() NE CONTIENT PAS "AUTEUR"
// heureDepart est de type INT
//

import java.util.Scanner;


public class Trajet {
	private String addresseDestination;
	private String addresseDepart;
	private String villeDestination;
	private String villeDepart;
	private int heureDepart;
//	private Membre auteur;
	private String description;
	
	/* Classe Trajet Vide*/
	public Trajet(){
		this.addresseDestination = "[Non definie]";
		this.addresseDepart = "[Non definie]";
		this.villeDestination = "[Non definie]";
		this.villeDepart = "[Non definie]";
		this.heureDepart = -1;
//		this.auteur = null;
		this.description = "[Non definie]";
	}
	
	
	/* Classe Trajet Non Vide*/
	public Trajet(String addresseDestination, String addresseDepart, String villeDestination, String villeDepart, int heureDepart, Membre auteur, String description){
		this.addresseDestination = addresseDestination;
		this.addresseDepart = addresseDepart;
		this.villeDestination = villeDestination;
		this.villeDepart = villeDepart;
		this.heureDepart = heureDepart;
//		this.auteur = auteur;
		this.description = description;
	}
	
	
	/* Methode d'edition de Trajet */
	public void editionTrajet(){
		Scanner clavier = new Scanner(System.in);

		System.out.println("AddresseDestination : ");
		String addresseDestination = clavier.nextLine();
		setAddresseDestination(addresseDestination);
		
		System.out.println("AddresseDepart : ");
		String addresseDepart = clavier.nextLine();
		setAddresseDepart(addresseDepart);
		
		System.out.println("VilleDestination : ");
		String villeDestination = clavier.nextLine();
		setVilleDestination(villeDestination);
		
		System.out.println("VilleDepart : ");
		String villeDepart = clavier.nextLine();
		setVilleDepart(villeDepart);

		System.out.println("Description : ");
		String description = clavier.nextLine();
		setDescription(description);
		
		System.out.println("HeureDepart : ");
		int heureDepart = clavier.nextInt();
		setHeureDepart(heureDepart);
		
		clavier.close();

	}

	
	/* Getters Setters */
	public String getAddresseDestination() {
		return addresseDestination;
	}

	public void setAddresseDestination(String addresseDestination) {
		this.addresseDestination = addresseDestination;
	}

	public String getAddresseDepart() {
		return addresseDepart;
	}

	public void setAddresseDepart(String addresseDepart) {
		this.addresseDepart = addresseDepart;
	}

	public String getVilleDestination() {
		return villeDestination;
	}

	public void setVilleDestination(String villeDestination) {
		this.villeDestination = villeDestination;
	}

	public String getVilleDepart() {
		return villeDepart;
	}

	public void setVilleDepart(String villeDepart) {
		this.villeDepart = villeDepart;
	}

	public int getHeureDepart() {
		return heureDepart;
	}

	public void setHeureDepart(int heureDepart) {
		this.heureDepart = heureDepart;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	/* ToString */
	public String toString() {
		return "Trajet "+
				"\n Addresse Destination : " + addresseDestination + 
				"\n Addresse Depart : " + addresseDepart + 
		 		"\n Ville Destination : " + villeDestination + 
				"\n Ville Depart : " + villeDepart + 
				"\n Heure Depart : " + heureDepart + 
				"\n Description : " + description;
	}
	
	
	
	
	
	
}
