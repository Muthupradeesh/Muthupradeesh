package com.numbersystem;
import java.util.*;
public class Binarytodecimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
         long b,remainder=0;
         int d=0,i=0;
         System.out.println("Enter the binary value: ");
         b=sc.nextLong();
         while (b!= 0) {
             remainder=b% 10;
             b/=10;
             d+= remainder*Math.pow(2, i);
             ++i;
           }
         System.out.print("Decimal value is  "+d);
         
	}

}
