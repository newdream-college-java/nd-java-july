/*编程实现迷你计算器：支持+、-、*、/，从控制台输入 2 个操作数，输出运 算结果。*/

import java.util.Scanner;

public class G{
	public static void main (String [] args){
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	String i=input.next();
	int b=input.nextInt();
	int c=0;
	switch(i){
		case "+":
			c=a+b;
		break;
		case "-":
			c=a-b;
		break;
		case "*":
			c=a*b;
		break;
		case "/":
			c=a/b;
		break;
		default:
			System.out.println("输入的符号有误！！！");
		
	}
	System.out.println("结果为"+c);
	}
}