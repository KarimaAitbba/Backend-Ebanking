package org.sid.service_compte.clients;

import java.util.List;


import org.sid.service_compte.entities.Abonne;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@RibbonClient(name="contratservice")
@FeignClient(name="contratservice")
public interface GetAbonneeClient {
	
	@RequestMapping(value="/api/abonne/all",method = RequestMethod.GET)
    public List<Abonne> getAbonnes() ;
	
	 @RequestMapping(value="/api/abonne/{id}",method = RequestMethod.GET)
	 public Abonne getAbonne(@PathVariable("id") long id);
	
}