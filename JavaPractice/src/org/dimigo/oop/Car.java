package org.dimigo.oop;

public class Car {
	String company;
	String model;
	String color;
	int maxSpeed;
	int price;
	
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
	public void setCompany(String company_t)
	{
		company = company_t;
	}
	public void setModel(String model_t)
	{
		model = model_t;
	}
	public void setColor(String color_t)
	{
		color = color_t;
	}
	public void setMaxSpeed(int maxSpeed_t)
	{
		maxSpeed = maxSpeed_t;
	}
	public void setPrice(int price_t)
	{
		price = price_t;
	}
}
