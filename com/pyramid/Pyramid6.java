package com.pyramid;
import java.util.*;
public class Pyramid6 {
 public static void main(String[] args)
 {
	 Scanner in=new Scanner(System.in);
	 System.out.print("Enter the number: ");
	 int n=in.nextInt();
	 if(n%2!=0)
	 {
	 for(int i=1;i<=n;i++)
	 {
		 for(int j=i;j<=n;j++)
		 {
			System.out.print(" ");
		 }
		 for(int k=1;k<=i;k++)
		 {
			System.out.print("*"+" ");
		 }
		 System.out.println();
	 }
	 }
	 else
		 System.out.print("Invalid input");
	
 }
}
