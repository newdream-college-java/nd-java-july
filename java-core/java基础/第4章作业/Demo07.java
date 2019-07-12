/*编程实现迷你计算器：支持+、-、*、/，从控制台输入 2 个操作数，输出运
算结果。*/
import java.util.Scanner;
public class Demo07{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入你想要进行的两位数运算：");
		System.out.print("请输入第一个数：");
		double a=input.nextDouble();
		System.out.print("请输入符号：");
		char b=input.next().charAt(0);
		System.out.print("请输入第二个数：");
		double c=input.nextDouble();
		double sum=0;
		switch(b){
			case '+':
			sum=a+c;
			break;
			case '-':
			sum=a-c;
			break;
			case 'x':
			sum=a*c;
			break;
			case '/':
			sum=a/c;
			break;
			default:
			System.out.println("目前只支持加减乘除哦！");
			
		}
		System.out.println("计算的结果为："+sum);
	}
}