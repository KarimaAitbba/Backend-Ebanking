package com.service.administration.controller;

import com.service.administration.models.Bo;
import com.service.administration.services.ChargeClienteleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/admin")
@CrossOrigin
public class ChargeClientelApi {

    @Autowired
    private ChargeClienteleService chargeClienteleService;

    @RequestMapping(value="/charge-clientel",method = RequestMethod.POST)
    public Bo saveAgence(@RequestBody Bo chargeClientel) {
        return chargeClienteleService.saveChargeClientele(chargeClientel);
    }
    @RequestMapping(value="charge-clientel/{id}",method = RequestMethod.GET)
    public Bo getChargeClientel(@PathVariable long id) {
        return chargeClienteleService.getChargeClientele(id);
    }
    @RequestMapping(value="/charges-clientel",method = RequestMethod.GET)
    public List<Bo> getChargeClientels() {
        return chargeClienteleService.getChargeClienteles();
    }
    @RequestMapping(value="/charge-clientel",method = RequestMethod.PUT)
    public Bo updateAgence(@RequestBody Bo chargeClientel) {
        return  chargeClienteleService.updateChargeClientele(chargeClientel);

    }
    @RequestMapping(value="/charge-clientel/delete/{id}")
    public void deleteAgence(@PathVariable long id) {
        chargeClienteleService.deleteChargeClientele(id);
    }
    
    @RequestMapping(value="/charge-clientel/countBos/{id}")
    public Long countBosByAgence(@PathVariable long id) {
        return  chargeClienteleService.getNumberOfBo(id);
    }
    @RequestMapping(value="/charge-clientel/countBos")
    public Long countBos() {
        return  chargeClienteleService.getNumberofAllBos();
    }
}
