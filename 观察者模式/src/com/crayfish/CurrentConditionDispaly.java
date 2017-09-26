package com.crayfish;

public class CurrentConditionDispaly implements Observer,DispalyElement{
	
	private float temperature;
	private float humidity;
	private Subject s;
	
	public CurrentConditionDispaly(Subject s){
		this.s = s;
		s.registerObserver(this);
	}

	public void dispaly() {
		// TODO Auto-generated method stub
		System.out.println("temperature:"+temperature+"humidity:"+humidity);
	}

	public void update(float temperature, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temperature;
		this.humidity = humidity;
		dispaly();
	}
	
	public Observer getObserver(){
		return this;
	}

}
