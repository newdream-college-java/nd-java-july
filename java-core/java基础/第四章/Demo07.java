/*
2.6、编程实现迷你计算器：支持+、-、*、/，从控制台输入 2 个操作数，输出运
算结果
*/
import java.util.Scanner;
public class Demo07{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("***********迷你计算器**************");
		System.out.println("                     1、加法计算");
		System.out.println("                     2、减法计算");
		System.out.println("                     3、乘法计算 ");
		System.out.println("                     4、除法计算");
		System.out.print("请选择您所需的算法：");
		int n = input.nextInt();
		switch(n){
			case 1:
				System.out.print("请输入第一个数：");
				int a = input.nextInt();
				System.out.print("请输入第二个数：");
				int b = input.nextInt();
				int c  = a+b;
				System.out.println("计算结果为："+c+"。");
				break;
			case 2:
				System.out.print("请输入第一个数：");
				int d = input.nextInt();
				System.out.print("请输入第二个数：");
				int e = input.nextInt();
				int f  = d-e;
				System.out.println("计算结果为："+f+"。");
				break;
			case 3:
				System.out.print("请输入第一个数：");
				int g = input.nextInt();
				System.out.print("请输入第二个数：");
				int h = input.nextInt();
				int i  = g*h;
				System.out.println("计算结果为："+i+"。");
				break;
			case 4:
				System.out.print("请输入第一个数：");
				int x = input.nextInt();
				System.out.print("请输入第二个数：");
				int y = input.nextInt();
				int z  = x/y;
				System.out.println("计算结果为："+z+"。");
				break;
		}
	}
}