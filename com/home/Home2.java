package com.home;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
public class Home2 {
  public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
     String path= "C:\\Users\\USER\\eclipse-workspace\\com.muthupradeesh_s\\src\\com";
	String packageName="com";
	Stack<String> pathStack = new Stack<>();
	while(true){
		String filelist[] = getFolders(path);
		Scanner scan = new Scanner(System.in);
		printFileList(filelist);
		System.out.println(" 0-exit \n -1 to go back \n Enter your choice");
		int choise=scan.nextInt();
		if(choise==0)
		{
		 break;
		}
		else if(choise==-1)
		{
		if(!pathStack.isEmpty())
		{
		path=pathStack.pop();
		packageName = packageName.substring(0, packageName.lastIndexOf('.'));
		}
		else
		{
			System.out.println("Invalid Option");
		}
		}
		else if(choise>0&& choise<=filelist.length)
		{
		String selectName=filelist[choise-1];
		packageName=packageName +"."+ selectName;
		String selectedPath=path+"//"+ selectName;
		if (isDirectory(selectedPath))
		{
			pathStack.push(path);
			path=selectedPath;
		}
		else
		{
			printJavaClass(packageName);
		}
		}
		else
		{
		 System.out.println("Invalid Input!");
		}
		}
	}
public static String[] getFolders(String path) {
		File pathFolders = new File(path);
		String list[] = pathFolders.list();
		return list;
	}
	public static void printFileList(String[] list) {
		int count = 1;
		boolean directory = true;
		for (String str:list) {
			if (directory) {
				System.out.println(count++ + ". " + str);
			} else {
				System.out.println(count++ + ". " + str.substring(0, str.length() - 5));
			}
		}
	}
	public static boolean isDirectory(String path) {
		File file = new File(path);
		return file.isDirectory();
	}
public static void printJavaClass(String path) throws ClassNotFoundException, NoSuchMethodException,
			SecurityException, IllegalAccessException, InvocationTargetException {
		Class<?> cls = Class.forName(path.substring(0, path.length() - 5));
		Method method = cls.getDeclaredMethod("main", String[].class);
		String[] str = new String[1];
		str[0] = "null";
		method.invoke(null, (Object) str);
	}
}
