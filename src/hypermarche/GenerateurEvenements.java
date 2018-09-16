package hypermarche;

import java.util.Random;

public class GenerateurEvenements {
    private Random random;
    private Magasin magasin;

    public GenerateurEvenements(Magasin magasin) {
        random = new Random();
        this.magasin = magasin;
    }

    public Evenement generer(int date) {
        int n = random.nextInt(10);

        if ( n < 5 ) {
            return new ArriveeClient(date, this.magasin, new Client(this.magasin, date));
        }
        return null;
    }
}
