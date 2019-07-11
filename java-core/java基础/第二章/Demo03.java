/*3、输入一个四位数的整数，要求编程将这个四位数中的个位，十位，百位，千位分别输出。*/
import java.util.Scanner;
public class Demo03{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个四位数的整数：");
		int a = input.nextInt();
		int b,c,d,e;

		b=a%10;
		a=(a-b)/10;

		c=a%10;
		a=(a-c)/10;

		d=a%10;
		a=(a-d)/10;

		e=a%10;
		System.out.println("个位数为："+b);
		System.out.println("十位数为："+c);
		System.out.println("百位数为："+d);
		System.out.println("千位数为："+e);
	}
}