package com.crayfish;

import java.util.ArrayList;

public class WeatherData implements Subject{
	
	private ArrayList oList;
	private float temperature;//温度
	private float humidity;//湿度
	private float pressure;//压力
	
	public WeatherData(){
		oList = new ArrayList();
	}

	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		oList.add(o);
	}

	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = oList.indexOf(o);
		if(i>=0){
			oList.remove(i);
		}
	}

	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (int i = 0; i < oList.size(); i++) {
			Observer ob = (Observer) oList.get(i);
			ob.update(temperature,humidity,pressure);
		}
	}
	
	public void measurementsChanged(){
		notifyObservers();
	}

	public void setMeasurements(float temperature,float humidity,float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
