package com.pyramid;
import java.util.*;
public class Pyramid2 {
 public static void main(String[] args)
 {
	 Scanner in=new Scanner(System.in);
	 System.out.print("Enter the number: ");
	 int n=in.nextInt();
	  for(int i=1;i<=n;i++)
	 {
		 for(int j=0;j<i;j++)
		 {
			System.out.print(" ");
		 }
		 for(int k=1;k<=n-i+1;k++)
		 {
			 System.out.print((n-i+1)+" ");
		 }
		 System.out.println();
		
	 }
 }
}
