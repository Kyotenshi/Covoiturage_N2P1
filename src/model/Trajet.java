package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Kyo (Hennache Johan)
 * @author Kotasan (Ghesquiere Jerome)
 * 
 */

public class Trajet implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String villeDepart;
	private String villeArrivee;
	private String description;
	private String heureDepart;
	private int nbPlace;
	private String conducteur;
	
	private List<Membre> participants;
	private String voiture;
	
	/**
	 * Liste des attributs n�cessaires � la cr�ation d'un trajet
	 * @param villeDepart Adresse de d�part du trajet
	 * @param villeArrivee Adresse d'arriv�e du trajet
	 * @param description Description d'un trajet
	 * @param heureDepart Heure de d�part du trajet
	 * @param heureArrivee 
	 * @param nbPlace Nombre de places disponibles dans un trajet
	 * @param conducteur Nom du conducteur du trajet
	 * @param voiture Voiture du conducteur du trajet
	 */
	
	public Trajet(String villeDepart, String villeArrivee, String description,
			String heureDepart, String heureArrivee, int nbPlace, String conducteur, String voiture) {
		this.villeDepart = villeDepart;
		this.villeArrivee = villeArrivee;
		this.description = description;
		this.heureDepart = heureDepart;
		this.nbPlace = nbPlace;
		this.conducteur = conducteur;
		this.voiture = voiture;
		participants = new ArrayList<Membre>();
	}

	@Override
	public String toString() {
		return "Trajet [villeDepart=" + villeDepart + ", villeArrivee="
				+ villeArrivee + ", description=" + description
				+ ", heureDepart=" + heureDepart + ", nbPlace=" + nbPlace
				+ ", conducteur=" + conducteur + ", participants="
				+ participants + ", voiture=" + voiture + "]";
	}

	/**
	 * Prend l'adresse de d�part.
	 * @return Retourne l'adresse de d�part.
	 */
	
	public String getvilleDepart() {
		return villeDepart;
	}
	
	/**
	 * Prends en param�tre l'adresse de d�part.
	 * @param villeDepart
	 */

	public void setvilleDepart(String villeDepart) {
		this.villeDepart = villeDepart;
	}
	
	/**
	 * Prends l'adresse d'arriv�e.
	 * @return Retourne l'adresse d'arriv�e.
	 */

	public String getvilleArrivee() {
		return villeArrivee;
	}
	
	/**
	 * Prends en param�tre l'adresse d'arriv�e.
	 * @param villeArrivee
	 */

	public void setvilleArrivee(String villeArrivee) {
		this.villeArrivee = villeArrivee;
	}
	
	/**
	 * Prend en compte la description du trajet.
	 * @return la description du trajet.
	 */

	public String getDescription() {
		return description;
	}
	
	/**
	 * Prends en param�tre la description du trajet.
	 * @param description
	 */

	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Prends l'heure de d�part.
	 * @return Retourne l'heure de d�part.
	 */

	public String getHeureDepart() {
		return heureDepart;
	}
	
	/**
	 * Prends en param�tre l'heure de d�part.
	 * @param heureDepart
	 */

	public void setHeureDepart(String heureDepart) {
		this.heureDepart = heureDepart;
	}
	
	/**
	 * Prends le nombre de place
	 * @return Retourne le nombre de place.
	 */

	public int getNbPlace() {
		return nbPlace;
	}
	
	/**
	 * Prends en param�tre le nombre de places.
	 * @param nbPlace
	 */

	public void setNbPlace(int nbPlace) {
		this.nbPlace = nbPlace;
	}
	
	/**
	 * Prends le conducteur.
	 * @return Retourne le nom du membre conducteur.
	 */

	public String getConducteur() {
		return conducteur;
	}
	
	/**
	 * Prends en param�tre le conducteur.
	 * @param conducteur
	 */

	public void setConducteur(String conducteur) {
		this.conducteur = conducteur;
	}
	
	/**
	 * Prends la liste de participants.
	 * @return Retourne les membres participants.
	 */

	public List<Membre> getParticipants() {
		return participants;
	}
	
	/**
	 * Prends en param�tre la liste de participants. 
	 * @param participants
	 */

	public void setParticipants(List<Membre> participants) {
		this.participants = participants;
	}
	
	/**
	 * Prends la voiture.
	 * @return Retourne la voiture du trajet.
	 */

	public String getVoiture() {
		return voiture;
	}
	
	/**
	 * Prends en param�tre la voiture.
	 * @param voiture
	 */

	public void setVoiture(String voiture) {
		this.voiture = voiture;
	}
	
	/**
	 * Prends le nombre de places dispo.
	 * @return Retourne le nombre de places disponibles.
	 */
	
	public int getNbPlacesDispo() {
		return nbPlace - participants.size();
	}
	
	/**
	 * Prends en param�tres l'inscription du membre.
	 * @param membre
	 */
	
	public void inscription(Membre membre) {
		if(getNbPlacesDispo() > 0) {
			participants.add(membre);
			membre.participerTrajet(this);
		}
	
	}

}
