package udmeyJavaProgram;

import java.util.Scanner;

public class Swapping2Nums {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
	      System.out.println("Enter first number : ");
	      int num1 = sc.nextInt();
	      
	      System.out.println("Enter second number : ");
	      int num2 = sc.nextInt();

	      int temp = 0;
	      temp = num1;
	      num1 = num2;
	      num2 = temp;

	      System.out.println("After swapping :");
	      System.out.println("Value of first number :"+ num1);
	      System.out.println("Value of first number :"+ num2);
	   }

	}


