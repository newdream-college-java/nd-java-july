package 第11章作业;

import java.util.Scanner;

/*1.4、用代码实现计算器(Calculator)*/
public class Calculator {
	public double add(double num1,double num2){
			return num1+num2;
	}
	public double minus(double num1,double num2){
		return num1-num2;
	}
	public double multiple(double num1,double num2){
		return num1*num2;
	}
	public double devide(double num1,double num2){
		if (num2==0) {
			System.out.println("被除数不能为0");
			System.exit(-1);
		}
		return num1/num2;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);		
		System.out.print("请输入第一个数：");
		double d1=input.nextDouble();
		System.out.print("请输入第二个数：");
		double d2=input.nextDouble();
		System.out.print("请选择你的操作（0.退出系统1.加2.减3.乘4，除）：");
		int n=input.nextInt();
		Calculator cl=new Calculator();
		switch (n) {
		case 0:
			System.out.println("成功退出系統！");
			System.exit(-1);
			break;

		case 1:
			System.out.println("做加法结果为："+cl.add(d1, d2));
			
			break;

		case 2:
	
			System.out.println("做减法结果为："+cl.minus(d1, d2));
			break;
	
		case 3:
	
			System.out.println("做乘法结果为："+cl.multiple(d1, d2));
			break;

		case 4:
	
			System.out.println("做除法结果为："+cl.devide(d1, d2));
			break;
			
		default:
			System.out.println("輸入有誤！");
			break;
		}
	}
}
