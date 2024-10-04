package com.nus.edu.se.service_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import org.springframework.cloud.commons.util.InetUtils;


@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}

	@Bean
	@Profile("!default")
	public EurekaInstanceConfigBean eurekaInstanceConfig(InetUtils inetUtils) {
	EurekaInstanceConfigBean b = new EurekaInstanceConfigBean(inetUtils);
	AmazonInfo info = AmazonInfo.Builder.newBuilder().autoBuild("eureka");
	b.setDataCenterInfo(info);
	return b;
	}

}
