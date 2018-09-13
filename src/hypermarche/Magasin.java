package hypermarche;

import java.util.ArrayList;

public class Magasin {
	private Journal journal;
	private ArrayList<Client> listeClients;
	
	public Magasin(Journal journal) {
		this.journal = journal;
		listeClients = new ArrayList<>();
	}
	
	public void ajouterClient(Client client) {
		listeClients.add(client);
	}
	
	public boolean retirerClient(Client client) {
		return listeClients.remove(client);
	}
	
//	public int effect
}
