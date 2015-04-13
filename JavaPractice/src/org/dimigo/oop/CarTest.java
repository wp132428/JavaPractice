package org.dimigo.oop;

public class CarTest {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("<<자동차 목록>>");
		
		car1.setCompany("현대자동차");
		car1.setModel("제네시스");
		car1.setColor("검정색");
		car1.setMaxSpeed(225);
		car1.setPrice(50000000);
		
		System.out.println("제조사명 : " + car1.getCompany());
		System.out.println("모델명 : " + car1.getModel());
		System.out.println("색상 : " + car1.getColor());
		System.out.println("최대속도 : " + car1.getMaxSpeed() + "Km");
		System.out.printf("가격 : %,d\n",car1.getPrice());
		
		car1.setCompany("기아자동차");
		car1.setModel("K7");
		car1.setColor("흰색");
		car1.setMaxSpeed(246);
		car1.setPrice(40000000);
		
		System.out.println("제조사명 : " + car1.getCompany());
		System.out.println("모델명 : " + car1.getModel());
		System.out.println("색상 : " + car1.getColor());
		System.out.println("최대속도 : " + car1.getMaxSpeed() + "Km");
		System.out.printf("가격 : %,d\n",car1.getPrice());
		
		car1.setCompany("삼성자동차");
		car1.setModel("SM7");
		car1.setColor("회색");
		car1.setMaxSpeed(200);
		car1.setPrice(38000000);
		
		System.out.println("제조사명 : " + car1.getCompany());
		System.out.println("모델명 : " + car1.getModel());
		System.out.println("색상 : " + car1.getColor());
		System.out.println("최대속도 : " + car1.getMaxSpeed() + "Km");
		System.out.printf("가격 : %,d\n",car1.getPrice());
	}
}
