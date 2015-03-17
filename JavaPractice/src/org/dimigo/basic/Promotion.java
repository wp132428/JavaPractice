package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		int employee = 3;
		int store = 1500;
		int salary = 1700000;
		
		long total = (long)employee * (long)store * (long)salary * 12 ;
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.printf("월 평균 급여 : %,d원\n",salary);
		System.out.printf("점포 내 직원 수 : %d명\n",employee);
		System.out.printf("점포 수 : %,d개\n\n",store);
		System.out.printf("연간 인건비 : %,d원",total);

	}

}
