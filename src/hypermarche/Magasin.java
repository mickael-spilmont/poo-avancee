package hypermarche;

import java.util.ArrayList;

/**
 * Cette classe simule un magasin, elle contiens une référence au journal et une arraylist de client
 * @author Mickael Spilmont
 *
 */
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
}
