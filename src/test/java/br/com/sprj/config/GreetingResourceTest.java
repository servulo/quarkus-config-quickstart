package br.com.sprj.config;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@QuarkusTest
public class GreetingResourceTest {

	@Test
	public void testHelloEndpoint() {
		given()
			.when().get("/greeting")
			.then()
				.statusCode(200)
				.body(is("hello quarkus!"));
	}

}
