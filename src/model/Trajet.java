package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Kyo 
 *
 */

public class Trajet implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String adresseDepart;
	private String adresseArrivee;
	private String description;
	private String heureDepart;
	private int nbPlace;
	private Membre conducteur;
	
	private List<Membre> participants;
	private Voiture voiture;
	
	/**
	 * Liste des attributs nécessaires à la création d'un trajet
	 * @param adresseDepart Adresse de départ du trajet
	 * @param adresseArrivee Adresse d'arrivée du trajet
	 * @param description Description d'un trajet
	 * @param heureDepart Heure de départ du trajet
	 * @param nbPlace Nombre de places disponibles dans un trajet
	 * @param conducteur Nom du conducteur du trajet
	 * @param voiture Voiture du conducteur du trajet
	 */
	
	public Trajet(String adresseDepart, String adresseArrivee, String description,
			String heureDepart, int nbPlace, Membre conducteur, Voiture voiture) {
		this.adresseDepart = adresseDepart;
		this.adresseArrivee = adresseArrivee;
		this.description = description;
		this.heureDepart = heureDepart;
		this.nbPlace = nbPlace;
		this.conducteur = conducteur;
		this.voiture = voiture;
		participants = new ArrayList<Membre>();
	}

	/**
	 * Prend l'adresse de départ.
	 * @return Retourne l'adresse de départ.
	 */
	
	public String getAdresseDepart() {
		return adresseDepart;
	}
	
	/**
	 * Prends en paramètre l'adresse de départ.
	 * @param adresseDepart
	 */

	public void setAdresseDepart(String adresseDepart) {
		this.adresseDepart = adresseDepart;
	}
	
	/**
	 * Prends l'adresse d'arrivée.
	 * @return Retourne l'adresse d'arrivée.
	 */

	public String getAdresseArrivee() {
		return adresseArrivee;
	}
	
	/**
	 * Prends en paramètre l'adresse d'arrivée.
	 * @param adresseArrivee
	 */

	public void setAdresseArrivee(String adresseArrivee) {
		this.adresseArrivee = adresseArrivee;
	}
	
	/**
	 * Prend en compte la description du trajet.
	 * @return la description du trajet.
	 */

	public String getDescription() {
		return description;
	}
	
	/**
	 * Prends en paramètre la description du trajet.
	 * @param description
	 */

	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Prends l'heure de départ.
	 * @return Retourne l'heure de départ.
	 */

	public String getHeureDepart() {
		return heureDepart;
	}
	
	/**
	 * Prends en paramètre l'heure de départ.
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
	 * Prends en paramètre le nombre de places.
	 * @param nbPlace
	 */

	public void setNbPlace(int nbPlace) {
		this.nbPlace = nbPlace;
	}
	
	/**
	 * Prends le conducteur.
	 * @return Retourne le nom du membre conducteur.
	 */

	public Membre getConducteur() {
		return conducteur;
	}
	
	/**
	 * Prends en paramètre le conducteur.
	 * @param conducteur
	 */

	public void setConducteur(Membre conducteur) {
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
	 * Prends en paramètre la liste de participants. 
	 * @param participants
	 */

	public void setParticipants(List<Membre> participants) {
		this.participants = participants;
	}
	
	/**
	 * Prends la voiture.
	 * @return Retourne la voiture du trajet.
	 */

	public Voiture getVoiture() {
		return voiture;
	}
	
	/**
	 * Prends en paramètre la voiture.
	 * @param voiture
	 */

	public void setVoiture(Voiture voiture) {
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
	 * Prends en paramètres l'inscription du membre.
	 * @param membre
	 */
	
	public void inscription(Membre membre) {
		if(getNbPlacesDispo() > 0) {
			participants.add(membre);
			membre.participerTrajet(this);
		}
	
	}

}
