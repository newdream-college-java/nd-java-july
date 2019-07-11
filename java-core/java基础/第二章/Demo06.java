/*
6、输入一个 3 位数，分别放入到 3 个变量中去，编程将这 3 个变量中的值交换后输出。比
如输入 123 三个数放入到 a,b,c 中去，最后输出 a,b,c 的值，要求输出 321。
*/
import java.util.Scanner;
public class Demo06{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个3位数：");
		int n = input.nextInt();
		int a,b,c;
		a=n%10;
		n=(n-a)/10;
		b=n%10;
		n=(n-b)/10;
		c=n%10;
		System.out.println("交换后的数："+a+""+b+""+c);
	}
}