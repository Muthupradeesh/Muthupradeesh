package com.home;
import java.io.File;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
public class Home
{
	
	public static void main (String[] args) throws Exception
	{
		String folderName="com.muthupradeesh_s";
		String path="C:\\Users\\USER\\eclipse-workspace\\com.muthupradeesh_s\\src"; 
		File obj=new File(path);
		String names[]=obj.list(); 
		display(names);
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter choice for package : ");
		int choice=sc.nextInt();
		if (choice-1 <= names.length)
		{
			path=path+"\\"+names[choice-1];
			String classFile[]=findfolder(path);
			display(classFile);
			System.out.print("Enter the your Choise : ");
			int n=sc.nextInt();
			if(n<=classFile.length)
			{
				int len=classFile[n-1].length()-5;
			     Class<?> cls=Class.forName(folderName+"."+names[choice-1]+"."+classFile[n-1].substring(0,len));
		         Method method=cls.getDeclaredMethod("main", String[].class);
		         String[] str = new String[1];
		 		str[0] = "null";
		 		method.invoke(null, (Object) str);
								
			}
			else
			{ 
				
				System.out.print("Invalid input");
			}
			
		}
		else 
		{
			System.out.print("Invalid input");
		}
		
		
	}
	static void display(String str[])
    {  
 	 int index=1;
	      for(String s :str)
	      {
	       
	        System.out.println((index++)+" "+s);
	      }
	      System.out.println("Press 0 for Exit ");
    }
	static String[] findfolder(String p)
	{
		File path=new File(p);
	     String list[]=path.list();
	     return list;
	}
		
}



