/*
6、输入一个 3 位数，分别放入到 3 个变量中去，编程将这 3 个变量中的值交换后输出。比 如输入 123 三个数放入到 a,b,c 中去，最后输出 a,b,c 的值，要求输出 321
*/
import java.util.Scanner;
public class Demo06{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个三位数：");
		int n = input.nextInt();
		int a= n%10;
		int b = n/10%10;
		int c = n/100;
		int x =0;
		if(a<b){
		x=a;a=b;b=x;
		}
		if(a<c){
		x=a;a=c;c=x;
		}
		System.out.print(a+""+b+""+c);
	}
}