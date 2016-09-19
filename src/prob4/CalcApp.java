package prob4;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		// Scanner 와  String 클래스의 split 함수를 사용합니다.
		mul one=new mul();
		div two=new div();
		sub three=new sub();
		add four=new add();
		String str="";
		Scanner abc=new Scanner(System.in);
		str=abc.nextLine();
		String[] value=str.split("\\s");
		int num= Integer.parseInt(value[0]);
		int num2= Integer.parseInt(value[2]);
		
		switch(value[1])
		{
		case "*":
			one.setvalue(num,num2);
			int result=one.calculate();
			System.out.println(result);
			System.out.println("quit");
			break;
		case "/":
			two.setvalue(num, num2);
			int result1=three.calculate();
			System.out.println(result1);
			System.out.println("quit");
			break;
		case "+":
			four.setvalue(num, num2);
			int result2=four.calculate();
			System.out.println(result2);
			System.out.println("quit");
			break;
		case "-":
			three.setvalue(num, num2);
			int result3=two.calculate();
			System.out.println(result3);
			System.out.println("quit");
			break;
		
			
			
			
		}
		
		
		
		
	}
}
