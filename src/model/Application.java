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
	
	public void ajouterMembre(Membre membreChoix) {
    	if(membreChoix != null){
    		membres.add(membreChoix);
    		System.out.println("Le membre : " + membreChoix.getPseudo() + " a été ajouté.");
    	}else{
    		System.out.println("Le membre n'existe pas.");
    	}
	}
	
	public void viderListeMembre() {
		membres.clear();
		System.out.println("La liste des membres a été vidée.");
	}
	
	public Membre rechercheMembre(){
    	//Demande du pseudo du membre, si il existe, alors la méthode retourne le membre
    	String pseudo = Affichage.demanderMembre();
    	//Pour chaque membre dans la liste
    	for(Membre membre : membres) {
	        //On test si le pseudo (String) correspond a l'un d'entre eux
	        if(pseudo.equals(membre.getPseudo())){
	        	return membre;
	        }
    	}
		return null;
	}
	
    public void modifierMembre(){
    	Affichage.afficherModifierMembre(rechercheMembre());
    }
    
    public void ajouterTrajet(){
    	Affichage.afficherAjouterTrajet(rechercheMembre());
    	System.out.println("Le trajet a été ajouter.");
    }
    
    public void viderTrajet(){
    	rechercheMembre().viderListeTrajets();
		System.out.println("Liste des trajets vidée.");
    }
    
}

