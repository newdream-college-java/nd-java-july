/*
4、输入两个整数，放入到两个变量 a 与 b 中，编程将 a 与 b 中的值交换，输出。 
*/
import java.util.Scanner;
public class Demo04{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入a和b");
		int a = input.nextInt();
		int b = input.nextInt();
		int c=0;
		System.out.println("置换前a="+a+"b="+b);
		c=a;a=b;b=c;
		System.out.println("置换后a="+a+"b="+b);
	}
}