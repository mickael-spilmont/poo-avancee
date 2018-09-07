package hypermarche;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestJournal {

	@Test
	void journalVide() {
		Journal journal = Journal.getSingleton();
		assertEquals(true, journal.estVide());
	}

}
