package dgi.esp.ucad;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class SbCarApplication {
	private static final Logger logger = LoggerFactory.getLogger(SbCarApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SbCarApplication.class, args);
		logger.info("Spring app started. Go to http://localhost:8081/disc_student_name");
	}

	@RestController
	@RequestMapping("/disc_student_name")
	public class SbCarController {
		@Value("${fullname:Mohamed El Anewar A.A. DAMALA}")
		private String fullname;

		@GetMapping
		public String getFullname() {
			return "Work done by " + this.fullname + "!";
		}
	}
}