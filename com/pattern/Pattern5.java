package com.pattern;
import java.util.Scanner;
public class Pattern5 {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the nubmer ");
		int n=in.nextInt();
		for(int i=1;i<=n;i++)
		 {
			for(int k=0;k<i;k++)
				System.out.print(" ");
			for(int j=1;j<=n;j++)
			{
				if(i==1||j==1||i==n||j==n)
					System.out.print("*");
					else
						System.out.print(" ");
			}
			System.out.println();
		 }

}

}



