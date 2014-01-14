package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Kyo
 * @version 
 */

public class Membre implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String pseudo;
	private String nom;
	private String prenom;
	private String adresse;
	private String email;
	private String telephone;
	
	private List<Trajet> trajets;
	private List<Trajet> trajetsConducteur;
	private List<Voiture> voitures;
	
	/**
	 * Liste des attributs nécessaires à la création d'un membre
	 * @param pseudo Pseudo de l'utilisateur
	 * @param nom Nom de l'utilisateur
	 * @param prenom Prénom de l'utilisateur
	 * @param adresse Adresse de l'utilisateur
	 * @param email Email de l'utilisateur
	 * @param telephone Téléphone de l'utilisateur
	 */
	
	public Membre(String pseudo, String nom, String prenom, String adresse, String email, String telephone) {
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.email = email;
		this.telephone = telephone;
		this.trajets = new ArrayList<Trajet>();
		this.trajetsConducteur = new ArrayList<Trajet>();
		this.voitures = new ArrayList<Voiture>();
	}
	
	/**
	 * 
	 * @param trajet
	 */
	
	public void participerTrajet(Trajet trajet) {
		trajets.add(trajet);
	}
	
	/**
	 * 
	 * @return
	 */
	
	public String getPseudo() {
		return pseudo;
	}
	
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public List<Trajet> getTrajets() {
		return trajets;
	}

	public void setTrajets(List<Trajet> trajets) {
		this.trajets = trajets;
	}

	public List<Trajet> getTrajetsConducteur() {
		return trajetsConducteur;
	}

	public void setTrajetsConducteur(List<Trajet> trajetsConducteur) {
		this.trajetsConducteur = trajetsConducteur;
	}

	public List<Voiture> getVoitures() {
		return voitures;
	}

	public void setVoitures(List<Voiture> voitures) {
		this.voitures = voitures;
	}
	
}
