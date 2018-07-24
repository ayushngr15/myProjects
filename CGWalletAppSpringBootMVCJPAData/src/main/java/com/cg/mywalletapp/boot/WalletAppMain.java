package com.cg.mywalletapp.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages= {"com.cg.mywalletapp"})
@EntityScan(basePackages="com.cg.mywalletapp.beans")
@EnableJpaRepositories(basePackages="com.cg.mywalletapp.repo")
@EnableWebMvc
public class WalletAppMain extends SpringBootServletInitializer{


	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(WalletAppMain.class);
	}

	public static void main(String[] args) {

		SpringApplication.run(WalletAppMain.class, args);
	}
}
