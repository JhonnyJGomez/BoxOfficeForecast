package edu.com.cinemark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class CinemarkApplication extends SpringBootServletInitializer{

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	return application.sources(CinemarkApplication.class);
    }

    public static void main(String[] args) {
	SpringApplication.run(CinemarkApplication.class, args);
    }
	
}
