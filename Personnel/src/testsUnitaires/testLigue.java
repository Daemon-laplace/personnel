package testsUnitaires;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import personnel.*;

class testLigue 
{
	GestionPersonnel gestionPersonnel = GestionPersonnel.getGestionPersonnel();
	
	@Test
	void createLigue() throws SauvegardeImpossible
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		assertEquals("Fléchettes", ligue.getNom());
	}

	@Test
	void addEmploye() throws SauvegardeImpossible
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Gérard", "g.bouchard@gmail.com", "azerty"); 
		assertEquals(employe, ligue.getEmployes().first());
	}
	
	@Test
	void TestGetNom() throws SauvegardeImpossible
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		assertEquals("Fléchettes", ligue.getNom());
	}
	
	@Test
	void TestSetNom() throws SauvegardeImpossible
	{
		Ligue ligue = gestionPersonnel.addLigue("");
		ligue.setNom("Fléchettes");
		assertEquals("Fléchettes", ligue.getNom());
	}
	
	@Test
	void TestGetAdministrateur() throws SauvegardeImpossible
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		Employe admin = ligue.addEmploye("Thibaut", "Rongier", "t.rongier@gmail.com", "azerty");
		ligue.setAdministrateur(admin);
		assertEquals(admin, ligue.getAdministrateur());
	}
	
	@Test
	void TestSetAdministrateur() throws SauvegardeImpossible
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		Employe admin = ligue.addEmploye("Thibaut", "Rongier", "t.rongier@gmail.com", "test");
		ligue.setAdministrateur(admin);
		assertEquals(admin, ligue.getAdministrateur());
	}
	
	@Test
	void TestGetEmployes() throws SauvegardeImpossible
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Gérard", "g.bouchard@gmail.com", "azerty");
		Employe admin = ligue.addEmploye("Thibaut", "Rongier", "t.rongier@gmail.com", "test");
		assertEquals(employe, ligue.getEmployes().first());
		assertEquals(admin, ligue.getEmployes().last());
	}
	
	@Test
	void TestRemove() throws SauvegardeImpossible
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Gérard", "g.bouchard@gmail.com", "azerty");
		ligue.remove(employe);
		assertEquals(employe, ligue.getEmployes());
	}
	
	@Test
	void TestCompareTo() throws SauvegardeImpossible
	{
		
	}
	
	
}
