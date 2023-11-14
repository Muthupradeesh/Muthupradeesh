package com.pattern;
import java.util.*;
public class Pattern2 {
	public static void main(String[] args)
	{
       System.out.print("enter the number ");
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=1;i<=n;i++)
       {
    	   for(int j=1;j<=n;j++)
    	   {
    		   if(j==1||i==1||(i+j)==(n+1))
    			   System.out.print("*");
    		   else
    			   System.out.print(" ");;
    	   }
    	   System.out.println();
       }
     
}
}
