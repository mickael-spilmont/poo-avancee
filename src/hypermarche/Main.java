package hypermarche;

public class Main {

	public static void main(String[] args) {
		Journal journal = new Journal();
		Magasin magasin = new Magasin("Le Furet du Nord", journal);
		new GenerateurEvenements(magasin, 100, 7);

		for (Evenement evenement : journal.getEvenementsSet()) {
			evenement.execute();
		}
	}

}
