package com.pattern;
import java.util.*;
public class Pattern4 {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the nubmer ");
		int n=in.nextInt();
		if(n%2!=0)
		{
		for(int i=1;i<=(n/2)+1;i++)
		 {
			for(int j=1;j<=n;j++)
			{
				if(i==(n/2)+1||(i+j)==(n/2)+2||(i+j)==(n-1))
					System.out.print("*");
					else
						System.out.print(" ");
			}
			System.out.println();
		 }
	   }
		else
			System.out.print("Inalid input");
		
}

}
