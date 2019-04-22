//create a client machine

import java.rmi.*;
import java.util.Scanner;
public class Client
{
	public static void main(String... args) throws Exception
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("CALCULATOR");
		System.out.print("Enter First Number: ");
		int num1 = reader.nextInt();
		System.out.print("Enter Second Number: ");
		int num2 = reader.nextInt();
		System.out.print("Enter the Operator: ");
		char ch = reader.next().charAt(0);
		int result;
		CalcI obj;
		switch(ch)
		{
			case '+' :
				obj = (CalcI)Naming.lookup("ADD");
				result = obj.add(num1, num2);
				System.out.println("Sum of "+ num1 +" & "+ num2 +" is: " + result);
				break;
			case '-' :
				obj = (CalcI)Naming.lookup("SUB");
				result = obj.sub(num1, num2);
				System.out.println("Difference of "+ num1 +" & "+ num2 +" is: " + result);
				break;
			case '*' :
				obj = (CalcI)Naming.lookup("MUL");
				result = obj.mul(num1, num2);
				System.out.println("Product of "+ num1 +" & "+ num2 +" is: " + result);
				break;
			case '/' :
				obj = (CalcI)Naming.lookup("DIV");
				result = obj.div(num1, num2);
				System.out.println("Division of "+ num1 +" & "+ num2 +" is: " + result);
				break;
			case '%' :
				obj = (CalcI)Naming.lookup("REM");
				result = obj.rem(num1, num2);
				System.out.println("Remainder of "+ num1 +" & "+ num2 +" is: " + result);
				break;
			default:
				System.out.println("Enter a valid operator");
		}
	}
}
