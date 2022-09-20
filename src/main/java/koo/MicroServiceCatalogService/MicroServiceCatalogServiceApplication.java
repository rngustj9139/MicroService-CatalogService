package koo.MicroServiceCatalogService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroServiceCatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceCatalogServiceApplication.class, args);
	}

}
