package abhinav.spring.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UserControllerTest {
	
	@Autowired
    private TestRestTemplate restTemplate;
	
	@Test
	void test() {
		
		HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity <String> entity = new HttpEntity<String>(headers);
		String output = restTemplate.exchange("http://localhost:8080/users", HttpMethod.GET, entity, String.class).getBody();
		assertEquals("[{\"username\":\"abhi\",\"password\":\"hello12\"},{\"username\":\"siva\",\"password\":\"hi123\"}]", output);
	}

}
