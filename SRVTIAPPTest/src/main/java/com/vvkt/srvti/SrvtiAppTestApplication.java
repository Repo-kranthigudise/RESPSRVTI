package com.vvkt.srvti;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



@SpringBootApplication
//(scanBasePackages = "com.vvkt.bssvedu.*")
public class SrvtiAppTestApplication extends SpringBootServletInitializer {
	
private static Class<SrvtiAppTestApplication> applicationClass = SrvtiAppTestApplication.class;

    public static void main(String[] args) {
        SpringApplication.run(SrvtiAppTestApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }
}