package com.vvkt.srvti;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



@SpringBootApplication
//(scanBasePackages = "com.vvkt.bssvedu.*")
public class SrvtiappApplication extends SpringBootServletInitializer {
	
private static Class applicationClass = SrvtiappApplication.class;

    public static void main(String[] args) {
        SpringApplication.run(SrvtiappApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }
}