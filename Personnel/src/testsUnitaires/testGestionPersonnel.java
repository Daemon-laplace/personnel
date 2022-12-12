package testsUnitaires;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import personnel.*;


class testGestionPersonnel {
	
	GestionPersonnel gestionPersonnel = GestionPersonnel.getGestionPersonnel();
	
	@Test 
	void TestGetLigue() throws SauvegardeImpossible
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		Employe employe = ligue.addEmploye ("Bouchard", "Gérard", "g.bouchard@gmail.com", "azerty");
		ligue.setAdministrateur(employe);
		assertEquals(ligue, employe.getLigue());
	}
	
	@Test
	void TestGetLigues() throws SauvegardeImpossible
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		assertNotNull(gestionPersonnel.getLigues());
	}
	
	@Test
	void TestAddLigue() throws SauvegardeImpossible
	{
		gestionPersonnel.addLigue("Fléchettes");
		assertNotNull(gestionPersonnel.getLigues());
	}
}