package org.factoriaf5.javaloops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaloopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaloopsApplication.class, args);
		int n = 5;
		String[] result = Multiplytable.generateTable(n);
		for (String line : result) {
			System.out.println(line);
		}
	}
	

}
