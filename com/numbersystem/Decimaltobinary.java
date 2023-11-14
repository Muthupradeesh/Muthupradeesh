package com.numbersystem;
import java.util.*;
public class Decimaltobinary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int d,index=0;
		System.out.print("Enter the dcimal value: ");
		d=sc.nextInt();
		int[] arr=new int[32];
		while(d>0){    
			  arr[index++]=d%2;    
			  d=d/2;    
			}    
		System.out.print("Binary value: ");
			for(int i=index-1;i>=0;i--){    
			  System.out.print(arr[i]);    
			}    
			System.out.println();  
		
			} 
		
	}

