/*输入一个小数，然后输出其整数部分和小数部分*/
import java.util.Scanner;
public class Demo08{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个小数：");
		double a=input.nextDouble();
		int b=(int)a;
		double c=a-b;
		System.out.println("小数\t整数部分\t小数部分");
		System.out.println(a+"\t"+b+"\t\t"+c);
	}
}