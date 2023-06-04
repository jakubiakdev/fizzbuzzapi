package github.jakubiakdev.fizzbuzzAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FizzbuzzApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FizzbuzzApiApplication.class, args);
	}

	@GetMapping(value = "/", produces="text/plain")
	public String hello(@RequestParam(value = "num") int num) {
		return fizzBuzz.solve(num);
	}
}