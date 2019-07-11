/*1、输入两个小数，存入 a,b 中，编程实现 a 与 b 变量中的值交换， 
   最后输出 a 与 b 中的值。 */
import java.util.Scanner;
public class A{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入两个小数：");
		double a = input.nextDouble();
		double b = input.nextDouble();
		System.out.println("交换前：a="+a+"\tb="+b);
		double c;
		c=a;
		a=b;
		b=c;
		System.out.println("交换后：a="+a+"\tb="+b);
}
}