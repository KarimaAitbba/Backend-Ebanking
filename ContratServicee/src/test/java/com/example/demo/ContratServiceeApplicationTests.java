package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.stream;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.example.demo.Repositories.AbonneRepository;
import com.example.demo.entities.Abonne;
import com.example.demo.entities.Compte;
import com.example.demo.entities.Contrat;

import com.example.demo.services.AbonneService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.util.concurrent.Service;

import ch.qos.logback.classic.pattern.Abbreviator;



import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
class ContratServiceeApplicationTests {
	
	/*
	 * @Autowired private AbonneService abonneService;
	 * 
	 * @MockBean private AbonneRepository abonneRepository;
	 */
	
	
	private MockMvc mockMvc;
	@Autowired
	private WebApplicationContext context;

	ObjectMapper om = new ObjectMapper();

	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	@Test
	public void getAbonnesTest() throws Exception {
		
		/*
		 * MvcResult result = mockMvc
		 * .perform(get("/api/abonne/all").content(MediaType.APPLICATION_JSON_VALUE))
		 * .andExpect(status().isOk()).andReturn(); String resultContent =
		 * result.getResponse().getContentAsString(); Response response =
		 * om.readValue(resultContent, Response.class);
		 * Assert.assertTrue(response.isStatus() == Boolean.TRUE);
		 */
		
		
		
		/*
		 * when(abonneRepository.findAll()).thenReturn((List<Abonne>) Stream.of(new
		 * Abonne("236", "lahciri", "samia", "bcbccb", 623588, "hghg",
		 * false)).collect(Collectors.toList()));
		 * assertEquals(1,abonneService.getAbonnes().size());
		 */
	}

	@Test
	void contextLoads() {
	}

}
