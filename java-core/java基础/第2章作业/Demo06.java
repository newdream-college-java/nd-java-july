/*输入一个3位数，分别放入到3个变量中去，编程将这3个变量中的值交换后输出*/
import java.util.Scanner;
public class Demo06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个3位数：");
		int i=input.nextInt();
		int a=i/100;
		int b=i/10%10;
		int c=i%10;
		System.out.println("变换前的值："+a+"\t"+b+"\t"+c);
		int temp;
		temp=a;
		a=c;
		c=temp;
		System.out.println("变换后的值："+a+"\t"+b+"\t"+c);
	}
}