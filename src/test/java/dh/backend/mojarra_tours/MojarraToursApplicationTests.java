package dh.backend.mojarra_tours;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;

@SpringBootTest
class MojarraToursApplicationTests {
	@DynamicPropertySource
	static void configureProperties(DynamicPropertyRegistry registry) {
		registry.add("spring.datasource.url", () -> System.getenv().getOrDefault("DB_URL_TEST", "jdbc:h2:mem:testdb"));
		registry.add("spring.datasource.username", () -> System.getenv().getOrDefault("USER_TEST", "sa"));
		registry.add("spring.datasource.password", () -> System.getenv().getOrDefault("PASSWORD_TEST", "password"));
		registry.add("spring.jpa.database-platform", () -> System.getenv().getOrDefault("DIALECT_TEST", "org.hibernate.dialect.H2Dialect"));
		registry.add("spring.jpa.hibernate.ddl-auto", () -> System.getenv().getOrDefault("DDL_MODE_TEST", "create-drop"));
	}
	@Test
	void contextLoads() {
	}

}
