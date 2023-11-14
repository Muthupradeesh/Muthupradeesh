package com.pattern;
import java.util.*;
public class Pattern3 {
	public static void main(String[] args)
	{
		System.out.print("Enter the number ; ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1;i<=(n/2)+1;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==j||(i+j)==(n+1)||i==1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
	}

}
