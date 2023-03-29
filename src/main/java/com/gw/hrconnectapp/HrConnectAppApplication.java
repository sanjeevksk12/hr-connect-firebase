package com.gw.hrconnectapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
		"com.gw.hrconnect.domain.repository, com.gw.hrconnect.domain.entity,com.gw.hrconnect,com.gw.hrconnect.service" })

@ComponentScan(basePackages = "com.gw.hrconnect,com.gw.hrconnect.service,com.gw.hrconnectapp")
@Configuration("com.gw.hrconnect.domain.repository")
@EnableJpaRepositories("com.gw.hrconnect.domain.repository")
@EntityScan("com.gw.hrconnect.domain.entity")
public class HrConnectAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrConnectAppApplication.class, args);
	}

}
