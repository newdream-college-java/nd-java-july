/*2.6、编程实现迷你计算器：支持+、-、*、/，从控制台输入 2 个操作数，输出运 算结果。*/
import java.util.Scanner;
public class Work7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入第一个数：");
		int a = sc.nextInt();
		System.out.print("请输入计算方式：");
		char x= sc.next().charAt(0);
		System.out.print("请输入第二个数：");
		int b = sc.nextInt();
		int sum = 0;
		switch(x){
			case '+':
				sum = a+b;
				break;
			case '-':
				sum = a-b;
				break;
			case '*':
				sum = a*b;
				break;
			case '/':
				sum = a/b;
				break;
			default:
				System.out.println("这是什么操作？？？");
		}
		System.out.println("结果为："+sum);
	}
}
