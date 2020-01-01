package org.sid.servicetransaction.service;

import java.util.List;

import org.sid.servicetransaction.dao.BeneficiareRepository;
import org.sid.servicetransaction.entities.Abonne;
import org.sid.servicetransaction.entities.Beneficiare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeneficiareService {

	@Autowired
	BeneficiareRepository beneficiareRepository;
	
	
		public List<Beneficiare> listBeneficiare(){
			return beneficiareRepository.findAll();
			
		}
		
		
		public List<Beneficiare> listBeneficiareByAbonne(Abonne a){
			return beneficiareRepository.findByAbonne(a);
		}
		
		
		public Beneficiare getBeneficiare(long id) {
			return beneficiareRepository.getOne(id);
		}
		
		
		
		public Beneficiare saveBeneficiare(Beneficiare beneficiare) {
	
			return beneficiareRepository.save(beneficiare);
		}
		
		
		public void deleteBeneficiare(long id) {
			Beneficiare b = beneficiareRepository.getOne(id);
			 beneficiareRepository.delete(b);
		}
		
}
