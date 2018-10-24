package factory;

public class Tableau {
	Number[] tableau;
	
	public Tableau(int taille) {
		tableau = new Number[taille];
	}
	
	public boolean set(int i, Number n) {
		if (i >= 0 && i < tableau.length ) {
			tableau[i] = n;
			return true;
		}
		return false;
	}
	
	public boolean estVide() {
		return tableau.length == 0;
	}
	
	public Number max() {
		if (estVide()) {
			return null;
		}
		
		Number max = tableau[0];
		for (Number n : tableau) {
			if (n.doubleValue() > max.doubleValue()) {
				max = n;
			}
		}
		return max;
	}
}
