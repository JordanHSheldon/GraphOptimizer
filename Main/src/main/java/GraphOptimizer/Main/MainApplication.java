package GraphOptimizer.Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	@GetMapping("/")
	public String GraphPoints(@RequestParam(value = "myName", defaultValue = "World") String name) {
		PointsService points = new PointsService(10);
		return "<html><h1>"+points+"</h1></html>";
	}
}
