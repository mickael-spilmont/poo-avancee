package hypermarche;

import static org.junit.jupiter.api.Assertions.*;

class TestEvenement {

	@org.junit.jupiter.api.Test
	void comparerEvenements() {
		Evenement event01 = new EvenementSimple(10);
		Evenement event02 = new EvenementSimple(15);
		
		assertTrue(0 > event01.compareTo(event02));
	}
	
	@org.junit.jupiter.api.Test
	void evenementsEgaux() {
		Evenement event01 = new EvenementSimple(10);
		Evenement event02 = new EvenementSimple(10);
		
		assertTrue(0 == event01.compareTo(event02));
	}
}
