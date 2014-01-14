package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Kyo (Hennache Johan)
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
	 * @return Retourne le pseudo du membre.
	 */
	
	public String getPseudo() {
		return pseudo;
	}
	
	/**
	 * Prends en paramètre le pseudo.
	 * @param pseudo
	 */
	
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	
	/**
	 * 
	 * @return Retourne le nom du membre.
	 */

	public String getNom() {
		return nom;
	}
	
	/**
	 * Prends en paramètre le nom.
	 * @param nom
	 */

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * 
	 * @return Retourne le Prénom du membre.
	 */
	
	public String getPrenom() {
		return prenom;
	}
	
	/**
	 * Prends en paramètre le prénom.
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	/**
	 * 
	 * @return Retourne l'adresse du membre.
	 */
	
	public String getAdresse() {
		return adresse;
	}
	
	/**
	 * Prends en paramètre l'adresse.
	 * @param adresse
	 */
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	/**
	 * 
	 * @return Retourne l'email du membre.
	 */

	public String getEmail() {
		return email;
	}
	
	/**
	 * Prends en paramètre l'email.
	 * @param email
	 */

	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * 
	 * @return Retourne le téléphone du membre.
	 */

	public String getTelephone() {
		return telephone;
	}
	
	/**
	 * Prend en paramètre le téléphone.
	 * @param telephone
	 */

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	/**
	 * 
	 * @return Retourne les trajets du membre.
	 */

	public List<Trajet> getTrajets() {
		return trajets;
	}
	
	/**
	 * Prends en paramètre les trajets.
	 * @param trajets
	 */

	public void setTrajets(List<Trajet> trajets) {
		this.trajets = trajets;
	}
	
	/**
	 * 
	 * @return Retourne les trajets du membre conducteur.
	 */

	public List<Trajet> getTrajetsConducteur() {
		return trajetsConducteur;
	}
	
	/**
	 * Prends en paramètre les trajets des conducteurs.
	 * @param trajetsConducteur
	 */

	public void setTrajetsConducteur(List<Trajet> trajetsConducteur) {
		this.trajetsConducteur = trajetsConducteur;
	}
	
	/**
	 * 
	 * @return Retourne les voitures des membres
	 */

	public List<Voiture> getVoitures() {
		return voitures;
	}
	
	/**
	 * Prends en paramètre les voitures.
	 * @param voitures
	 */

	public void setVoitures(List<Voiture> voitures) {
		this.voitures = voitures;
	}
	
}
