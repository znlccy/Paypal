package com.gy.paypal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@Configuration
@ComponentScan
public class Application {
	
	/**
	 * 主函数
	 * @param args
	 */
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
	
}
