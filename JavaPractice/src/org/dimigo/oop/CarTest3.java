package org.dimigo.oop;

public class CarTest3 {

	public static void main(String[] args) {
		System.out.println("<< 자동차 목록 >>");
		Car3 model1 = new Car3("현대자동차","제네시스","검정색",225,50000000);
		Car3 model2 = new Car3("기아자동차","model2","흰색",246);
		Car3 model3 = new Car3("삼성자동차","model3","회색");
		
		System.out.println("제조사명 : " + model1.getCompany());
		System.out.println("모델명 : " + model1.getModel());
		System.out.println("색상 : " + model1.getColor());
		System.out.println("최고속도 : " + model1.getMaxSpeed()+"Km");
		System.out.println("가격 : " + String.format("%,d",model1.getPrice()) + "원");
		System.out.println("---------------------------------");
		
		System.out.println("제조사명 : " + model2.getCompany());
		System.out.println("모델명 : " + model2.getModel());
		System.out.println("색상 : " + model2.getColor());
		System.out.println("최고속도 : " + model2.getMaxSpeed()+"Km");
		System.out.println("가격 : " + String.format("%,d",model2.getPrice()) + "원");
		System.out.println("---------------------------------");
		
		System.out.println("제조사명 : " + model3.getCompany());
		System.out.println("모델명 : " + model3.getModel());
		System.out.println("색상 : " + model3.getColor());
		System.out.println("최고속도 : " + model3.getMaxSpeed()+"Km");
		System.out.println("가격 : " + String.format("%,d",model3.getPrice())+"원");
		System.out.println("---------------------------------");
		
	}

}
