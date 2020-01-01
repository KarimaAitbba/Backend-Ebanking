package com.service.administration.services;

import com.service.administration.models.Bo;
import com.service.administration.repository.AgenceRepository;
import com.service.administration.repository.ChargeClienteleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChargeClienteleService implements  ChargeClienteleServiceI {

    @Autowired
    ChargeClienteleRepository chargeClienteleRepository;
    
    @Autowired
    AgenceRepository agenceRepository;

    @Override
    public Bo saveChargeClientele(Bo chargeClientel) {
        return chargeClienteleRepository.save(chargeClientel);
    }

    @Override
    public Bo getChargeClientele(long id) {
        return chargeClienteleRepository.getOne(id);
    }

    @Override
    public List<Bo> getChargeClienteles() {
        return chargeClienteleRepository.findAll();
    }

    @Override
    public Bo updateChargeClientele(Bo chargeClientel) {
        return chargeClienteleRepository.save(chargeClientel);
    }

    @Override
    public void deleteChargeClientele(long id) {
        chargeClienteleRepository.deleteById(id);
    }

	@Override
	public long getNumberOfBo(Long idAgence) {
		return chargeClienteleRepository.countBoByAgence(agenceRepository.getOne(idAgence));
	}

	@Override
	public Long getNumberofAllBos() {
		return chargeClienteleRepository.count();
	}
}
