package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import View.Affichage;

/**
 * 
 * @author Kyo (Hennache Johan)
 *
 */


public class Application implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<Membre> membres;

	public Application() {
		membres = new ArrayList<Membre>();
	}
	
	public List<Membre> getMembres() {
		return membres;
	}
	
	public void ajouterMembre(Membre membre) {
		membres.add(membre);
	}
	
	
    public void modifierMembre(){
    	//Demande du pseudo du membre, si il exsite, alors la methode retourne le pseudo du membre sous forme de String
    	String pseudo = Affichage.demanderMembre();
	
    	//Pour chaque membres dans la liste
    	for(Membre membre : membres) {
	        //On test si le pseudo (String) correspond a l'un d'entre eux
	        if(pseudo.equals(membre.getPseudo())){
	                System.out.println("Le membre existe !");
	        Affichage.afficherModifierMembre(membre);
	        }
    	}
    }
    
    public void ajouterTrajet(){
		//Demande du pseudo du membre, si il exsite, alors la methode retourne le pseudo du membre sous forme de String
		String pseudo = Affichage.demanderMembre();
		
		//Pour chaque membres dans la liste
		for(Membre membre : membres) {
		        //On test si le pseudo (String) correspond a l'un d'entre eux
		        if(pseudo.equals(membre.getPseudo())){
		                System.out.println("Le membre existe !");
		        Affichage.afficherAjouterTrajet(membre);
		    }
		}
    }
    
    
    
}

