package github_actions;

import java.util.Scanner;

public class MyClass {

	public int areaRect(int l , int b)
	{
		return (l*b);
	}
	
	public static void main(String[] args) {
		MyClass ob = new MyClass();
		int l;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length: ");
		l = sc.nextInt();
		System.out.println("Enter Breadth: ");
		b = sc.nextInt();
		System.out.println("Area of Rectangle is: "+ ob.areaRect(l , b));
	}

}
