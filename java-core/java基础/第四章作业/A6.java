/*编程实现迷你计算器*/
import java.util.Scanner;
public class A6{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入第一个数");
		double a = input.nextDouble();
		System.out.print("请输入第二个数");
		double b = input.nextDouble();
		System.out.print("输入1进行加法，输入2进行减法，输入3进行乘法，输入4进行除法");
		int c = input.nextInt();
		switch(c){
			case 1:
			System.out.print(a+b);
			break;
			case 2:
			System.out.print(a-b);
			break;
			case 3:
			System.out.print(a*b);
			break;
			case 4:
			System.out.print(a/b);
			break;
			default:
			System.out.print("输入错误");
		}
	}
}
			