package com.service.administration.services;

import com.service.administration.models.Bo;

import java.util.List;

public interface ChargeClienteleServiceI {

    public Bo saveChargeClientele(Bo chargeClientel);
    public Bo getChargeClientele(long id);
    public List<Bo> getChargeClienteles();
    public Bo updateChargeClientele(Bo chargeClientel);
    public  void deleteChargeClientele(long id);
    
    public  long getNumberOfBo(Long idAgence);
    public  Long getNumberofAllBos();
}
