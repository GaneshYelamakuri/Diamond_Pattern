package com.jsp.Patternspack;

import java.util.Scanner;

public class Diamond 
{
	public static void main(String [] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scn.nextInt();
		int spaces=n/2;
		int letters=1;
		for( int i=1; i<=n;i++)
		{
			for (int j=1;j<=spaces;j++)
			{ 
				System.out.print(" ");
				
			}
			 
			for (int j=1;j<=letters;j++)
			{
				System.out.print("X");
				
			}
			System.out.println();
			if (i<=n/2) {
			spaces--;
			letters+=2;
			}else {
				spaces++;
				letters-=2;
			}
			
		}
	}

}



