/*3、输入一个四位数的整数，要求编程将这个四位数中
的个位，十位，百位，千位分别输出。*/
import java.util.Scanner;
public class demo03{
	public static void main(String []args){
		Scanner input =new Scanner(System.in);
		int a=input.nextInt();
		System.out.println("个位："+a%10);
		System.out.println("十位："+(a/10)%10);
		System.out.println("百位："+(a/100)%10);
		System.out.println("千位："+(a/1000)%10);	
	}
}