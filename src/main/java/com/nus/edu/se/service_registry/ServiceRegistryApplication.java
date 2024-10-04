package com.nus.edu.se.service_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import com.netflix.appinfo.AmazonInfo;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.cloud.commons.util.InetUtils;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}


}

//@Bean
//@Profile("!default")
//public EurekaInstanceConfigBean eurekaInstanceConfig(InetUtils inetUtils) {
//	EurekaInstanceConfigBean eurekaInstanceConfigBean = new EurekaInstanceConfigBean(inetUtils);
//	AmazonInfo amazonInfo = AmazonInfo.Builder.newBuilder().autoBuild("eureka");
//	eurekaInstanceConfigBean.setDataCenterInfo(amazonInfo);
//	return eurekaInstanceConfigBean;
//}
//}