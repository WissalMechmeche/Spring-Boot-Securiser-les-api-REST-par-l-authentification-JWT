package com.wissal.enseignants.restcontrollers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.wissal.enseignants.entities.Enseignant;
import com.wissal.enseignants.service.EnseignantService;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class EnseignantRESTController {
	@Autowired
	EnseignantService enseignantService;
	@RequestMapping(path="all" ,method = RequestMethod.GET)
	public List<Enseignant> getAllEnseignants() {
	return enseignantService.getAllEnseignants();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Enseignant getEnseignantById(@PathVariable("id") Long id) {
	return enseignantService.getEnseignant(id);
	 }
	@RequestMapping(method = RequestMethod.POST)
	public Enseignant createEnseignant(@RequestBody Enseignant enseignant) {
	return enseignantService.saveEnseignant(enseignant);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Enseignant updateProduit(@RequestBody Enseignant enseignant) {
	return enseignantService.updateEnseignant(enseignant);
	}
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteEnseignant(@PathVariable("id") Long id)
	{
	enseignantService.deleteEnseignantById(id);
	}
	
	@RequestMapping(value="/ensgsdep/{idDepartement}",method = RequestMethod.GET)
	public List<Enseignant> getEnseignantsByDepId(@PathVariable("idDepartement") Long idDepartement) {
	return enseignantService.findByDepartementIdDep(idDepartement);
	}
}
