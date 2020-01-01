package org.sid.service_compte.services;

import java.util.List;

import org.sid.service_compte.dao.AbonneRepository;
import org.sid.service_compte.dao.ContratRepository;
import org.sid.service_compte.entities.Abonne;
import org.sid.service_compte.entities.Compte;
import org.sid.service_compte.entities.Contrat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AbonneeService {

	@Autowired
	AbonneRepository abonneRepository;
	@Autowired
	ContratRepository contratRepository;
	public List<Abonne> findAllAbonnee()
	{
        Iterable<Abonne> abonne= abonneRepository.findAll();
        return (List<Abonne>) abonne;
    }
	
	
	public Abonne insererAbonne(Abonne c) {
		Contrat c1  = new Contrat();
		c1.setObjectif(c.getContrat().getObjectif());
		c1.setBo(c.getContrat().getBo());
		c1.setDateexperation(c.getContrat().getDateexperation());
		contratRepository.save(c1);
		c.setContrat(c1);
		return abonneRepository.save(c);
	}
}
