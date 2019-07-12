/*2.6、编程实现迷你计算器：支持+、-、*、/，从控制台输入 2 个操作数，输出运
算结果。*/
import java.util.Scanner;
public class demo07{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		System.out.print("输入第一个值：");
		int a=input.nextInt();
		System.out.print("输入运算符：");
		String b=input.next();
		System.out.print("输入第二个值：");
		int c=input.nextInt();
		switch(b){
			case "+":
				System.out.println(a+c);
				break;
			case "-":
				System.out.println(a-c);
				break;
			case "*":
				System.out.println(a*c);
				break;
			case "/":
				System.out.println(a/c);
				break;
			default:
				System.out.println("输入格式错误(应该输入数字 运算符 数字)");
		}
	}
}