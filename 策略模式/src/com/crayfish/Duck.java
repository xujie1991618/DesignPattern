package com.crayfish;

public abstract class Duck {
	
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setDuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public void performFlyBehavior(){
		if(flyBehavior == null){
			System.out.println("先设置鸭子行为");
		}else{
			flyBehavior.fly();
		}
	}
	
	public void performQuackBehavior(){
		if(quackBehavior == null){
			System.out.println("先设置鸭子行为");
		}else{
			quackBehavior.duack();
		}
	}

	public abstract void dispaly();
	
	public void swim(){
		System.out.println("都会游泳");
	}

}
