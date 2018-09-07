package hypermarche;

import java.util.TreeSet;

public class Journal {
	private TreeSet<Evenement> evenementsSet;
	private static Journal singleton = new Journal();
	
	private Journal() {
		this.evenementsSet = new TreeSet<>();
	}
	
	public static Journal getSingleton() {
		return singleton;
	}
	
	public boolean ajouter(Evenement evenement) {
		return evenementsSet.add(evenement);
	}
	
	public boolean estVide() {
		return evenementsSet.isEmpty();
	}
	
	public Evenement retirer() {
		return evenementsSet.pollFirst();
	}
}
