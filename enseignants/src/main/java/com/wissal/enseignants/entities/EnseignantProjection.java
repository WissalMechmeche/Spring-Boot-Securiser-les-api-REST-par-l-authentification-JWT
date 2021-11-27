package com.wissal.enseignants.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomEnsg", types = { Enseignant.class })
public interface EnseignantProjection {
	public String getNomEnseignant();

}
