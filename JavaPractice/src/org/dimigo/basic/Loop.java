package org.dimigo.basic;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j = 1; j <= 10 ; j ++)
		{
			for(int i = 1; i <= 10 ; i ++)
			{
				if(i == j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(i);
				}
			}
			System.out.println("");
		}
	}

}
