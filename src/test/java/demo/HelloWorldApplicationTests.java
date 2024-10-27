package demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HelloWorldApplicationTests {

//	@Test
//	void contextLoads() {
//	}

	@Test
	void testAddition(){
		int two = 2;
		assertEquals(two, 2);
	}
}
