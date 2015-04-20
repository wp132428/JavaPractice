package org.dimigo.oop;

public class Car3 {
	private String company;		
	private String model;		
	private String color;		
	private int maxSpeed;		
	private int price;			
	
	public Car3()
	{
		System.out.println("기본 생성자 호출");
	}
	public Car3(String company, String model, String color, int maxSpeed, int price) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.price = price;
		System.out.println("5개 짜리 생성자 호출");
	}	
	
	public Car3(String company, String model, String color, int maxSpeed) 
	{
		this(company, model, color, maxSpeed, 0);
		System.out.println("4개짜리 생성자 호출");
	}

	public Car3(String company, String model, String color)
	{
		this(company, model, color, 0);
		System.out.println("4개짜리 생성자 호출");
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
