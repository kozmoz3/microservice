package com.item.service.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfigTemplate {

	/*Es un cliente htpp rest el cual nos permite trabajar con otros recursos*/
	@Bean("clienteRest")
	@LoadBalanced//con esto usara balanceador con restemplate
	public RestTemplate registrarRestTemplate() {
		return new RestTemplate();
	}
}
