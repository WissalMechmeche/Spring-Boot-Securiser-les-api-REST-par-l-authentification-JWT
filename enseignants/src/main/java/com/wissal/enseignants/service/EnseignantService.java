package com.wissal.enseignants.service;

import java.util.List;

import com.wissal.enseignants.entities.Departement;
import com.wissal.enseignants.entities.Enseignant;

public interface EnseignantService {
	
	Enseignant saveEnseignant(Enseignant e);
	Enseignant updateEnseignant(Enseignant e);
	void deleteEnseignant(Enseignant e);
	void deleteEnseignantById(Long id);
	Enseignant getEnseignant(Long id);
	List<Enseignant> getAllEnseignants();
	List<Enseignant> findByNomEnseignant(String nom);
	List<Enseignant> findByNomEnseignantContains(String nom);
	List<Enseignant> findByNomSalaire (String nom, Double salaire);
	List<Enseignant> findByDepartemnet (Departement departement);
	List<Enseignant> findByDepartementIdDep(Long id);
	List<Enseignant> findByOrderByNomEnseignantAsc();
	List<Enseignant> trierEnseignantsNomsSalaires();
}
