package org.dimigo.oop;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String answer = new String();
		String n1 = "윈도우";
		String n2 = "애플";
		String n3 = "디미고";
		
		System.out.println("세계 에서 제일 많이 쓰이는 데스크탑 OS는?");
		
		answer = scanner.nextLine();
		
		if(n1.equals(answer)){
			System.out.println("정답입니다!! ^^");
		}
		else{
			System.out.println("틀렸습니다 !! ㅜㅜ");
		}
		System.out.println("스티브 잡스가 세운 회사는?");
		
		answer = scanner.nextLine();
		if(n2.equals(answer)){
			System.out.println("정답입니다!! ^^");
		}
		else{
			System.out.println("틀렸습니다 !! ㅜㅜ");
		}
		
		System.out.println("한국 최초의 IT 특성화학교의 이름은 ?");
		
		answer = scanner.nextLine();
		if(n3.equals(answer)){
			System.out.println("정답입니다!! ^^");
		}
		else{
			System.out.println("틀렸습니다 !! ㅜㅜ");
		}
		scanner.close();
	}

}
