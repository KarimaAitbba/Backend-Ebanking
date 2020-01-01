package org.sid.service_compte;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.List;
import java.util.stream.Stream;
import org.sid.service_compte.entities.Operation;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.sid.service_compte.dao.CompteRepository;
import org.sid.service_compte.entities.Abonne;
import org.sid.service_compte.entities.Bo;
import org.sid.service_compte.entities.CarteBancaire;
import org.sid.service_compte.entities.Compte;
import org.sid.service_compte.entities.Contrat;
import org.sid.service_compte.services.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
class ServiceCompteApplicationTests extends AbstractTest{

	
	@Test
	public void getAbonneTest() throws Exception{
		String uri = "/api/compte/AllAccountsAbonne/1";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
			      .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
			   
			   int status = mvcResult.getResponse().getStatus();
			   assertEquals(200, status);
			  
		
	}
	@Test 
	public void getOperationTest() throws Exception{
		String uri = "/AccountOperation/1";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
			      .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
			   
			   int status = mvcResult.getResponse().getStatus();
			   assertEquals(200, status);
			   String content = mvcResult.getResponse().getContentAsString();
			   
			   Operation[] OperationListe =super.mapFromJson(content, Operation[].class);
			  
			   assertTrue(OperationListe.length >=1);
		
	}
	@Test
	public void getCarteBancaireTest() throws Exception{
		String uri = "/AccountCarteBancaire/1";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
			      .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
			   
			   int status = mvcResult.getResponse().getStatus();
			   assertEquals(200, status);
			   String content = mvcResult.getResponse().getContentAsString();
			   
			   CarteBancaire[] CarteBancaireListe =super.mapFromJson(content, CarteBancaire[].class);
			  
			   assertTrue(CarteBancaireListe.length >=1);
	}
	@Test
	public void DesactiverEtatCarteTest()throws Exception{
		String uri ="/DesactiverEtatCarteBancaire/1";
		CarteBancaire carte = new CarteBancaire();
		//????????
		carte.setEtat("desactiver");
		////...?????
		String inputJson = super.mapToJson(carte);
		   MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.put(uri)
		      .contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson)).andReturn();
		   int status = mvcResult.getResponse().getStatus();
		   assertEquals(200, status);
		   String content = mvcResult.getResponse().getContentAsString();
		   assertEquals(content, "Product is updated successsfully");
	}
	
}
