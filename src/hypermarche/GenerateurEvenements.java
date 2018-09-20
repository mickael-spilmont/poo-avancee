package hypermarche;

import java.util.Random;

/**
 * Génèrateur d'événement qui rempli le journal avec des evenements
 * @author spilmonm
 *
 */
public class GenerateurEvenements {

	/**
	 * Génère des évènements qui se produisent avec un délais fixe ( exemple : tout les 7 unité de temps ) sur une plage donnée, et les
	 * ajoutes au journal
	 * @param magasin
	 * @param fin
	 * @param delais
	 */
    public GenerateurEvenements(Magasin magasin, int fin, int delais) {
        for (int i = 1 ; i <= fin ; i += delais) {
        	magasin.getJournal().ajouter(new ArriveeClient(i, magasin));
        }
    }   
}
