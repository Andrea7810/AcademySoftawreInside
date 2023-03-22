package it.softwareInside.app.restController;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import it.softwareInside.app.models.Fox;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	
	
	
	@GetMapping("/genera-Volpe")
	public ArrayList<Fox> generaFox (@RequestParam(name = "n") int numero) {
		
		RestTemplate restTemplate = new RestTemplate();
		ArrayList<Fox> myArr = new ArrayList<>();
		
		for (int i = 0; i < numero; i++) {
			
			Fox risFox = restTemplate.getForObject("https://randomfox.ca/floof/", Fox.class);
			
			myArr.add(risFox);
		}
		
		
		return myArr;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
