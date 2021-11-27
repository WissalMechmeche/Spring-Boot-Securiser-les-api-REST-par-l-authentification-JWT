package com.wissal.enseignants;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.wissal.enseignants.entities.Departement;
import com.wissal.enseignants.entities.Enseignant;
import com.wissal.enseignants.repos.EnseignantRepository;

@SpringBootTest
class EnseignantsApplicationTests {
	@Autowired
	private EnseignantRepository enseignantRepository;
	@Test
	public void testCreateEnseignant() {
	Enseignant ensg = new Enseignant("Salma",3000.0,new Date());
	enseignantRepository.save(ensg);
	}
	
	@Test
	public void testFindEnseignant()
	{
	Enseignant e = enseignantRepository.findById(1L).get(); 
	System.out.println(e);
	}
	
	@Test
	public void testUpdateEnseignant()
	{
	Enseignant e = enseignantRepository.findById(1L).get();
	e.setSalaire(1000.0);
	enseignantRepository.save(e);
	}
	
	@Test
	public void testDeleteEnseignant()
	{
	enseignantRepository.deleteById(1L);;
	}
	
	@Test
	public void testListerTousEnseignants()
	{
	List<Enseignant> ensgs = enseignantRepository.findAll();
	for (Enseignant e : ensgs)
	{
	System.out.println(e);
	}
	}
	
	@Test
	public void testFindByNom()
	{
	List<Enseignant> ensgs = enseignantRepository.findByNomEnseignant("Ali");

	for (Enseignant e : ensgs)
	{
	System.out.println(e);
	}
	}
	
	@Test
	public void testFindByNomEnseignantContains ()
	{
	List<Enseignant> ensgs=enseignantRepository.findByNomEnseignantContains("Salma");

	for (Enseignant e : ensgs)
	{
	System.out.println(e);
	} 
	}
	
	@Test
	public void testfindByNomSalaire()
	{
	List<Enseignant> ensgs = enseignantRepository.findByNomSalaire("Ali", 2200.5);
	for (Enseignant e : ensgs)
	{
	System.out.println(e);
	}
	}
	
	@Test
	public void testfindByDepartement()
	{
	Departement dep = new Departement();
	dep.setIdDep(1L);
	List<Enseignant> ensgs = enseignantRepository.findByDepartement(dep);
	for( Enseignant e : ensgs)
	{
		System.out.println(e);
	}
	}
	
	@Test
	public void findByDepartementIdCat()
	{
	List<Enseignant> ensgs = enseignantRepository.findByDepartementIdDep(1L);
	for (Enseignant e : ensgs)
	{
	System.out.println(e);
	}
	}
	
	
	@Test
	public void testfindByOrderByNomEnseignantAsc()
	{
	List<Enseignant> ensgs =enseignantRepository.findByOrderByNomEnseignantAsc();
	for (Enseignant e : ensgs)
	{
	System.out.println(e);
	}
	}
	
	
	
	@Test
	public void testTrierEnseignantsNomsSalaires()
	{
	List<Enseignant> ensgs = enseignantRepository.trierEnseignantsNomsSalaires();
	for (Enseignant e : ensgs)
	{
	System.out.println(e);
	}	
	}
	
}
