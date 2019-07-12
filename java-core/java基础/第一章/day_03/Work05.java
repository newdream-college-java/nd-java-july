/*2.4、输入三个整数，如果这三个整数都相等，那么输出“这三个数相等”。否则再 判断这三个数之和是否大于 1000，如果大于 1000 输出“这三个数之和大于 1000” 否则输出“这三个数之和不大于 1000”。(嵌套 if)*/
import java.util.Scanner;
public  class Work05{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入三个整数：");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a!=b||b!=c){
			if(a+b+c>100){
				System.out.println("这三个数之和大于 1000");
			}
			else   {
				System.out.println("这三个数之和不大于 1000");
			}
		}else   {
			System.out.println("这三个数相等");
		}
	}
}