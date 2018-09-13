package hypermarche;

import java.util.Random;

public class Client {
	private Magasin magasin;
	private int dateEntree;
	private int dateSortie;
	
	public Client(Magasin magasin, int date) {
		this.magasin = magasin;
		this.dateEntree = date;
		
		Random random = new Random();
		this.dateSortie =  random.nextInt(101 - dateEntree) + dateEntree;
	}
}
