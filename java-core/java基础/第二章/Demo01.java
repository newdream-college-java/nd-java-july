/*输入两个小数，存入a,b中，变成实现a与b变量值的交换*/
import java.util.Scanner;
public class Demo01{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入数字a：");
		double a = input.nextDouble();
		System.out.print("请输入数字b：");
		double b = input.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("交换前a:"+b+"\t"+"b:"+"\t"+a);
		System.out.println("交换后a:"+a+"\t"+"b:"+"\t"+b);
	}
}