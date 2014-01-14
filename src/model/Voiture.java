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
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}