/*4、输入两个整数，放入到两个变量 a 与 b 中，编程将 a 与 b 中的值交换，输出*/
import java.util.Scanner;
public class Demo04{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入整数a：");
		int a = input.nextInt();
		System.out.print("请输入整数b：");
		int b = input.nextInt();
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("交换前a："+b+"b:"+"\t"+a);
		System.out.println("交换后a："+a+"b:"+"\t"+b);
	}
}