package model;
import java.util.Scanner;


public class Membre implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nom;
	private String prenom;
	private String adresse;
	private String mail;
	private int telephone;
	private String preference;
	private String role;
	
	/* Classe Membre Vide*/
	public Membre(){
		this.nom = "[Non definie]";
		this.prenom = "[Non definie]";
		this.adresse = "[Non definie]";
		this.mail = "[Non definie]";
		this.telephone = -1;
		this.preference = "[Non definie]";
		this.role = "[Non definie]";
	}
	
	
	/* Classe Membre Non Vide*/	
	public Membre(String nom, String prenom, String adresse, String mail, int telephone, String preference, String role){
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.mail = mail;
		this.telephone = telephone;
		this.preference = preference;
		this.role = role;
	}
	
	
	
	/* Methode d'edition de Membre */
	public void editionMembre(){
		Scanner clavier = new Scanner(System.in);

		System.out.println("Nom : ");
		String nom = clavier.nextLine();
		setNom(nom);
		
		System.out.println("Prenom : ");
		String prenom = clavier.nextLine();
		setPrenom(prenom);
		
		System.out.println("Adresse : ");
		String adresse = clavier.nextLine();
		setAdresse(adresse);
		
		System.out.println("Mail : ");
		String mail = clavier.nextLine();
		setMail(mail);

		System.out.println("Preference : ");
		String preference = clavier.nextLine();
		setPreference(preference);
		
		System.out.println("Role : ");
		String role = clavier.nextLine();
		setRole(role);
		
		System.out.println("Telephone : ");
		int telephone = clavier.nextInt();
		setTelephone(telephone);
		
		clavier.close();

	}

	/* Getters Setters */
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public String getPreference() {
		return preference;
	}

	public void setPreference(String preference) {
		this.preference = preference;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
 
	/* ToString */
	public String toString() {
		return "Membre "+
				"\n Nom : " + nom + 
				"\n Prenom : " + prenom + 
				"\n Adresse : " + adresse + 
				"\n Mail : " + mail + 
				"\n Telephone : " + telephone + 
				"\n Preference : " + preference + 
				"\n Role : " + role;
	}
	
}
