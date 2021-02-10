package calculator;
import java.util.*;
final class Testing {
	public int Addition(int a,int b) {
		System.out.println("Addition of "+a+"+"+b+" is: "+(a+b));
		return a+b;
	}
	public int substraction(int a,int b) {
		System.out.println("substration of "+a+"-"+b+" is: "+(a-b));
		return a-b;
	}
	public int multiplication(int a,int b) {
		System.out.println("multiplication of "+a+"*"+b+" is: "+(a*b));
		return a*b;
	}
	public int division(int a,int b) {
		if(b!=0)
		{
			System.out.println("division of "+a+"/"+b+" is: "+(a/b));
			return a/b;	
		}
		else {
			System.out.println("Division with Zero is not Possible");
			return 0;
		}
	}
}
public class Basiccal{
	public static void main(String args[])
	{
		System.out.println("     Calculator");
		System.out.println();
		Testing bc=new Testing();
		Scanner sc=new Scanner(System.in);
		System.out.println("  Enter Two Numbers");
		int k,l;
		System.out.println();
		System.out.println("Enter First Number: ");
		k=sc.nextInt();
		System.out.println("Enter Second Number: ");
		l=sc.nextInt();
		char op;
		System.out.println("Enter the Operator(+,-,*,/):");
		op=sc.next().charAt(0);
		switch(op) {
		case '+':
			bc.Addition(k,l);
			break;
		case '-':
			bc.substraction(k, l);
			break;
		case '*':
			bc.multiplication(k, l);
			break;
		case '/':
			bc.division(k, l);
			break;
		default:
			System.out.println("Inacceptable Operator");
			break;
		}
		sc.close();
	}
	}