/*4、输入两个整数，放入到两个变量 a 与 b 中，编程将 a 与 b 中的值交换，输出。*/
import java.util.Scanner;
public class Work4{
	public static void main(String[] args){
		Scanner x = new Scanner(System.in);
		System.out .print("请输入第一个数字：");
		Int a = x.nextInt);
		System.out .print("请输入第二个数字：");
		int b = x.nextInt();
		int temp;
		temp = a;
		a= b;
		b = temp;
		System.out.println(a+"\t"+b);
	}
}