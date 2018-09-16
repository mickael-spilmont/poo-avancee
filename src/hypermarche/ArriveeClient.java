package hypermarche;

public class ArriveeClient extends Evenement {
    private Client client;

    public ArriveeClient(int date, Magasin magasin, Client client) {
        super(date, magasin);
        this.client = client;
    }

    public void execute() {
        // Todo
    }

    public String toString() {
        return super.toString() + "\nArrivée du client " + client + "\n";
    }
}
