package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import View.Affichage;

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
	
	public boolean estExistant(){
        
        String pseudo = Affichage.demanderMembre();

        for(Membre membre : membres) {
               
                System.out.println(pseudo);
                System.out.println(membre.getPseudo());
                if(pseudo.equals(membre.getPseudo())){
                        return true;
                }
        }
        return false;
}
}
