package validacaoApi;

import org.hamcrest.Matchers;
import org.junit.Test;

import io.restassured.RestAssured;

public class validacaoEndPoint {

	@Test
	public void	testeValidacaoEndPoint () {
		
		String url = "https://viacep.com.br/ws/01001000/json/";
		
		RestAssured
		.given()
			.log().all()
		.when() 
			.get(url) 
		.then() 
			.log().all()
			.assertThat()
			.statusCode(200)
			.body(Matchers.containsString("01001-000"))
			.and()
			.body(Matchers.containsString("São Paulo"));
			
	}
	
	
}
