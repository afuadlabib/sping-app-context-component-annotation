package com.fuad.springapp;

import com.fuad.springapp.services.ColorPrinter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class SpringAppApplication implements CommandLineRunner {

	private final ColorPrinter colorPrinter;

	public SpringAppApplication(ColorPrinter colorPrinter){
		this.colorPrinter = colorPrinter;
	}

	public static void main(String[] args)
	{
		SpringApplication.run(SpringAppApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("TestingApp: " + colorPrinter.print());
	}
}
