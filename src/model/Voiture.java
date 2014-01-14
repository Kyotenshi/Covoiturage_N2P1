package model;
import java.io.Serializable;

/**
 * 
 * @author Kyo
 *
 */

public class Voiture implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String nom;
	private String couleur;
	private String type;
	
	/**
	 * Liste des attributs nécessaires à  la création d'une voiture
	 * @param nom Nom de la voiture
	 * @param couleur Couleur de la voiture
	 * @param type Type de voiture
	 */

	public Voiture(String nom, String couleur, String type) {
		this.nom = nom;
		this.couleur = couleur;
		this.type = type;
	}
	
	/**
	 * 
	 * @return Retourne le nom de la voiture.
	 */
	
	public String getNom() {
		return nom;
	}
	
	/**
	 * Prend en paramètre le nom de la voiture.
	 * @param nom
	 */

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * 
	 * @return Retourne la couleur de la voiture.
	 */

	public String getCouleur() {
		return couleur;
	}
	
	/**
	 * Prend en paramètre la couleur du véhicule.
	 * @param couleur
	 */

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	/**
	 * 
	 * @return Retourne le type de voiture.
	 */

	public String getType() {
		return type;
	}
	
	/**
	 * Prends en paramètre le type de voiture.
	 * @param type
	 */

	public void setType(String type) {
		this.type = type;
	}

}