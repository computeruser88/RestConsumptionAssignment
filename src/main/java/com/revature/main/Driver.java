package com.revature.main;

import java.sql.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import com.revature.beans.Bear;

public class Driver {

	public static void main(String[] args) {
		
		String getRequestUrl = "http://:8088/bears";
		
		final Logger log = LoggerFactory.getLogger(Driver.class);
		// RestTemplate is an object provided by Spring Web which allows us to map resources
		// and send Http Requests
		RestTemplate restTemplate = new RestTemplate();
		try {
			Bear bear = restTemplate.getForObject(getRequestUrl, Bear.class);
			log.info("resource consumption successful");
			log.info(bear.toString());
		} catch (Exception e) {
			log.error("resource consumption unsuccessful");
		}
		
		String postRequestUrl = "http://:8088/bears";
		
		Bear b1 = new Bear(2L, "Harold", "Mammoth Cave", Date.valueOf("2004-03-24"), 1, 0);
		Bear b2 = new Bear(3L, "Wendy", "Jellystone Cave", Date.valueOf("2002-10-03"), 1, 0);
		
		try {
			Bear addedBear1 = restTemplate.postForObject(postRequestUrl, b1, Bear.class);
			Bear addedBear2 = restTemplate.postForObject(postRequestUrl, b2, Bear.class);
			log.info("resource exchange successful");
			log.info("'Posted': " + addedBear1.toString());
			log.info("'Posted': " + addedBear2.toString());
		} catch (Exception e) {
			log.error("resource exchange unsuccessful");
		}
		

		
//		String putRequestUrl = "http://localhost:8088/bears";
//		try {
//			restTemplate.put(putRequestUrl, Bear.class);
//			log.info("resource update successful");
//		} catch (Exception e) {
//			log.error("resource update unsuccessful");
//		}
//		
//		String deleteRequestUrl = "http://localhost:8088/bears";
//		try {
//			restTemplate.delete(deleteRequestUrl);
//			log.info("resource delete successful");
//		} catch (Exception e) {
//			log.error("resource delete unsuccessful");
//		}
 	}
}
