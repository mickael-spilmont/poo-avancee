package hypermarche;

public abstract class Evenement implements Comparable<Evenement>{
	protected int date;
	
	public Evenement(int date) {
		this.date = date;
	}
	
	abstract void execute();

	@Override
	public int compareTo(Evenement o) {
		return (this.date - o.date);
	}

	public String toString() {
		return "" + date;
	}
}
