package com.pattern;
import java.util.*;
public class Pattern1 {
	public static void main(String[] args)
	{
	int n;
	System.out.println("Enter the number: ");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		
		for(int j=0;j<n;j++)
		{
			if(i==0||j==(n-1)||i==j)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println("");
		
	}
}
}
