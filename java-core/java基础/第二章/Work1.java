/*输入两个小数，存入 a,b 中，编程实现 a 与 b 变量中的值交换，
最后输出 a 与 b 中的值。*/
import java.util.Scanner;
public class Work1{
	public static void main(String[] args){
		Scanner x = new Scanner(System.in);
		double a = x.nextDouble();
		double b = x.nextDouble();
		double temp;
		temp = a;
		a= b;
		b = temp;
		System.out.println(a+"\t"+b);
	}
}