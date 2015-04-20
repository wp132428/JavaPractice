package org.dimigo.oop;

public class Car2 {
	private String company;		
	private String model;		
	private String color;		
	private int maxSpeed;		
	private int price;			
	
	public Car2()
	{
		
	}
	
	public Car2(String Company_t, String Model_t, String Color_t, int MaxSpeed_t, int Price_t) {
		company = Company_t;
		model = Model_t;
		color = Color_t;
		maxSpeed = MaxSpeed_t;
		price = Price_t;
	}
	
	public String getCompany()
	{
		return company;
	}	

	public String getModel()
	{
		return model;
	}

	public String getColor()
	{
		return color;
	}

	public int getMaxSpeed()
	{
		return maxSpeed;
	}

	public int getPrice()
	{
		return price;
	}	
}
