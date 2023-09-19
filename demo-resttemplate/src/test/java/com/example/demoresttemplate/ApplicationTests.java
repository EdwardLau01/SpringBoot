package com.example.demoresttemplate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// Hamcrest - > Matchers
// JUnit5 -> jupiter -> @Mock, @InjectMock, Mockito(when)
// Spring Test Framework -> @WebMvctest
// What is @SpringBootTest?

// I am goinng to test ther Server StartProcess, with dependency check
@SpringBootTest
// mvn test -> Simulate App Server Start & Bean Injection on Context
class ApplicationTests {

	@Test
	void contextLoads() {
	}

}
