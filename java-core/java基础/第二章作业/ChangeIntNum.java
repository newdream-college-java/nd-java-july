/*4、输入两个整数，放入到两个变量 a 与 b 中，编程将 a 与 b 中的值交换，输出。*/
import java.util.Scanner;
public class ChangeIntNum{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入a的值：");
		int a=input.nextInt();
		System.out.print("请输入b的值：");
		int b=input.nextInt();
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("交换后:a="+a+",b="+b);
	}
}