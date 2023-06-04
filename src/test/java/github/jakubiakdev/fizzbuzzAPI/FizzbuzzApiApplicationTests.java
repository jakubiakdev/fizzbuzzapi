package github.jakubiakdev.fizzbuzzAPI;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest
class FizzbuzzApiApplicationTests {

	@Autowired
	private FizzbuzzApiApplication controller;

	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
			assertThat(controller).isNotNull();
	}

	@Test
	public void hello() throws Exception {
		this.mockMvc.perform(MockMvcRequestBuilders.get("/?num=10"))
				.andExpect(MockMvcResultMatchers.content().string("Buzz"));
		this.mockMvc.perform(MockMvcRequestBuilders.get("/?num=15"))
				.andExpect(MockMvcResultMatchers.content().string("FizzBuzz"));
		this.mockMvc.perform(MockMvcRequestBuilders.get("/?num=3"))
				.andExpect(MockMvcResultMatchers.content().string("Fizz"));
	}

	@Test
	void fizzBuzz() {
		assertThat(fizzBuzz.solve(10)).isEqualTo("Buzz");
		assertThat(fizzBuzz.solve(15)).isEqualTo("FizzBuzz");
		assertThat(fizzBuzz.solve(3)).isEqualTo("Fizz");
	}
}