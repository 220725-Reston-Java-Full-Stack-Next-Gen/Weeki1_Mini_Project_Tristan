package com.tristan.code;

import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Name your thermometer: ");
		
		Thermometer thermometer = new Thermometer();
		thermometer.setName(scan.next());
		
		System.out.println("Enter a temperature in Fahrenheit: ");
		int userTempF = scan.nextInt();
		System.out.println("Enter a temperature in Celsius: ");
		int userTempC = scan.nextInt();
		
		thermometer.setDegreesC(userTempC);
		thermometer.setDegreesF(userTempF);
		
		System.out.println("Your Fahrenheit temperature in Celsius is: " + Thermometer.convertToCelsius(userTempF));
		System.out.println("Your Celsius temperature in Fahrenheits is: " + Thermometer.convertToFahrenheit(userTempC));
		
		System.out.println("Enter three recent temperature readings: ");
		
		int temps[] = new int[3];
		temps[0] = scan.nextInt();
		temps[1] = scan.nextInt();
		temps[2] = scan.nextInt();
		
		Thermometer.calculateAverageTemp(temps);
		
		System.out.println("Goodbye.");
	}

}
