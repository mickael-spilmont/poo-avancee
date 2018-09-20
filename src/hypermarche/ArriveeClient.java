package hypermarche;

/**
 * Classe d'evenement qui simule l'arrivé d'un client, c'est elle qui génère le nouveau client
 * @author Mickael Spilmont
 *
 */
public class ArriveeClient extends Evenement {
    private Client client;

    /**
     * Le constructeur qui prend une date et un magasin en paramètre, et créer le client
     * @param date
     * @param magasin
     */
    public ArriveeClient(int date, Magasin magasin) {
        super(date, magasin);
    }

	public void execute() {
		this.client = new Client(magasin, date);
		magasin.ajouterClient(client);
		System.out.println(this.toString());
    }

    public String toString() {
        return super.toString() + "\nArrivée du client " + client.hashCode() + "\n";
    }
}
