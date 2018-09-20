package hypermarche;

/**
 * Classe d'evenement qui simule l'arrivé d'un client, c'est elle qui génère le nouveau client
 * @author spilmonm
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
        this.client = new Client(magasin, date);
    }

    public Client getClient() {
		return client;
	}

	public void execute() {
        // Todo
    }

    public String toString() {
        return super.toString() + "\nArrivée du client " + client + "\n";
    }
}
