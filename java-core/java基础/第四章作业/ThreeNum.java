/*2.4、输入三个整数，如果这三个整数都相等，那么输出“这三个数相等”。否则再 判断这三个数之和是否大于 1000，如果大于 1000 输出“这三个数之和大于 1000” 否则输出“这三个数之和不大于 1000”。(嵌套 if)*/
import java.util.Scanner;
public class ThreeNum{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入三个整数");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		if(a==b&&b==c){
			System.out.println("这三个数相等！");
		}else if(a+b+c>1000){
			System.out.println("这三个数之和大于 1000");
		}else if(a+b+c<=1000){
			System.out.println("这三个数之和小于 1000");
		}
	}
}