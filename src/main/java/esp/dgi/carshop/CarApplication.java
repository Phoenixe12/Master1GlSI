package esp.dgi.carshop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarApplication {
	private static final Logger logger = LoggerFactory.getLogger(CarApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CarApplication.class, args);
		logger.info("CarApp started succesfully");
	}

}
