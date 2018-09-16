package hypermarche;

public class DepartClient extends Evenement {
    private Client client;

    public DepartClient(int date, Magasin magasin, Client client) {
        super(date, magasin);
        this.client = client;
    }

    public void execute() {
        // Todo
    }

    public String toString() {
        return super.toString() + "\nDépart du client " + client + "\n";
    }
}
