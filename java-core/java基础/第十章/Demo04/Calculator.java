/*1.4、使用面向对象的思想编写一个计算器类(Calculator),可以实现两个整数的加、
减、乘、除 运算。*/
package Demo04;

import java.util.Scanner;

public class Calculator {
	public double calculator(){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入表达式，数字符号用空格隔开（a + b）：");
		int a=input.nextInt();
		String c=input.next();
		int b=input.nextInt();
		int result=0;
		if(c.equals("+")){
			result=a+b;
		}else if(c.equals("-")){
			result=a-b;
		}else if(c.equals("*")){
			result=a*b;
		}else if(c.equals("/")){
			result=a/b;
		}
		return result;
	}
}
