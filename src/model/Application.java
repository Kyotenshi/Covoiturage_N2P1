package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
}
