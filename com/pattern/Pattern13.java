package com.pattern;
import java.util.*;
public class Pattern13 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n=sc.nextInt();
		if(n%2!=0)
		{
			for(int i=0;i<2*n+1;i++)
			{
				for(int j=0;j<2*n-1;j++)
				{
					if(i==0 && ((i+j)%2==0))
						System.out.print("*");
					else if(i+j==2*n-2||i==j||(i==2*n-2 && j%2==0))
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		}
		else
			System.out.print("Invalid Output");
		
	}
	
}