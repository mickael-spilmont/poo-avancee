package hypermarche;

public abstract class Evenement implements Comparable<Evenement>{
	protected int date;
	protected Magasin magasin;
	
	public Evenement(int date, Magasin magasin) {
		this.date = date;
		this.magasin = magasin;
	}
	
	abstract void execute();

	/**
	 * Méthode compareTo modifiée afin de prendre en compte les dates, si les date sont les même, on compare le hashcode
	 * des objets afin de vérifier qu'il sont bien différent ( mais ont la même date ) 
	 */
	@Override
	public int compareTo(Evenement o) {
		if ( this.date - o.date == 0 ) {
			return this.hashCode() - o.hashCode();
		}
		return (this.date - o.date);
	}

	public String toString() {
		return "Magasin : " + magasin + "\tdate : " + date;
	}
}
