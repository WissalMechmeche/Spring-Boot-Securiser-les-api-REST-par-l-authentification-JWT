package com.wissal.enseignants.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.wissal.enseignants.entities.Departement;
import com.wissal.enseignants.entities.Enseignant;

@RepositoryRestResource(path ="rest")
public interface EnseignantRepository extends JpaRepository<Enseignant, Long> {
	List<Enseignant> findByNomEnseignant(String nom);
	List<Enseignant> findByNomEnseignantContains(String nom);
	
	/*@Query("select e from Enseignant e where e.nomEnseignant like %?1 and e.salaire >?2")
	List<Enseignant> findByNomSalaire(String nom , Double salaire);*/
	
	@Query("select e from Enseignant e where e.nomEnseignant like %:nom and e.salaire  >:salaire")
	List<Enseignant> findByNomSalaire(@Param("nom") String nom ,@Param("salaire") Double salaire);
	
	@Query("select e from Enseignant e where e.departement = ?1")
	List<Enseignant> findByDepartement(Departement departement);
	
	List<Enseignant> findByDepartementIdDep(Long id);
	
	List<Enseignant> findByOrderByNomEnseignantAsc();
	
	@Query("select e from Enseignant e order by e.nomEnseignant ASC, e.salaire DESC")
	List<Enseignant> trierEnseignantsNomsSalaires ();
	
	

}
