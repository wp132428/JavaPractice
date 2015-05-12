package org.dimigo.oop;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("국어 점수 입력  =>" );
		int kor = scanner.nextInt();
		System.out.println("수학 점수 입력 =>");
		int math = scanner.nextInt();
		System.out.printf("영어 점수 입력  =>" );
		int eng = scanner.nextInt();
		
		System.out.println("<< 점수 출력 >>");
		StringBuilder sb = new StringBuilder();
		sb.append("국어점수 : ")
		.append(kor + "점\n")
		.append("수학점수 : ")
		.append(math + "점\n")
		.append("영어점수 : ")
		.append(eng + "점\n");
		System.out.println(sb.toString());
	}

}
