/*输入一个四位数的整数，要求编程将这个四位数中的个位，十位，百位，千位分别输出*/
import java.util.Scanner;
public class Demo03{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个四位整数：");
		int a=input.nextInt();
		int b=a%10;
		int c=a/10%10;
		int d=a/100%10;
		int e=a/1000;
		System.out.println("个位\t十位\t百位\t千位");
		System.out.println(b+"\t"+c+"\t"+d+"\t"+e);
	}
}