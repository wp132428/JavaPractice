package org.dimigo.oop;

public class CarTest2 {

	public static void main(String[] args) {
		System.out.println("<< 자동차 목록 >>");
		
		Car2 model1 = new Car2("현대자동차","제네시스","검정색",225,50000000);
		Car2 model2 = new Car2("기아자동차","model2","흰색",246,40000000);
		Car2 model3 = new Car2("삼성자동차","model3","회색",200,38000000);
		
		System.out.println("제조사명 : " + model1.getCompany());
		System.out.println("모델명 : " + model1.getModel());
		System.out.println("색상 : " + model1.getColor());
		System.out.println("최대속도 : " + model1.getMaxSpeed()+"km");
		System.out.println("가격 : " + String.format("%,d", model1.getPrice())+"원");
		System.out.println("--------------------------------");
		
		System.out.println("제조사명 : " + model2.getCompany());
		System.out.println("모델명 : " + model2.getModel());
		System.out.println("색상 : " + model2.getColor());
		System.out.println("최대속도 : " + model2.getMaxSpeed()+"km");
		System.out.println("가격 : " + String.format("%,d",model2.getPrice())+"원");
		System.out.println("--------------------------------");
		
		System.out.println("제조사명 : " + model3.getCompany());
		System.out.println("모델명 : " + model3.getModel());
		System.out.println("색상 : " + model3.getColor());
		System.out.println("최대속도 : " + model3.getMaxSpeed()+"km");
		System.out.println("가격 : " + String.format("%,d",model3.getPrice())+"원");
		System.out.println("--------------------------------");
	}

}
