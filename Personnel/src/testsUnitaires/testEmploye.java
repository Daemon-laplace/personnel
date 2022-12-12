package testsUnitaires;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import personnel.*;

class testEmploye
{
	GestionPersonnel gestionPersonnel = GestionPersonnel.getGestionPersonnel();
	
	@Test
	void TestgetDateArrivee() throws SauvegardeImpossible
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Gérard", "g.bouchard@gmail.com", "azerty");
		assertEquals(LocalDate.now(), employe.getDateArrivee());
	}
	@Test
	void TestgetDateDepart() throws SauvegardeImpossible
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Gérard", "g.bouchard@gmail.com", "azerty", LocalDate.of(2022, 12, 20));
		assertEquals(LocalDate.of(2022, 12, 20), employe.getDateDepart());
	}
	@Test
	void TestsetDateDepart() throws SauvegardeImpossible
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Gérard", "g.bouchard@gmail.com", "azerty", LocalDate.of(2022, 12, 20));
		employe.setDateDepart(LocalDate.of(2023, 01, 23));
		assertEquals(LocalDate.of(2023, 01, 23), employe.getDateDepart());
	}
	
	@Test
	void TestestAdmin() throws SauvegardeImpossible
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Gérard", "g.bouchard@gmail.com", "azerty");
		ligue.setAdministrateur(employe);
		assertTrue(employe.estAdmin(ligue));
	}
//	@Test
//	void estRoot() throws SauvegardeImpossible
//	{
//		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
//		Employe employe = ligue.addEmploye("Bouchard", "Gérard", "g.bouchard@gmail.com", "azerty");
//		assertTrue(employe.estRoot());
//	}
	@Test
	void TestgetNom() throws SauvegardeImpossible
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Gérard", "g.bouchard@gmail.com", "azerty");
		assertEquals("Bouchard", employe.getNom());
	}
	@Test
	void TestsetNom() throws SauvegardeImpossible
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Gérard", "g.bouchard@gmail.com", "azerty");
		employe.setNom("Soucher");
		assertEquals("Soucher", employe.getNom());
	}
	@Test
	void TestgetPrenom() throws SauvegardeImpossible
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Gérard", "g.bouchard@gmail.com", "azerty");
		assertEquals("Gérard", employe.getPrenom());
	}
	@Test
	void TestsetPrenom() throws SauvegardeImpossible
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Gérard", "g.bouchard@gmail.com", "azerty");
		employe.setPrenom("Martin");
		assertEquals("Martin", employe.getPrenom());
	}
	@Test
	void TestgetMail() throws SauvegardeImpossible
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Gérard", "g.bouchard@gmail.com", "azerty");
		assertEquals("g.bouchard@gmail.com", employe.getMail());
	}
	@Test
	void TestsetMail() throws SauvegardeImpossible
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Gérard", "g.bouchard@gmail.com", "azerty");
		employe.setMail("m.soucher@gmail.com");
		assertEquals("m.soucher@gmail.com", employe.getMail());
	}
	@Test
	void TestcheckPassword() throws SauvegardeImpossible
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Gérard", "g.bouchard@gmail.com", "azerty");
		assertTrue(employe.checkPassword("azerty"));
	}
	@Test
	void TestsetPassword() throws SauvegardeImpossible
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Gérard", "g.bouchard@gmail.com", "azerty");
		employe.setPassword("qwerty");
		assertTrue(employe.checkPassword("qwerty"));
	}
	@Test
	void TestgetLigue()throws SauvegardeImpossible
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Gérard", "g.bouchard@gmail.com", "azerty");
		assertEquals(ligue, employe.getLigue());
	}
//	@Test
//	void remove() throws SauvegardeImpossible
//	{
//		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
//		Employe employe = ligue.addEmploye("Bouchard", "Gérard", "g.bouchard@gmail.com", "azerty");
//		ligue.setAdministrateur(employe);
//		employe.remove();
//		assertNotEquals(employe, ligue.getEmployes());
//	}
	@Test
	void TestcompareTo() throws SauvegardeImpossible
	{
		Ligue ligue = gestionPersonnel.addLigue("Bowling");
		Employe employe = ligue.addEmploye ("Bouchard", "Gérard", "g.bouchard@gmail.com", "azerty");
		Employe employe2 = ligue.addEmploye ("Bouchard", "Jean", "j.michel@gmail.com", "azerty");
		assertEquals(-3, employe.compareTo(employe2));
	}
//	@Test 
//	void ToString() throws SauvegardeImpossible
//	{
//		
//	}
//	
}