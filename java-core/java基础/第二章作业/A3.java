/*输入一个四位数的整数，要求编程将这个四位数中的个位，
十位，百位，千位分别输出。*/
import java.util.Scanner;
public class A3{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("输入一个四位数的整数");
		int a = input.nextInt();
		System.out.println("整数的个位为"+a%10);
		System.out.println("整数的十位为"+a/10%10);
		System.out.println("整数的百位为"+a/100%10);
		System.out.println("整数的千位为"+a/1000);
	}
}