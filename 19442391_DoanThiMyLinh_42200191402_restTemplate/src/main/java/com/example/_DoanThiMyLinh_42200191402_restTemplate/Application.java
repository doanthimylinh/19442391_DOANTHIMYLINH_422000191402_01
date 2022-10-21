package com.example._DoanThiMyLinh_42200191402_restTemplate;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {
	private static final String URL_SUBJECT = "http://localhost:8083/student";
	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(URL_SUBJECT,String.class);
		System.out.println(result);
	}

}
