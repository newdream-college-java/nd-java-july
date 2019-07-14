/*
2.4、输入三个整数，如果这三个整数都相等，那么输出“这三个数相等”。否则再
判断这三个数之和是否大于 1000，如果大于 1000 输出“这三个数之和大于 1000”
否则输出“这三个数之和不大于 1000”。(嵌套 if)
*/
import java.util.Scanner;
public class Demo05{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入第一个整数：");
		int a = input.nextInt();
		System.out.print("请输入第二个整数：");
		int b = input.nextInt();
		System.out.print("请输入第三个整数：");
		int c = input.nextInt();
		int sum = a+b+c;
		if(a == b && b == c){
			System.out.println("这三个数都相等。");
		}
		else if(sum>1000){
			System.out.println("这三个数之和大于1000。");
		}
		else{
			System.out.println("这三个数之和不大于1000.");
		}
	}
}