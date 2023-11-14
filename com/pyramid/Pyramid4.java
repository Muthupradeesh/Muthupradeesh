package com.pyramid;
import java.util.*;
public class Pyramid4 {
	public static void main(String[] args)
	{
		int i,j,k,l;
		Scanner sc=new Scanner(System.in);
		System.out.print("Eneter the Number : ");
		int n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(k=n-i-1;k<n;k++)
			{
				System.out.print(k+1);
			}
			for(l=0;l<i;l++)
			{
				System.out.print(k-l-1);
			}
			System.out.println();
		}
	
	}

}
