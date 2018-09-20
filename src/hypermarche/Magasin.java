package hypermarche;

import java.util.ArrayList;

public class Magasin {
	private String nom;
	private Journal journal;
	private ArrayList<Client> listeClients;
	
	public Magasin(String nom, Journal journal) {
	    this.nom = nom;
		this.journal = journal;
		listeClients = new ArrayList<>();
	}
	
	public void ajouterClient(Client client) {
		listeClients.add(client);
	}
	
	public boolean retirerClient(Client client) {
		return listeClients.remove(client);
	}

	public Journal getJournal() {
		return journal;
	}

	public String toString() {
	    return nom;
    }
	
//	public int effect
}
