/*3、输入一个四位数的整数，要求编程将这个四位数中的个位，十位，百位，千位分别输出。*/
import java.util.Scanner;
public class OutputNum{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a,b,c,d;
		System.out.print("请输入四位数字：");
		int num=input.nextInt();
		a=num%10;
		b=num/10%10;
		c=num/100%10;
		d=num/1000;
		System.out.println("四位数字\t千位\t百位\t十位\t个位");
		System.out.println(num+"\t\t"+d+"\t"+c+"\t"+b+"\t"+a);
	}
}