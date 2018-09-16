package hypermarche;

public abstract class Evenement implements Comparable<Evenement>{
	protected int date;
	protected Magasin magasin;
	
	public Evenement(int date, Magasin magasin) {
		this.date = date;
		this.magasin = magasin;
	}
	
	abstract void execute();

	@Override
	public int compareTo(Evenement o) {
		return (this.date - o.date);
	}

	public String toString() {
		return "Magasin : " + magasin + " date : " + date;
	}
}
