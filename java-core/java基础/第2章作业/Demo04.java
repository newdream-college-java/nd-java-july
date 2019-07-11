/*输入两个整数，放入两个整数，放入到两个变量a与b中，编程将a与b中的值交换，输出*/
import java.util.Scanner;
public class Demo04{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入a：");
		int a=input.nextInt();
		System.out.print("请输入b：");
		int b=input.nextInt();
		System.out.println("输入值："+"a="+a+"\tb="+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("输出值："+"a="+a+"\tb="+b);
	}
}