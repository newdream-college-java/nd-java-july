/*4、输入两个整数，放入到两个变量 a 与 b 中，编程将 a 与 b 中的值交换，输出。*/
import java.util.*;
public class Demo04{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.print("请输入第一个整数：");
		int a=in.nextInt();
		int b=in.nextInt();
		int temp;
		System.out.println("a="+a+"\t"+"b="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a+"\t"+"b="+b);	
	}
}