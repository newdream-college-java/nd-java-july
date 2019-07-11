/*输入两个小数，存入a,b中，编程实现a与b变量中的值交换，最后输出a与b中的值*/
import java.util.Scanner;
public class Demo01{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("输入a的值：");
		double a=input.nextDouble();
		System.out.print("输入b的值：");
		double b=input.nextDouble();
		System.out.println("输入值："+"a="+a+"\tb="+b);
		double temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("输出值："+"a="+a+"\tb="+b);
	}
}