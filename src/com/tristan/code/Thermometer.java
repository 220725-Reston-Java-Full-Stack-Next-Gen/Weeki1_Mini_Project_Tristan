package com.tristan.code;

public class Thermometer {
	
	private int    degreesF;
	private int    degreesC;
	private String name;
	private int[]  tempReadings;

	public Thermometer(int degreesF, int degreesC, String name, int[] tempReadings) {
		this.name = name;
		this.degreesC = degreesC;
		this.degreesF = degreesF;
		this.tempReadings = tempReadings;
	}
	
	public Thermometer( ) {
		
	}
	
	public static int convertToCelsius(int f) {
		return (int) ((f - 32) / 1.8);
	}

	public static int convertToFahrenheit(int c) {
		return (int) (c * 1.8 + 32);
	}
	
	public static void calculateAverageTemp(int[] temps) {
		System.out.println((temps[0] + temps[1] + temps[2]) / 3);
	}

	
	public int getDegreesF() {
		return degreesF;
	}

	public void setDegreesF(int degreesF) {
		this.degreesF = degreesF;
	}

	public int getDegreesC() {
		return degreesC;
	}

	public void setDegreesC(int degreesC) {
		this.degreesC = degreesC;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getTempReadings() {
		return tempReadings;
	}

	public void setTempReadings(int[] tempReadings) {
		this.tempReadings = tempReadings;
	}
	
	
}
