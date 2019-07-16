/*
2.6、编程实现迷你计算器：支持+、-、*、/，从控制台输入 2 个操作数，输出运 算结果
*/
import java.util.*;
public class Demo07{
	public static void main (String [] args){
		System.out.println("请输入2个数：");
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		System.out.print("请输入操作：");
		String c = input.next();
		switch(c){
			case "+":
			System.out.print(a+b);
			break;
			case "-":
			System.out.print(a-b);
			break;
			case "*":
			System.out.print(a*b);
			break;
			case "/":
			System.out.print(a/b);
			break;
			default:
			System.out.print("你是个憨憨");
			break;
		}
	}
}