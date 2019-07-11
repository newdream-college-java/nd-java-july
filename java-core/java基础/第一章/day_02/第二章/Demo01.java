/*1、输入两个小数，存入 a,b 中，编程实现 a 与 b 变量中的值交换，
最后输出 a 与 b 中的值。*/
import java.util.Scanner;
public class Demo01{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.print("请输入一个小数：");
		double a=in.nextDouble();
		System.out.print("请输入二个小数：");
		double b=in.nextDouble();
		double temp;
		System.out.println("a="+a+"\t"+"b="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a+"\t"+"b="+b);	
	}
}