package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1 = 9 , b1 = 10 , a2 = 9 ;
		double h1 = 5.8, h2 = 5.4;
		double s1 , s2;
		
		s1 = ((a1+b1)*h1)/2 ;
		s2 = a2*h2;
		
		System.out.println("<< 도형 넓이 비교>>");
		System.out.printf("사다리꼴 넓이 : %.1f\n",s1);
		System.out.printf("평행사변형 넓이 : %.1f\n\n",s2);
		
		if(s1 > s2)
		{
			System.out.printf("사다리꼴이 평행사변형 보다 %.1f 더 큽니다.",(s1-s2));
		}
		else
		{
			System.out.printf("평행사변형이 사다리꼴 보다 %.1f 더 큽니다.",(s2-s1));
		}
	}

}
