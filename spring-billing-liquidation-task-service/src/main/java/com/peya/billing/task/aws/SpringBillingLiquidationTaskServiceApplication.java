package com.peya.billing.task.aws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBillingLiquidationTaskServiceApplication implements CommandLineRunner{

	private final static Logger LOGGER = LoggerFactory.getLogger(SpringBillingLiquidationTaskServiceApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBillingLiquidationTaskServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String stringJoin = String.join(",", args);
		System.out.println("aegumentos -> "+ stringJoin);
		
		try {			
			Thread.sleep(5*1000);
			LOGGER.info("LIQUIDATION: Task with argument {} was finished", stringJoin);
		} catch (InterruptedException e) {
			LOGGER.info("LIQUIDATION: with argument  {} with error", args, e);
			throw e;
		}
	}

}
