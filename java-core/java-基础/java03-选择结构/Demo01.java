/*编写程序做一个加法计算器
编写程序做一个数字加法器
*/
import java.util.Scanner;
public class Demo01{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//方式一：不够灵活，只能计算2个固定的数之和
		//int a = 7;
		//int b = 8;
		//方式二：扫描仪的方式
		//提示
		System.out.print("请输入第1个整数：");
		int a = input.nextInt();
		System.out.print("请输入第2个整数：");
		int b = input.nextInt();
		int sum =a+b;
		System.out.println(sum);

	}
}