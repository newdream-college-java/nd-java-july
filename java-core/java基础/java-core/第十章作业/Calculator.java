/*1.4、使用面向对象的思想编写一个计算器类(Calculator),可以实现两个整数的加、
减、乘、除 运算。*/
package chapter_10;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Calculator a=new Calculator();
		System.out.println("欢迎使用计算器：");
		a.jisuan();	
	}	
	public void jisuan(){
		int jieguo;
		Scanner input =new Scanner(System.in);
		System.out.print("请输入你要运算的第一个整数：");
		int a=input.nextInt();
		System.out.print("请输入你要做运算：（+ - * /）");
		String jisuan=input.next();
		System.out.print("请输入你要运算的第二个整数：");
		int b=input.nextInt();
		if(jisuan.equals("+")){
			jieguo=a+b;
		}else if(jisuan.equals("-")){
			jieguo=a-b;
		}else if(jisuan.equals("*")){
			jieguo=a*b;
		}else{
			jieguo=a/b;
		}
		System.out.println(a+jisuan+b+"="+jieguo);
	}
}
