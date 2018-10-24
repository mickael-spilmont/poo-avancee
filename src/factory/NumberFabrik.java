package factory;

public class NumberFabrik {
	public static Number number(int n) {
		return new Integer(n);
	}
	
	public static Number number(float n) {
		return new Float(n);
	}
	
	public static Number number(double n) {
		return new Double(n);
	}
	
	public static Number number(int numerateur, int denominateur) {
		return new Fraction(numerateur, denominateur);
	}
}
