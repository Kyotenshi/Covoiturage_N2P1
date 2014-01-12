package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Trajet implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String adresseDepart;
	private String adresseArrivee;
	private String description;
	private Date heureDepart;
	private int nbPlace;
	private Membre conducteur;
	
	private List<Membre> participants;
	private Voiture voiture;
	
	public Trajet(String adresseDepart, String adresseArrivee, String description,
			Date heureDepart, int nbPlace, Membre conducteur, Voiture voiture) {
		this.adresseDepart = adresseDepart;
		this.adresseArrivee = adresseArrivee;
		this.description = description;
		this.heureDepart = heureDepart;
		this.nbPlace = nbPlace;
		this.conducteur = conducteur;
		this.voiture = voiture;
		participants = new ArrayList<Membre>();
	}

	public String getAdresseDepart() {
		return adresseDepart;
	}

	public void setAdresseDepart(String adresseDepart) {
		this.adresseDepart = adresseDepart;
	}

	public String getAdresseArrivee() {
		return adresseArrivee;
	}

	public void setAdresseArrivee(String adresseArrivee) {
		this.adresseArrivee = adresseArrivee;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getHeureDepart() {
		return heureDepart;
	}

	public void setHeureDepart(Date heureDepart) {
		this.heureDepart = heureDepart;
	}

	public int getNbPlace() {
		return nbPlace;
	}

	public void setNbPlace(int nbPlace) {
		this.nbPlace = nbPlace;
	}

	public Membre getConducteur() {
		return conducteur;
	}

	public void setConducteur(Membre conducteur) {
		this.conducteur = conducteur;
	}

	public List<Membre> getParticipants() {
		return participants;
	}

	public void setParticipants(List<Membre> participants) {
		this.participants = participants;
	}

	public Voiture getVoiture() {
		return voiture;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}
	
	public int getNbPlacesDispo() {
		return nbPlace - participants.size();
	}
	
	public void inscription(Membre membre) {
		if(getNbPlacesDispo() > 0) {
			participants.add(membre);
			membre.participerTrajet(this);
		}
	}

}
