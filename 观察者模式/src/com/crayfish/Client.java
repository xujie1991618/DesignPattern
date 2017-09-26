package com.crayfish;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WeatherData weatherData = new WeatherData();
			CurrentConditionDispaly dispaly = new CurrentConditionDispaly(weatherData);
			weatherData.setMeasurements(79, 80, 18.4f);
			weatherData.setMeasurements(66, 97, 13.2f);
			weatherData.removeObserver(dispaly);
			weatherData.setMeasurements(66, 97, 13.2f);
	}

}
