package org.dimigo.basic;

/**
 * 
 * @author 이어진
 * @version 1.0
 * << 첫번째 수행평가 과제 >>
 * 내용 : 아이유 프로필 출력하기
 * 작성일자 : 2015년 3월 13일
 */

public class PrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "아이유";
		boolean Gender = false;
		int age = 23;
		double height = 161.8;
		float Newton = 44.3f;
		char BloodType = 'A';
		
		System.out.println("<< 아이유 프로필 >>");
		System.out.println("이름 : "+ name);
		if(Gender = false)
		{
			System.out.println("성별 : 여자");
		}
		else 
		{
			System.out.println("성별 : 남자");
		}
		System.out.println("나이 : "+ age);
		System.out.println("키 : "+ height);
		System.out.println("몸무게 : "+ Newton);
		System.out.println("혈액형 : "+ BloodType);
			
	}

}
