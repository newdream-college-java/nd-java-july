/*8、(挑战题)输入一个小数，然后输出其整数部份和小数部份,格式如下
小数 整数部份 小数部份*/
import java.util.Scanner;
public class demo08{
	public static void main(String []args){
		Scanner input =new Scanner(System.in);
		System.out.println("输入一个小数：");
		double a=input.nextDouble();
		int b=(int)a;
		double c=a-b;
		System.out.println("整数部分："+b);
		System.out.println("小数部分："+c);
	}
}