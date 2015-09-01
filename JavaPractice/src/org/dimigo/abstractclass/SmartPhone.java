package org.dimigo.abstractclass;

public abstract class SmartPhone {
	
	private String model;
	private String company;
	private int price;
	
	public SmartPhone(){
		
	}
	
	public SmartPhone(String model, String company, int price){
		this.model = model;
		this.company = company;
		this.price = price;
	}
	public void turnOn(){
		System.out.println(model+"의 전원을 켭니다.");
	}
	public void turnOff(){
		System.out.println(company + "의 전원을 끕니다.");
	}
	public abstract void pay();
	
	public void useSpecialFunction(){
		if(this instanceof Galaxy){
			Galaxy g = (Galaxy)this;
			g.useWirelessCharging();
		}
		else
		{
			IPhone i = (IPhone)this;
			i.useAirDrop();
		}
	}

	@Override
	public String toString() {
		return "모델명 =" + model + ", 제조사 =" + company + ", 가격 =" + String.format("%,d",price);
	}
	

}
