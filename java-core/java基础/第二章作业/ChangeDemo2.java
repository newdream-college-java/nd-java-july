/*6、输入一个 3 位数，分别放入到 3 个变量中去，编程将这 3 个变量中的值交换后输出。比
如输入 123 三个数放入到 a,b,c 中去，最后输出 a,b,c 的值，要求输出 321。*/
import java.util.Scanner;
public class ChangeDemo2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入a:");
		int a=input.nextInt();
		System.out.print("请输入b:");
		int b=input.nextInt();
		System.out.print("请输入c:");
		int c=input.nextInt();
		a=a+c;
		c=a-c;
		a=a-c;
		System.out.print("a="+a+",b="+b+",c="+c);
	}
}