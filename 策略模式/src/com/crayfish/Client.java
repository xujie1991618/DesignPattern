package com.crayfish;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck duck = new ModeDuck();
		duck.setFlyBehavior(new FlyNoWay());
		duck.setDuackBehavior(new NoQuack());
		
		duck.performFlyBehavior();
		duck.performQuackBehavior();
	}

}
