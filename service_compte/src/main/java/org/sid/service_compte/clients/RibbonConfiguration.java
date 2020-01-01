package org.sid.service_compte.clients;

import java.util.Arrays;
import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;

import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import com.netflix.loadbalancer.RoundRobinRule;
import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.ServerList;
import com.netflix.loadbalancer.WeightedResponseTimeRule;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RibbonClient(name="contratservice")
public class RibbonConfiguration {

	/* comment dispatcher la charge entre serveurs*/
	@Bean
	public IRule loadBlancingRule() {
		
		new WeightedResponseTimeRule();
		new AvailabilityFilteringRule();
		new WeightedResponseTimeRule();		
		return new RoundRobinRule();
	}

	/* Verifier si l'instance est toujours actifs ou non*/
	@Bean
	public IPing pingConfiguration(ServerList<Server> servers) {
		
		String pingPath = "/actuator/health";
		IPing ping = new PingUrl(false, pingPath);				
		return ping;		
	}
	
	
	@Bean
	public ServerList<Server> serverList() {
		
		return new ServerList<Server>() {
			
			@Override
			public List<Server> getUpdatedListOfServers() {

				List<Server> serverList = Arrays.asList(new Server("http", "localhost", 8082), new Server("http", "localhost", 8083));				
				
				return serverList;
			}
			
			@Override
			public List<Server> getInitialListOfServers() {

				return Arrays.asList(new Server("http", "localhost", 8082), new Server("http", "localhost", 8083));
			}
		};
	}
	
}
