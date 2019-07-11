/*1.输入两个小数，存入 a,b 中，编程实现 a 与 b 变量中的值交换，最后输出 a 与 b 中的值。*/
import  java.util.Scanner;
public class ChangeDemo{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入a的值：");
		double a=input.nextDouble();
		System.out.print("请输入b的值：");
		double b=input.nextDouble();
		double temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("交换后:a="+a+",b="+b);
	}
}