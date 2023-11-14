package com.pattern;
import java.util.*;
public class Pattern8 {
   public static void main(String[] args)
   {
	   Scanner in=new Scanner(System.in);
		System.out.print("Enter the nubmer ");
		int n=in.nextInt();
		if(n%2!=0)
		{
		for(int i=1;i<=n;i++)
		 {
			for(int j=1;j<=(n/2)+1;j++)
			{
				for(int k=j;k<(n/2)+1;k++)
				{
					System.out.print(" ");				}
				if(j==n||(i+j)==n+1||i==j)
					System.out.print("*");
					else
						System.out.print(" ");
			}
			System.out.println();
		 }
		}
		else
			System.out.print("Invalid input");
	
			   
   }
}