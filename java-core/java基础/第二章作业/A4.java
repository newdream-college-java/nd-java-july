/*输入两个整数，放入到两个变量 a 与 b 中，编程将 a 与 b 中的值交换，输出。*/
import java.util.Scanner;
public class A4{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个整数");
		int a = input.nextInt();
		System.out.println("请输入第二个整数");
		int b = input.nextInt();
		int c;
		c=a;a=b;b=c;
		System.out.println("交换后整数a为"+a+"整数b为"+b);
	}
}